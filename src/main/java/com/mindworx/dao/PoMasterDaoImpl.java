package com.mindworx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.mindworx.model.PoDetail;
import com.mindworx.model.PoMaster;
@Repository
public class PoMasterDaoImpl implements PoMasterDao{

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	@Qualifier("oracelTestDbSource")
	private DataSource oracelTestDbSource;
	@Autowired
	@Qualifier("oracelDbSource")
	private DataSource oracelDbSource;
	
	public final static RowMapper<PoMaster> poMasterMapper = ParameterizedBeanPropertyRowMapper.newInstance(PoMaster.class);
    public final static RowMapper<PoDetail> poDetailMapper = ParameterizedBeanPropertyRowMapper.newInstance(PoDetail.class);
	
    public static final Logger log = Logger.getLogger(PoMasterDaoImpl.class);
    
	@Autowired
    public void dataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	@Override
	public List<PoMaster> getAllPoMaster() {
		List<PoMaster> list = this.jdbcTemplate.query(
		        "SELECT * FROM PO_Master", poMasterMapper);
		return list;
	}

	@Override
	public PoMaster getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createPoMaster(PoMaster poMaster) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePoMaster(PoMaster poMaster) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletePoMaster(long poNo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private static final class PoMasterMapper implements RowMapper<PoMaster> {

	    public PoMaster mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	PoMaster poMaster = new PoMaster();
	    	poMaster.setPoNo(Long.parseLong(rs.getString("po_no")));
	    	poMaster.setRecieptType(rs.getString("recieptType"));
	    	poMaster.setCarrier(rs.getString("carrier"));
	    	poMaster.setSupplier(rs.getString("supplier"));
	    	poMaster.setSupplierOrdNo(rs.getString("supplier_ord_no"));
	    	poMaster.setPoDate(rs.getDate("po_date"));
	    	poMaster.setExpShipDate(rs.getDate("exp_ship_date"));
	    	poMaster.setExpArrivalDate(rs.getDate("exp_arrival_date"));
	    	poMaster.setInstructions1(rs.getString("instructions1"));
	    	poMaster.setInstructions2(rs.getString("instructions2"));
	    	poMaster.setJobNo(rs.getString("job_no"));
	    	poMaster.setHeaderUserField1(rs.getString("header_user_field1"));
	    	poMaster.setShipPoint(rs.getString("ship_point"));
	    	poMaster.setHeaderUserField3(rs.getString("header_user_field3"));
	    	poMaster.setHeaderUserField4(rs.getString("header_user_field4"));
	    	poMaster.setLoadMethod(rs.getString("load_method"));
	    	poMaster.setPickingListFlag(rs.getString("picking_list_flag"));
	    	poMaster.setHeaderUserField7(rs.getString("header_user_field7"));
	    	poMaster.setHeaderUserField8(rs.getString("header_user_field8"));
	    	poMaster.setHeaderUserField9(rs.getString("header_user_field9"));
	    	poMaster.setHeaderUserField10(rs.getString("header_user_field10"));
	        return poMaster;
	    }        
	}
	
	private static final class PoDetailMapper implements RowMapper<PoDetail> {

