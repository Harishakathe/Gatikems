package com.mindworx.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import com.mindworx.model.VtsData;
@Repository
public class VtsDataDaoImpl implements VtsDataDao{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
    public void dataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

	@Override
	public List<VtsData> getAllVtsData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VtsData getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createVtsData(final VtsData d) {
		
		String query = "INSERT INTO vts_data(`vehicleNumber`,`currentlocationaddress`,`currentlocationlatitude`,`currentlocationlongitude`,`currentignitionStatus`,`currenttemperature`,`CurrentCompressor`,`currentspeed`,`currenttimestamp`,`created_on`)"
				+ " values(?,?,?,?,?,?,?,?,?,?)";  
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
	    	@Override
		    public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setString(1,d.getVehicleNumber());  
				ps.setString(2,d.getCurrentLocationAddress());
				ps.setDouble(3,d.getCurrentLocationLatitude());
				ps.setDouble(4,d.getCurrentLocationLongitude());
				ps.setString(5,d.getCurrentIgnitionStatus());
				ps.setDouble(6,d.getCurrentTemperature());
				ps.setString(7,d.getCurrentCompressor());
				ps.setInt(8,d.getCurrentSpeed()); 
				ps.setString(9,d.getCurrentTimestamp());
				long time = d.getCreatedOn().getTime();
				ps.setTimestamp(10,new Timestamp(time));
		        return ps.execute(); 
			}  
		});
	}
	@Override
	public void insertBatch(final List<VtsData> list){

		  String sql = "INSERT INTO vts_data " +
			"(`vehicleNumber`, `currentlocationaddress`, `currentlocationlatitude`, `currentlocationlongitude`, `currentignitionStatus`, `currenttemperature`, `CurrentCompressor`, `currentspeed`, `currenttimestamp`,`created_on`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		  jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				VtsData d = list.get(i);
				ps.setString(1,d.getVehicleNumber());  
				ps.setString(2,d.getCurrentLocationAddress());
				ps.setDouble(3,d.getCurrentLocationLatitude());
				ps.setDouble(4,d.getCurrentLocationLongitude());
				ps.setString(5,d.getCurrentIgnitionStatus());
				ps.setDouble(6,d.getCurrentTemperature());
				ps.setString(7,d.getCurrentCompressor());
				ps.setInt(8,d.getCurrentSpeed()); 
				ps.setString(9,d.getCurrentTimestamp());
				long time = d.getCreatedOn().getTime();
				ps.setTimestamp(10,new Timestamp(time));
			}

			@Override
			public int getBatchSize() {
				return list.size();
			}
		  });
		}
}
