package com.mindworx.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import com.mindworx.model.ViewZoneTemperatureDetails;

@Repository
public class ViewZoneTemperatureDetailsDaoImpl implements ViewZoneTemperatureDetailsDao{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
    public void dataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

	@Override
	public List<ViewZoneTemperatureDetails> getAll() {
		List<ViewZoneTemperatureDetails> list = null;
		try {
			list = jdbcTemplate.query("SELECT * FROM view_zonetemperature_details", new BeanPropertyRowMapper<ViewZoneTemperatureDetails>(ViewZoneTemperatureDetails.class));
		} catch (DataAccessException e) { 
			e.printStackTrace(); 
		}
		return list;
	}

	@Override
	public ViewZoneTemperatureDetails getById(long id) {
		ViewZoneTemperatureDetails obj = null;
		try {
			obj = jdbcTemplate.queryForObject("SELECT * FROM view_zonetemperature_details WHERE id = ?", new Object[]{id}, new BeanPropertyRowMapper<ViewZoneTemperatureDetails>(ViewZoneTemperatureDetails.class));
		} catch (DataAccessException e) { 
			e.printStackTrace(); 
		}
		return obj;
	}

	@Override
	public boolean create(final ViewZoneTemperatureDetails obj) {
		String query = "INSERT INTO view_zonetemperature_details(`company_id`,`company_name`,`site_id`,`site_name`,`device_id`,`zone_id`,`temperature_id`,`temperature_name`,`temperature_value`,`minimum_value`,`maximum_value`,`temperature_date_time`)"
				+ " values(?,?,?,?,?,?,?,?,?,?,?,?)";  
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
	    	@Override
		    public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setString(1,obj.getCompanyId());  
				ps.setString(2,obj.getCompanyName());
				ps.setString(3,obj.getSiteId());
				ps.setString(4,obj.getSiteName());
				ps.setString(5,obj.getDeviceId());
				ps.setString(6,obj.getZoneId());
				ps.setString(7,obj.getTemperatureId());
				ps.setString(8,obj.getTemperatureName()); 
				ps.setString(9,obj.getTemperatureValue());
				ps.setString(9,obj.getMinimumValue());
				ps.setString(9,obj.getMaxmumValue());
				long time = obj.getTemperatureDateTime().getTime();
				ps.setTimestamp(10,new Timestamp(time));
		        return ps.execute(); 
			}  
		});
	}

	@Override
	public boolean update(final ViewZoneTemperatureDetails obj) {
		String query = "UPDATE view_zonetemperature_details SET `company_id`=?,`company_name`=?,`site_id`=?,`site_name`=?,`device_id`=?,`zone_id`=?,`temperature_id`=?,`temperature_name`=?,`temperature_value`=?,`minimum_value`=?,`maximum_value`=?,`temperature_date_time`=? WHERE id = ? "
				+ " values(?,?,?,?,?,?,?,?,?,?,?,?)";  
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
	    	@Override
		    public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setString(1,obj.getCompanyId());  
				ps.setString(2,obj.getCompanyName());
				ps.setString(3,obj.getSiteId());
				ps.setString(4,obj.getSiteName());
				ps.setString(5,obj.getDeviceId());
				ps.setString(6,obj.getZoneId());
				ps.setString(7,obj.getTemperatureId());
				ps.setString(8,obj.getTemperatureName()); 
				ps.setString(9,obj.getTemperatureValue());
				ps.setString(9,obj.getMinimumValue());
				ps.setString(9,obj.getMaxmumValue());
				long time = obj.getTemperatureDateTime().getTime();
				ps.setTimestamp(10,new Timestamp(time));
		        return ps.execute(); 
			}  
		});
	}
}