	    public PoDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	PoDetail poDetail = new PoDetail();
	    	poDetail.setLineNo(rs.getLong("line_no"));
	    	poDetail.setSku(rs.getString("sku"));
	    	poDetail.setOrdQty(rs.getString("ord_qty"));
	    	poDetail.setExpQty(rs.getString("exp_qty"));
	    	poDetail.setSkuStatus(rs.getString("sku_status"));
	    	poDetail.setExpDate(rs.getString("exp_date"));
	    	poDetail.setPackCode(rs.getString("pack_code"));
	    	poDetail.setUom(rs.getString("uom"));
	    	poDetail.setBaseUom(rs.getString("base_uom"));
	    	poDetail.setBaseUomQty(rs.getString("base_uom_qty"));
	    	poDetail.setBatchNo(rs.getString("batch_no"));
	    	poDetail.setUnitCost(rs.getString("unit_cost"));
	    	poDetail.setTotalPrice(rs.getString("total_price"));
	    	poDetail.setLineUserField1(rs.getString("line_user_field1"));
	    	poDetail.setLineUserField2(rs.getString("line_user_field2"));
	    	poDetail.setLineUserField3(rs.getString("line_user_field3"));
	    	poDetail.setLineUserField4(rs.getString("line_user_field4"));
	    	poDetail.setLineUserField5(rs.getString("line_user_field5"));
	    	poDetail.setLineUserField6(rs.getString("line_user_field6"));
	    	poDetail.setLineUserField7(rs.getString("line_user_field7"));
	    	poDetail.setLineUserField8(rs.getString("line_user_field8"));
	    	poDetail.setLineUserField9(rs.getString("line_user_field9"));
	    	poDetail.setLineUserField10(rs.getString("line_user_field10"));
	    	poDetail.setRcvQty(rs.getString("rcv_qty"));
	    	poDetail.setSchArrDate(rs.getDate("sch_arr_date"));
	    	poDetail.setMfgDate(rs.getDate("mfg_date"));
	    	poDetail.setExprDate(rs.getDate("expr_date"));
	    	poDetail.setPoNo(rs.getLong("po_no"));
	        return poDetail;
	    }        
	}

	@Override
	public PoMaster getPoWithDetails(long poNo) {
		return jdbcTemplate.query("select * from po_master, po_details "
                + " where po_master.po_no = po_details.po_no and po_master.po_no = ?", 
                new ResultSetExtractor<PoMaster>() {
            public PoMaster extractData(ResultSet rs) throws SQLException, DataAccessException {
            	PoMaster poMaster = null;
                int row = 0;
                while (rs.next()) {
                    if (poMaster == null) {
                    	poMaster = poMasterMapper.mapRow(rs, row);
                    }
                    poMaster.getDetails().add(poDetailMapper.mapRow(rs, row));
                    row++;
                }
                return poMaster;
            }

        }, poNo);
	}

	@Override
	public List<PoMaster> getAllPoWithDetails() {
		return jdbcTemplate.query("select * from po_master, po_details "
            + " where po_master.po_no = po_details.po_no order by po_master.po_no",
            new ResultSetExtractor<List<PoMaster>>() {
                public List<PoMaster> extractData(ResultSet rs) throws SQLException, DataAccessException {
                    List<PoMaster> list = new ArrayList<PoMaster>();
                    Long poNo = null;
                    PoMaster currentPoMaster = null;
                    int orderIdx = 0;
                    int itemIdx = 0;
                    while (rs.next()) {
                        // first row or when order changes
                        if (currentPoMaster == null || !poNo.equals(rs.getLong("po_no"))) {
                        	poNo = rs.getLong("po_no");
                        	currentPoMaster = poMasterMapper.mapRow(rs, orderIdx++);
                            itemIdx = 0;
                            list.add(currentPoMaster);
                        }
                        currentPoMaster.getDetails().add(poDetailMapper.mapRow(rs, itemIdx++));
                    }
                    return list;
                }
            });
	}

	@Override
	public String getApiDatabaseTable() {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuffer out = new StringBuffer();
		String comma="";
		String sql = "SELECT table_name, owner, tablespace_name FROM all_tables";
		
		try {
			connection = oracelDbSource.getConnection();
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			out.append("[");
			while(rs.next()){				
				out.append(comma+"{\"table_name\":\""+rs.getString(1)+"\",\"owner\":\""+rs.getString(2)+"\",\"tablespace_name\":\""+rs.getString(3)+"\"}");
				comma=",";
			}
			out.append("]");
			rs.close();
			ps.close();
		} catch (SQLException e) {
			log.error("SQLException: " + e.getMessage());
		}
		finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {log.error("SQLException: " + e.getMessage());}
			}
		}
		return out.toString();
	}
	
	@Override
	public String descTable(String name) {
		Connection connection = null;
		StringBuffer out = new StringBuffer();
		try {
			//String sql = "SELECT * FROM GEMSPROD.GEMS_GKE_DOCKET_UPLOAD WHERE DOCKET_NO =125602795";
			//String sql = "SELECT * FROM GEMSPROD.GEMS_MOBILE_LOGIN WHERE STATUS ='V'";
			String sql = "SELECT * FROM "+name;
			connection = oracelDbSource.getConnection();
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnSize = metaData.getColumnCount();
			log.info("No of Column:"+columnSize);
			log.info("..........table DESC.......");
			String[] columns = new String[(columnSize)];
			for (int i = 1; i <= metaData.getColumnCount(); i++) {
				columns[i-1]=metaData.getColumnName(i);
				log.info(""+metaData.getColumnName(i)+"\t"+metaData.getColumnTypeName(i));
			}
			int i=0;
			String c="";
			out.append("[");
			while(rs.next()){
				out.append(c+"{");
				String cc="";
				for (int j = 1; j <= columnSize; j++) {
					out.append(cc+"\""+columns[j-1]+"\":\""+rs.getString(j)+"\"");
					cc=",";
				}
				c=",";
				out.append("}");					
				i++;				
				if(i==500){					
					break;
				}
			}
			out.append("]");
			rs.close();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.error("SQLException: " + e.getMessage());
		}
		finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {log.error("SQLException: " + e.getMessage());}
			}
		}
		return out.toString();
		
	}

	@Override
	public void hardDelete(String no) {
		
		String sql = "DELETE FROM intfstg_inbso WHERE ord_no = '"+no+"'";
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			connection = oracelTestDbSource.getConnection();
			ps = connection.prepareStatement(sql);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.error("SQLException: " + e.getMessage());
		}
		finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {log.error("SQLException: " + e.getMessage());}
			}
		}
	}

}
