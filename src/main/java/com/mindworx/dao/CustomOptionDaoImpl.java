package com.mindworx.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.mindworx.model.CustomOption;
@Repository
public class CustomOptionDaoImpl implements CustomOptionDao {
	
	private JdbcTemplate jdbcTemplateProd;
	private JdbcTemplate jdbcTemplate;
	
	private Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
    public void setDataSource(@Qualifier("oracelTestDbSource") DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	@Autowired
    public void setDataSourceProd(@Qualifier("oracelDbSource") DataSource dataSource) {
        this.jdbcTemplateProd = new JdbcTemplate(dataSource);
    }
	
	@Override
	public List<CustomOption> getSkuByCompId(String compId) {
		String sql = "SELECT DISTINCT SKU FROM VIEW_MAST_SKU WHERE COMP_ID = ?";
		return jdbcTemplateProd.query(sql, new Object[] { new String(compId) },
				new ResultSetExtractor<List<CustomOption>>() {
					public List<CustomOption> extractData(ResultSet rs) throws SQLException, DataAccessException {
						List<CustomOption> list = new ArrayList<CustomOption>();
						while (rs.next()) {
							CustomOption option = new CustomOption();
							option.setId(rs.getString("SKU"));
							option.setText(rs.getString("SKU"));
							list.add(option);
						}
						return list;
					}
				});		
	}
	@Override
	public List<CustomOption> getUomByCompId(String compId) {
		String sql = "SELECT DISTINCT SKU FROM VIEW_MAST_SKU WHERE COMP_ID = ?";
		return jdbcTemplateProd.query(sql, new Object[] { new String(compId) },
				new ResultSetExtractor<List<CustomOption>>() {
					public List<CustomOption> extractData(ResultSet rs) throws SQLException, DataAccessException {
						List<CustomOption> list = new ArrayList<CustomOption>();
						while (rs.next()) {
							CustomOption option = new CustomOption();
							option.setId(rs.getString("SKU"));
							option.setText(rs.getString("SKU"));
							list.add(option);
						}
						return list;
					}
				});
	}

}
