package com.mindworx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindworx.model.AsnDetail;
import com.mindworx.model.AsnMaster;
import com.mysql.jdbc.Statement;
@Repository
@Transactional
public class AsnMasterDaoImpl implements AsnMasterDao{
	
	private JdbcTemplate jdbcTemplate;
	public final static RowMapper<AsnMaster> asnMasterMapper = ParameterizedBeanPropertyRowMapper.newInstance(AsnMaster.class);
    public final static RowMapper<AsnDetail> asnDetailMapper = ParameterizedBeanPropertyRowMapper.newInstance(AsnDetail.class);
    
	@Autowired
    public void dataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

	@Override
	public List<AsnMaster> getAllAsnMaster() {
		List<AsnMaster> list = this.jdbcTemplate.query(
		        "SELECT * FROM AsnMaster", new AsnMasterMapper());
		return list;
	}

	@Override
	public AsnMaster getById(long id) {
		AsnMaster asnMaster = this.jdbcTemplate.queryForObject(
		        "SELECT * FROM AsnMaster WHERE id = ?",
		        new Object[]{id},
		        new AsnMasterMapper());
		return asnMaster;
	}

	@Override
	public AsnMaster getByAsnNo(String asnNo) {
		AsnMaster asnMaster = this.jdbcTemplate.queryForObject(
		        "SELECT * FROM AsnMaster WHERE asn_no = ?",
		        new Object[]{asnNo},
		        new AsnMasterMapper());
		return asnMaster;
	}

	@Override
	public int createAsnMaster(final AsnMaster asnMaster) {
		
		GeneratedKeyHolder holder = new GeneratedKeyHolder();
		this.jdbcTemplate.update(new PreparedStatementCreator() {
		    @Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement("INSERT INTO asn_master (asn_no, reciept, carrier, supplier, po_no, asn_date, exp_ship_date, exp_arrival_date, instructions1, instructions2, job_no, header_user_field1, ship_point, header_user_field3, header_user_field4, load_method, picking_list_flag, header_user_field7, header_user_field8, header_user_field9, header_user_field10) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",Statement.RETURN_GENERATED_KEYS);
				ps.setInt(1, asnMaster.getAsnNo());
				ps.setString(2, asnMaster.getReciept());
				ps.setString(3, asnMaster.getCarrier());
				ps.setString(4, asnMaster.getSupplier());
				ps.setString(5, asnMaster.getPoNo());
				ps.setDate(6, new java.sql.Date(asnMaster.getAsnDate().getTime()));
				if (asnMaster.getExpShipDate() == null ) { 
					ps.setDate(7, new java.sql.Date(0000-00-00)); 
		        } else { 
		        	ps.setDate(7, new java.sql.Date(asnMaster.getExpShipDate().getTime()));
		        }
				if (asnMaster.getExpArrivalDate() == null ) { 
					ps.setDate(8, new java.sql.Date(0000-00-00)); 
		        } else { 
		        	ps.setDate(8, new java.sql.Date(asnMaster.getExpArrivalDate().getTime()));
		        }				
				ps.setString(9, asnMaster.getInstructions1());
				ps.setString(10, asnMaster.getInstructions2());
				ps.setString(11, asnMaster.getJobNo());
				ps.setString(12, asnMaster.getHeaderUserField1());
				ps.setString(13, asnMaster.getShipPoint());
				ps.setString(14, asnMaster.getHeaderUserField3());
				ps.setString(15, asnMaster.getHeaderUserField4());
				ps.setString(16, asnMaster.getLoadMethod());
				ps.setString(17, asnMaster.getPickingListFlag());
				ps.setString(18, asnMaster.getHeaderUserField7());
				ps.setString(19, asnMaster.getHeaderUserField8());
				ps.setString(20, asnMaster.getHeaderUserField9());
				ps.setString(21, asnMaster.getHeaderUserField10());
				return ps;
			}
		}, holder);
		final long primaryAsnKey = holder.getKey().longValue();
		
