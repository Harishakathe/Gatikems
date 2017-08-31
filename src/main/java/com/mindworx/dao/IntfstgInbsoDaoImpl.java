package com.mindworx.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.mindworx.config.SecurityConfig;
import com.mindworx.model.IntfstgInbso;
import com.mindworx.model.PoHead;
import com.mindworx.model.PoLine;
import com.mindworx.model.SoHead;
import com.mindworx.model.SoLine;

@Repository
public class IntfstgInbsoDaoImpl implements IntfstgInbsoDao{
	
	private JdbcTemplate jdbcTemplate;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	public static final Logger log = Logger.getLogger(IntfstgInbsoDaoImpl.class);
	
	@Autowired
    public void dataSource(@Qualifier("oracelTestDbSource") DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

	@Override
	public List<IntfstgInbso> getAll() {
		List<IntfstgInbso> list = null;
		try {
			list = jdbcTemplate.query("SELECT * FROM intfstg_inbso", new BeanPropertyRowMapper<IntfstgInbso>(IntfstgInbso.class));
		} catch (DataAccessException e) { 
			e.printStackTrace(); 
		}
		return list;
	}

	@Override
	public IntfstgInbso getById(long id) {
		IntfstgInbso obj = null;
		try {
			obj = jdbcTemplate.queryForObject("SELECT * FROM intfstg_inbso WHERE id = ?", new Object[]{id}, new BeanPropertyRowMapper<IntfstgInbso>(IntfstgInbso.class));
		} catch (DataAccessException e) { 
			e.printStackTrace(); 
		}
		return obj;
	}

	@Override
	public void create(final IntfstgInbso obj) {
		String query = "INSERT INTO intfstg_inbso (ord_no,ord_date,order_type,consignee_id,consignee_name,carrier_id,carrier_type,shipto_addr1,shipto_addr2,shipto_addr3,shipto_city,shipto_state,shipto_country,shipto_zip,reqdate,sku,sku_status,batch_no,ord_qty,packcode,uom_id,unit_price) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";  
		jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
	    	@Override
		    public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setString(1,obj.getOrdNo());
				ps.setDate(2,new java.sql.Date(obj.getOrdDate().getTime()));
				ps.setString(3,obj.getOrderType());
				ps.setString(4,obj.getConsigneeId());
				ps.setString(5,obj.getConsigneeName());
				ps.setString(6,obj.getCarrierId());
				ps.setString(7,obj.getCarrierType());
				ps.setString(8,obj.getShiptoAddr1());
				ps.setString(9,obj.getShiptoAddr2());
				ps.setString(10,obj.getShiptoAddr3());
				ps.setString(11,obj.getShiptoCity());
				ps.setString(12,obj.getShiptoState());
				ps.setString(13,obj.getShiptoCountry());
				ps.setString(14,obj.getShiptoZip());
				ps.setDate(15,new java.sql.Date(obj.getReqdate().getTime()));
				ps.setString(16,obj.getSku());
				ps.setString(17,obj.getSkuStatus());
				ps.setString(18,obj.getBatchNo());
				ps.setInt(19,obj.getOrdQty());
				ps.setString(20,obj.getPackcode());
				ps.setString(21,obj.getUomId());
				ps.setInt(22,obj.getUnitPrice());
		        return ps.execute(); 
			}  
		});
	}
	
	
	@Override
	public void create(final SoHead obj) {
		final List<SoLine> list = obj.getLines();
		String sql = "INSERT INTO intfstg_inbso " +
				"(ord_no,ord_date,order_type,consignee_id,carrier_id,carrier_type,shipto_addr1,shipto_addr2,shipto_addr3,shipto_city,shipto_state,shipto_country,shipto_zip,ordline_no,sku,sku_status,batch_no,ord_qty,packcode,uom_id,unit_price,consignee_name) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			  jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {

				@Override
				public void setValues(PreparedStatement ps, int i) throws SQLException {
					SoLine d = list.get(i);
					ps.setString(1,obj.getOrdNo());
					ps.setString(2,sdf.format(obj.getOrdDate()));
					ps.setString(3,obj.getOrderType());
					ps.setString(4,obj.getConsigneeId());
					ps.setString(5,obj.getCarrierId());
					ps.setString(6,obj.getCarrierType());
					ps.setString(7,obj.getShiptoAddr1());
					ps.setString(8,obj.getShiptoAddr2());
					ps.setString(9,obj.getShiptoAddr3());
					ps.setString(10,obj.getShiptoCity());
					ps.setString(11,obj.getShiptoState());
					ps.setString(12,obj.getShiptoCountry());
					ps.setString(13,obj.getShiptoZip());
					ps.setInt(14,d.getOrdlineNo());
					ps.setString(15,d.getSku());
					ps.setString(16,d.getSkuStatus());
					ps.setString(17,d.getBatchNo());
					ps.setInt(18,d.getOrdQty());
					ps.setString(19,d.getPackcode());
					ps.setString(20,d.getUomId());
					ps.setFloat(21,d.getUnitPrice());
					ps.setString(22,obj.getConsigneeName());
				}

				@Override
				public int getBatchSize() {
					return list.size();
				}
			  });
	}

	@Override
	public void update(IntfstgInbso intfstgInbso) {
		
	}

	@Override
	public SoHead getSoHead(String so_no) {
		SoHead soHead = null;
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList("SELECT ord_no,ord_date,order_type,consignee_id,consignee_name,carrier_id,carrier_type,shipto_addr1,shipto_addr2,shipto_addr3,shipto_city,shipto_state,shipto_country,shipto_zip,sch_date,ordline_no,sku,sku_status,batch_no,ord_qty,packcode,uom_id,unit_price FROM intfstg_inbso WHERE ord_no = ?",new Object[] { so_no });
			for (Map<?, ?> row : rows) {
				if(soHead == null){
					soHead = new SoHead();
					soHead.setOrdNo((String)(row.get("ord_no")));
					if(row.get("ord_date")!=null)
					soHead.setOrdDate(sdf.parse((String)(row.get("ord_date"))));
					soHead.setOrderType((String)(row.get("order_type")));
					soHead.setConsigneeId((String)(row.get("consignee_id")));
					soHead.setConsigneeName((String)(row.get("consignee_name")));
					soHead.setCarrierId((String)(row.get("carrier_id")));
					soHead.setCarrierType((String)(row.get("carrier_type")));
					soHead.setShiptoAddr1((String)(row.get("shipto_addr1")));
					soHead.setShiptoAddr2((String)(row.get("shipto_addr2")));
					soHead.setShiptoAddr3((String)(row.get("shipto_addr3")));
					soHead.setShiptoCity((String)(row.get("shipto_city")));
					soHead.setShiptoState((String)(row.get("shipto_state")));
					soHead.setShiptoCountry((String)(row.get("shipto_country")));
					soHead.setShiptoZip((String)(row.get("shipto_zip")));
					if(row.get("sch_date")!=null)
					soHead.setSchDate(sdf.parse((String)(row.get("sch_date"))));
				}
				SoLine soLine = new SoLine();
				if(row.get("ordline_no")!=null)
				soLine.setOrdlineNo(Integer.parseInt(row.get("ordline_no").toString()));
				soLine.setSku((String)(row.get("sku")));
				soLine.setSkuStatus((String)(row.get("sku_status")));
				soLine.setBatchNo((String)(row.get("batch_no")));
				if(row.get("ord_qty")!=null)
				soLine.setOrdQty(Integer.parseInt(row.get("ord_qty").toString()));
				soLine.setPackcode((String)(row.get("packcode")));
				soLine.setUomId((String)(row.get("uom_id")));
				if(row.get("unit_price")!=null)
				soLine.setUnitPrice(Float.parseFloat(row.get("unit_price").toString()));
				soHead.getLines().add(soLine);				
			}			
			
		} catch (DataAccessException e) { 
			e.printStackTrace(); 
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return soHead;
	}

	@Override
	public List<SoHead> getSoNoList(Date fromDate, Date toDate) {
		return jdbcTemplate.query("SELECT DISTINCT ord_no,ord_date,order_type,consignee_id,consignee_name from intfstg_inbso WHERE TO_DATE(ord_date,'dd-mm-yyyy') BETWEEN ? AND ?",
				new Object[] { new Date(fromDate.getTime()), new Date(toDate.getTime() + 1 * 24 * 60 * 60 * 1000) },
				new ResultSetExtractor<List<SoHead>>() {
					public List<SoHead> extractData(ResultSet rs) throws SQLException, DataAccessException {
						List<SoHead> list = new ArrayList<SoHead>();
						while (rs.next()) {
							log.debug(rs.getString("ord_no"));
							SoHead soHead = new SoHead();
							soHead.setOrdNo(rs.getString("ord_no"));
							try {
								soHead.setOrdDate(sdf.parse(rs.getString("ord_date")));
							} catch (ParseException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							soHead.setOrderType(rs.getString("order_type"));
							soHead.setConsigneeId(rs.getString("consignee_id"));
							soHead.setConsigneeName(rs.getString("consignee_name"));
							list.add(soHead);							
						}
						return list;
					}
				});
	}

}
