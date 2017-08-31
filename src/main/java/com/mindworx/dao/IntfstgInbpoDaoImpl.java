package com.mindworx.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.mindworx.model.AsnTrackingRequest;
import com.mindworx.model.IntfstgInbpo;
import com.mindworx.model.PoDetail;
import com.mindworx.model.PoHead;
import com.mindworx.model.PoLine;
import com.mindworx.model.PoMaster;
import com.mindworx.model.SoHead;

@Repository
public class IntfstgInbpoDaoImpl implements IntfstgInbpoDao {

	protected Log log = LogFactory.getLog(this.getClass());
	private JdbcTemplate jdbcTemplate;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

	@Autowired
	public void dataSource(@Qualifier("oracelTestDbSource") DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public final static RowMapper<IntfstgInbpo> intfstgInbpoMapper = ParameterizedBeanPropertyRowMapper
			.newInstance(IntfstgInbpo.class);

	@Override
	public List<IntfstgInbpo> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IntfstgInbpo getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(final IntfstgInbpo obj) {
		String query = "INSERT INTO intfstg_inbpo (po_date,po_no,sku,sku_status,ord_qty,packcode,batch_no,unit_cost,uom_id,line_no,sch_arrival_date) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		return jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setDate(1, new Date(obj.getPoDate().getTime()));
				ps.setString(2, obj.getPoNo());
				ps.setString(3, obj.getSku());
				ps.setString(4, obj.getSkuStatus());
				ps.setInt(5, obj.getOrdQty());
				ps.setInt(6, obj.getPackcode());
				ps.setString(7, obj.getBatchNo());
				ps.setInt(8, obj.getUnitCost());
				ps.setString(9, obj.getUomId());
				ps.setString(10, obj.getLineNo());
				ps.setDate(11, new Date(obj.getSchArrivalDate().getTime()));
				return ps.execute();
			}
		});
	}

	@Override
	public boolean update(IntfstgInbpo intfstgInbpo) {

		return false;
	}

	@Override
	public void create(final PoHead obj) {
		String sql = "INSERT INTO intfstg_inbpo (po_no,po_date,supp_name,ordline_no,sku,sku_status,batch_no,ord_qty,packcode,uom_id,unit_cost) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

		final List<PoLine> list = obj.getLines();
		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				PoLine d = list.get(i);
				ps.setString(1, obj.getPoNo());
				ps.setString(2, sdf.format(obj.getPoDate()));
				ps.setString(3, obj.getSuppName());
				ps.setInt(4, d.getLineNo());
				ps.setString(5, d.getSku());
				ps.setString(6, d.getSkuStatus());
				ps.setString(7, d.getBatchNo());
				ps.setInt(8, d.getOrdQty());
				ps.setString(9, d.getPackcode());
				ps.setString(10, d.getUomId());
				ps.setFloat(11, d.getUnitCost());

			}

			@Override
			public int getBatchSize() {

				return list.size();
			}

		});

	}

	@Override
	public PoHead getPoHead(String po_no) {
		PoHead poHead = null;
		try {
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(
					"SELECT po_no,po_date,supp_name,ordline_no,sku,sku_status,batch_no,ord_qty,packcode,uom_id,unit_cost FROM intfstg_inbpo WHERE po_no = ?",
					new Object[] { po_no });
			for (Map<?, ?> row : rows) {
				if (poHead == null) {
					poHead = new PoHead();
					poHead.setPoNo((String) (row.get("po_no")));
					poHead.setPoDate(sdf.parse((String) (row.get("po_date"))));
					poHead.setSuppName((String) (row.get("supp_name")));

				}
				PoLine poLine = new PoLine();
				log.debug(row.get("sku").toString());
				if (row.get("ordline_no") != null)
					poLine.setLineNo(Integer.parseInt(row.get("ordline_no").toString()));
				poLine.setSku((String) (row.get("sku")));
				poLine.setSkuStatus((String) (row.get("sku_status")));
				poLine.setBatchNo((String) (row.get("batch_no")));
				if (row.get("ord_qty") != null)
					poLine.setOrdQty(Integer.parseInt(row.get("ord_qty").toString()));
				poLine.setPackcode((String) (row.get("packcode")));
				poLine.setUomId((String) (row.get("uom_id")));
				if (row.get("unit_cost") != null)
					poLine.setUnitCost(Float.parseFloat(row.get("unit_cost").toString()));
				poHead.getLines().add(poLine);
			}

		} catch (DataAccessException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return poHead;
	}

	@Override
	public long getCountByDate(AsnTrackingRequest trackingRequest) {
		String sql = "SELECT count(*) FROM intfstg_inbpo WHERE TO_DATE(po_date,'dd-mm-yyyy') BETWEEN ? AND ?";
		long count = 0;
		try {
			count = jdbcTemplate
					.queryForObject(sql,
							new Object[] { new Date(trackingRequest.getStartDate().getTime()),
									new Date(trackingRequest.getEndDate().getTime())},
							Long.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;

	}

	@Override
	public long getCountByPoNo(AsnTrackingRequest trackingRequest) {
		String sql = "SELECT count(*) FROM intfstg_inbpo WHERE po_no LIKE '" + trackingRequest.getPoNo() + "%'";
		long count = 0;
		try {
			count = jdbcTemplate.queryForObject(sql, Long.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public long getCountByInvNo(AsnTrackingRequest trackingRequest) {
		String sql = "SELECT count(*) FROM intfstg_inbpo WHERE po_no LIKE '" + trackingRequest.getPoNo() + "%'";
		long count = 0;
		try {
			count = jdbcTemplate.queryForObject(sql, Long.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public long getCountByBatch(AsnTrackingRequest trackingRequest) {
		String sql = "SELECT count(*) FROM intfstg_inbpo WHERE batch_no LIKE '" + trackingRequest.getPoNo() + "%'";
		long count = 0;
		try {
			count = jdbcTemplate.queryForObject(sql, Long.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public long getCountBySku(AsnTrackingRequest trackingRequest) {
		String sql = "SELECT count(*) FROM intfstg_inbpo WHERE sku LIKE '" + trackingRequest.getSku() + "%'";
		long count = 0;
		try {
			count = jdbcTemplate.queryForObject(sql, Long.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public List<PoHead> getAllByDate(int offset, int limit, String orderByCol, String sortOrder,
			AsnTrackingRequest trackingRequest) {

		return jdbcTemplate.query("select * from intfstg_inbpo WHERE TO_DATE(po_date,'dd-mm-yyyy') BETWEEN ? AND ?",
				new Object[] { new Date(trackingRequest.getStartDate().getTime()), new Date(trackingRequest.getEndDate().getTime() + 1 * 24 * 60 * 60 * 1000) },
				new ResultSetExtractor<List<PoHead>>() {
					public List<PoHead> extractData(ResultSet rs) throws SQLException, DataAccessException {
						List<PoHead> list = new ArrayList<PoHead>();
						String poNo = null;
						PoHead currentPoHead = null;
						while (rs.next()) {
							log.debug(rs.getString("po_no"));
							try {
								if (currentPoHead == null || !poNo.equals(rs.getString("po_no"))) {
									poNo = rs.getString("po_no");
									currentPoHead = new PoHead();
									currentPoHead.setPoNo(rs.getString("po_no"));									
									currentPoHead.setPoDate(sdf.parse(rs.getString("po_date")));
									currentPoHead.setSuppName(rs.getString("supp_name"));
									if (rs.getString("sch_arrival_date") != null)
									currentPoHead.setSchArrivalDate(sdf.parse(rs.getString("sch_arrival_date")));
									log.debug(currentPoHead.toString());
									list.add(currentPoHead);
								}
								PoLine poLine = new PoLine();
								poLine.setLineNo(Integer.parseInt(rs.getString("ordline_no").toString()));
								poLine.setSku((String) (rs.getString("sku")));
								poLine.setSkuStatus((String) (rs.getString("sku_status")));
								poLine.setBatchNo((String) (rs.getString("batch_no")));
								if (rs.getString("ord_qty") != null)
									poLine.setOrdQty(Integer.parseInt(rs.getString("ord_qty").toString()));
								poLine.setPackcode((String) (rs.getString("packcode")));
								poLine.setUomId((String) (rs.getString("uom_id")));
								if (rs.getString("unit_cost") != null)
									poLine.setUnitCost(Float.parseFloat(rs.getString("unit_cost").toString()));
								currentPoHead.getLines().add(poLine);
							} catch (ParseException e) {
								e.printStackTrace();
							}
						}
						return list;
					}
				});
	}

	@Override
	public List<PoHead> getAllByPoNo(int offset, int limit, String orderByCol, String sortOrder,
			AsnTrackingRequest trackingRequest) {
		return jdbcTemplate.query(
				"select * from intfstg_inbpo" + " WHERE TO_DATE(po_date,'yyyy/mm/dd') BETWEEN ? AND ?",
				new ResultSetExtractor<List<PoHead>>() {
					public List<PoHead> extractData(ResultSet rs) throws SQLException, DataAccessException {
						List<PoHead> list = new ArrayList<PoHead>();
						String poNo = null;
						PoHead currentPoHead = null;
						int orderIdx = 0;
						int itemIdx = 0;
						while (rs.next()) {
							// first row or when order changes
							if (currentPoHead == null || !poNo.equals(rs.getString("po_no"))) {
								poNo = rs.getString("po_no");
								itemIdx = 0;
								list.add(currentPoHead);
							}
						}
						return list;
					}
				});
	}

	@Override
	public List<PoHead> getAllByInvNo(int offset, int limit, String orderByCol, String sortOrder,
			AsnTrackingRequest trackingRequest) {
		return null;
	}

	@Override
	public List<PoHead> getAllByBatch(int offset, int limit, String orderByCol, String sortOrder,
			AsnTrackingRequest trackingRequest) {
		return jdbcTemplate.query(
				"select * from intfstg_inbpo" + " WHERE TO_DATE(po_date,'yyyy/mm/dd') BETWEEN ? AND ?",
				new ResultSetExtractor<List<PoHead>>() {
					public List<PoHead> extractData(ResultSet rs) throws SQLException, DataAccessException {
						List<PoHead> list = new ArrayList<PoHead>();
						String poNo = null;
						PoHead currentPoHead = null;
						int orderIdx = 0;
						int itemIdx = 0;
						while (rs.next()) {
							// first row or when order changes
							if (currentPoHead == null || !poNo.equals(rs.getString("po_no"))) {
								poNo = rs.getString("po_no");
								itemIdx = 0;
								list.add(currentPoHead);
							}
						}
						return list;
					}
				});
	}

	@Override
	public List<PoHead> getAllBySku(int offset, int limit, String orderByCol, String sortOrder,
			AsnTrackingRequest trackingRequest) {
		return jdbcTemplate.query("select * from intfstg_inbpo" + " WHERE sku LIKE '" + trackingRequest.getSku() + "%'",
				new ResultSetExtractor<List<PoHead>>() {
					public List<PoHead> extractData(ResultSet rs) throws SQLException, DataAccessException {
						List<PoHead> list = new ArrayList<PoHead>();
						String poNo = null;
						PoHead currentPoHead = null;
						int orderIdx = 0;
						int itemIdx = 0;
						while (rs.next()) {
							// first row or when order changes
							if (currentPoHead == null || !poNo.equals(rs.getString("po_no"))) {
								poNo = rs.getString("po_no");
								itemIdx = 0;
								list.add(currentPoHead);
							}
						}
						return list;
					}
				});
	}

	@Override
	public <T> long getCount(AsnTrackingRequest<T> asnTrackingRequest) {
		String sql = "SELECT count(*) FROM intfstg_inbpo";
		long count = 0;
		try {
			count = jdbcTemplate.queryForObject(sql, Long.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public List<PoHead> getPoNoList(java.util.Date fromDate, java.util.Date toDate) {
		return jdbcTemplate.query("SELECT DISTINCT po_no,po_date,supp_name from intfstg_inbpo WHERE TO_DATE(po_date,'dd-mm-yyyy') BETWEEN ? AND ?",
				new Object[] { new Date(fromDate.getTime()), new Date(toDate.getTime() + 1 * 24 * 60 * 60 * 1000) },
				new ResultSetExtractor<List<PoHead>>() {
					public List<PoHead> extractData(ResultSet rs) throws SQLException, DataAccessException {
						List<PoHead> list = new ArrayList<PoHead>();
						while (rs.next()) {
							log.debug(rs.getString("po_no"));
							PoHead poHead = new PoHead();
							poHead.setPoNo(rs.getString("po_no"));
							try {
								poHead.setPoDate(sdf.parse(rs.getString("po_date")));
							} catch (ParseException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							poHead.setSuppName(rs.getString("supp_name"));
							list.add(poHead);							
						}
						return list;
					}
				});
	}

	/*
	 * private class PoHeadMapper implements RowMapper<PoHead> {
	 * 
	 * public PoHead mapRow(ResultSet rs, int rowNum) throws SQLException {
	 * PoHead poHead = new PoHead(); try {
	 * poHead.setPoNo(rs.getString("po_no"));
	 * poHead.setPoDate(sdf1.parse((rs.getString("po_date"))));
	 * poHead.setSuppName(rs.getString("supp_name"));
	 * poHead.setSchArrivalDate(sdf1.parse((rs.getString("sch_arrival_date"))));
	 * } catch (ParseException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * return poHead; }
	 * 
	 * } private class PoLineMapper implements RowMapper<PoLine> {
	 * 
	 * public PoLine mapRow(ResultSet rs, int rowNum) throws SQLException {
	 * PoLine poLine = new PoLine();
	 * poLine.setLineNo(Integer.parseInt(rs.getString("ordline_no").toString()))
	 * ; poLine.setSku((String)(rs.getString("sku")));
	 * poLine.setSkuStatus((String)(rs.getString("sku_status")));
	 * poLine.setBatchNo((String)(rs.getString("batch_no")));
	 * if(rs.getString("ord_qty")!=null)
	 * poLine.setOrdQty(Integer.parseInt(rs.getString("ord_qty").toString()));
	 * poLine.setPackcode((String)(rs.getString("packcode")));
	 * poLine.setUomId((String)(rs.getString("uom_id")));
	 * if(rs.getString("unit_cost")!=null)
	 * poLine.setUnitCost(Float.parseFloat(rs.getString("unit_cost").toString())
	 * ); return poLine; } }
	 */

}