		final List<AsnDetail> list = asnMaster.getDetails();		
		String sql = "INSERT INTO asn_detail (`line_no`,`sku`,`ord_qty`,`exp_qty`,`sku_status`,`exp_date`,`pack_code`,`uom`,`base_uom`,`base_uom_qty`,`batch_no`,`unit_cost`,`total_price`,`line_user_field1`,`line_user_field2`,`line_user_field3`,`line_user_field4`,`line_user_field5`,`line_user_field6`,`line_user_field7`,`line_user_field8`,`line_user_field9`,`line_user_field10`,`rcv_qty`,`sch_arr_date`,`asn_no`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			  jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
				@Override
				public void setValues(PreparedStatement ps, int i) throws SQLException {
					AsnDetail d = list.get(i);
					ps.setInt(1,d.getLineNo());
					ps.setString(2,d.getSku());
					ps.setString(3,d.getOrdQty());
					ps.setString(4,d.getExpQty());
					ps.setString(5,d.getSkuStatus());
					if (d.getExpDate() == null ) { 
						ps.setDate(6, new java.sql.Date(0000-00-00)); 
			        } else { 
			        	ps.setDate(6,new java.sql.Date((d.getExpDate().getTime())));
			        }
					ps.setString(7,d.getPackCode());
					ps.setString(8,d.getUom());
					ps.setString(9,d.getBaseUom());
					ps.setString(10,d.getBaseUomQty());
					ps.setInt(11,d.getBatchNo());
					ps.setString(12,d.getUnitCost());
					ps.setString(13,d.getTotalPrice());
					ps.setString(14,d.getLineUserField1());
					ps.setString(15,d.getLineUserField2());
					ps.setString(16,d.getLineUserField3());
					ps.setString(17,d.getLineUserField4());
					ps.setString(18,d.getLineUserField5());
					ps.setString(19,d.getLineUserField6());
					ps.setString(20,d.getLineUserField7());
					ps.setString(21,d.getLineUserField8());
					ps.setString(22,d.getLineUserField9());
					ps.setString(23,d.getLineUserField10());
					ps.setString(24,d.getRcvQty());
					if (d.getSchArrDate() == null ) { 
						ps.setDate(25, new java.sql.Date(0000-00-00)); 
			        } else { 
			        	ps.setDate(25,new java.sql.Date(d.getSchArrDate().getTime()));
			        }
					ps.setInt(26,(int) primaryAsnKey);
					
				}

				@Override
				public int getBatchSize() {
					return list.size();
				}
			  });
		
		return 0;		
	}

	@Override
	public int updateAsnMaster(final AsnMaster asnMaster) {
		return this.jdbcTemplate.update(
		        "UPDATE AsnMaster SET reciept = ?, carrier = ?, supplier = ?, po_no = ?, asn_date = ?, exp_ship_date = ?, exp_arrival_date = ?, instructions1 = ?, instructions2 = ?, job_no = ?, header_user_field1 = ?, ship_point = ?, header_user_field3 = ?, header_user_field4 = ?, load_method = ?, picking_list_flag = ?, header_user_field7 = ?, header_user_field8 = ?, header_user_field9 = ?, header_user_field10 = ? WHERE asn_no = ?",new PreparedStatementSetter() {
					
					@Override
					public void setValues(PreparedStatement ps) throws SQLException {
						
						ps.setString(1, asnMaster.getReciept());
						ps.setString(2, asnMaster.getCarrier());
						ps.setString(3, asnMaster.getSupplier());
						ps.setString(4, asnMaster.getPoNo());
						ps.setDate(5, new java.sql.Date(asnMaster.getAsnDate().getTime()));
						ps.setDate(6, new java.sql.Date(asnMaster.getExpShipDate().getTime()));
						ps.setDate(7, new java.sql.Date(asnMaster.getExpArrivalDate().getTime()));
						ps.setString(8, asnMaster.getInstructions1());
						ps.setString(9, asnMaster.getInstructions2());
						ps.setString(10, asnMaster.getJobNo());
						ps.setString(11, asnMaster.getHeaderUserField1());
						ps.setString(12, asnMaster.getShipPoint());
						ps.setString(13, asnMaster.getHeaderUserField3());
						ps.setString(14, asnMaster.getHeaderUserField4());
						ps.setString(15, asnMaster.getLoadMethod());
						ps.setString(16, asnMaster.getPickingListFlag());
						ps.setString(17, asnMaster.getHeaderUserField7());
						ps.setString(18, asnMaster.getHeaderUserField8());
						ps.setString(19, asnMaster.getHeaderUserField9());
						ps.setString(20, asnMaster.getHeaderUserField10());
						
						ps.setInt(1, asnMaster.getAsnNo());
					}
				});
	}

	@Override
	public int deleteAsnMaster(String asnNo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private static final class AsnMasterMapper implements RowMapper<AsnMaster> {

	    public AsnMaster mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	AsnMaster asnMaster = new AsnMaster();
	    	asnMaster.setAsnNo(rs.getInt("asn_no"));
	    	asnMaster.setReciept(rs.getString("reciept"));
	    	asnMaster.setCarrier(rs.getString("carrier"));
	    	asnMaster.setSupplier(rs.getString("supplier"));
	    	asnMaster.setPoNo(rs.getString("po_no"));
	    	asnMaster.setAsnDate(rs.getDate("asn_date"));
	    	asnMaster.setExpShipDate(rs.getDate("exp_ship_date"));
	    	asnMaster.setExpArrivalDate(rs.getDate("exp_arrival_date"));
	    	asnMaster.setInstructions1(rs.getString("instructions1"));
	    	asnMaster.setInstructions2(rs.getString("instructions2"));
	    	asnMaster.setJobNo(rs.getString("job_no"));
	    	asnMaster.setHeaderUserField1(rs.getString("header_user_field1"));
	    	asnMaster.setShipPoint(rs.getString("ship_point"));
	    	asnMaster.setHeaderUserField3(rs.getString("header_user_field3"));
	    	asnMaster.setHeaderUserField4(rs.getString("header_user_field4"));
	    	asnMaster.setLoadMethod(rs.getString("load_method"));
	    	asnMaster.setPickingListFlag(rs.getString("picking_list_flag"));
	    	asnMaster.setHeaderUserField7(rs.getString("header_user_field7"));
	    	asnMaster.setHeaderUserField8(rs.getString("header_user_field8"));
	    	asnMaster.setHeaderUserField9(rs.getString("header_user_field9"));
	    	asnMaster.setHeaderUserField10(rs.getString("header_user_field10"));
	        return asnMaster;
	    }        
	}
	
	private static final class AsnDetailMapper implements RowMapper<AsnDetail> {

	    public AsnDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	AsnDetail asnDetail = new AsnDetail();
	    	asnDetail.setLineNo(rs.getInt("line_no"));
	    	asnDetail.setSku(rs.getString("sku"));
	    	asnDetail.setOrdQty(rs.getString("ord_qty"));
	    	asnDetail.setExpQty(rs.getString("exp_qty"));
	    	asnDetail.setSkuStatus(rs.getString("sku_status"));
	    	asnDetail.setPackCode(rs.getString("pack_code"));
	    	asnDetail.setUom(rs.getString("uom"));
	    	asnDetail.setBaseUom(rs.getString("base_uom"));
	    	asnDetail.setBaseUomQty(rs.getString("base_uom_qty"));
	    	asnDetail.setBatchNo(rs.getInt("batch_no"));
	    	asnDetail.setUnitCost(rs.getString("unit_cost"));
	    	asnDetail.setTotalPrice(rs.getString("total_price"));
	    	asnDetail.setLineUserField1(rs.getString("line_user_field1"));
	    	asnDetail.setLineUserField2(rs.getString("line_user_field2"));
	    	asnDetail.setLineUserField3(rs.getString("line_user_field3"));
	    	asnDetail.setLineUserField4(rs.getString("line_user_field4"));
	    	asnDetail.setLineUserField5(rs.getString("line_user_field5"));
	    	asnDetail.setLineUserField6(rs.getString("line_user_field6"));
	    	asnDetail.setLineUserField7(rs.getString("line_user_field7"));
	    	asnDetail.setLineUserField8(rs.getString("line_user_field8"));
	    	asnDetail.setLineUserField9(rs.getString("line_user_field9"));
	    	asnDetail.setLineUserField10(rs.getString("line_user_field10"));
	    	asnDetail.setRcvQty(rs.getString("rcv_qty"));
	    	asnDetail.setSchArrDate(rs.getDate("sch_arr_date"));
	        return asnDetail;
	    }        
	}

	@Override
	public AsnMaster getAsnWithDetails(long asnNo) {
		return jdbcTemplate.query("select * from asn_master, asn_detail "
                + " where asn_master.asn_no = asn_detail.asn_no and asn_master.asn_no = ?", 
                new ResultSetExtractor<AsnMaster>() {
            public AsnMaster extractData(ResultSet rs) throws SQLException, DataAccessException {
            	AsnMaster asnMaster = null;
                int row = 0;
                while (rs.next()) {
                    if (asnMaster == null) {
                    	asnMaster = asnMasterMapper.mapRow(rs, row);
                    }
                    asnMaster.getDetails().add(asnDetailMapper.mapRow(rs, row));
                    row++;
                }
                return asnMaster;
            }

        }, asnNo);
	}

	@Override
	public List<AsnMaster> getAllAsnWithDetails() {
		//"select * from asn_master, asn_detail  where asn_master.asn_no = asn_detail.asn_no order by asn_master.asn_no"
		return jdbcTemplate.query("select * from asn_master, asn_detail  where asn_master.asn_no = asn_detail.asn_no order by asn_master.asn_no",
                new ResultSetExtractor<List<AsnMaster>>() {
                    public List<AsnMaster> extractData(ResultSet rs) throws SQLException, DataAccessException {
                        List<AsnMaster> list = new ArrayList<AsnMaster>();
                        Long asnNo = null;
                        AsnMaster currentAsnMaster = null;
                        int orderIdx = 0;
                        int itemIdx = 0;
                        while (rs.next()) {
                            // first row or when order changes
                            if (currentAsnMaster == null || !asnNo.equals(rs.getLong("asn_no"))) {
                            	
                            	asnNo = rs.getLong("asn_no");
                                currentAsnMaster = asnMasterMapper.mapRow(rs, orderIdx++);
                                itemIdx = 0;
                                list.add(currentAsnMaster);
                            }
                            if(rs.getObject("line_no") != null)
                            currentAsnMaster.getDetails().add(asnDetailMapper.mapRow(rs, itemIdx++));
                        }
                        return list;
                    }
                });
	}

}
