package com.mindworx.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.mindworx.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	private JdbcTemplate jdbcTemplate;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
    public void dataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	@Override
	public List<User> getAll() {
		return null;
	}

	@Override
	public User getById(long id) {
		return null;
	}

	@Override
	public boolean create(final User user) {
		boolean result;
		String query = "INSERT INTO users(`username`,`password`,`first_name`,`last_name`,`email`)"
				+ " values(?,?,?,?,?)";  
		result = jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
	    	@Override
		    public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setString(1,user.getUsername());  
				ps.setString(2,passwordEncoder.encode(user.getPassword()));
				ps.setString(3,user.getFirstName());
				ps.setString(4,user.getLastName());
				ps.setString(5,user.getEmail());				
				return ps.execute(); 
			}  
		});
		
		String query11 = "INSERT INTO user_roles(`username`,`user_role`)"
					+ " values(?,?)";  
			result = jdbcTemplate.execute(query11,new PreparedStatementCallback<Boolean>(){  
		    	@Override
			    public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
					ps.setString(1,user.getUsername());  
					ps.setString(2,"ROLE_USER");					
					return ps.execute(); 
				}  
			});
		return result;
	}

	@Override
	public boolean update(User user) {
		return false;
	}

	@Override
	public User getByName(String userName) {
		String sql = "SELECT u.username,u.password "
                + " FROM users u WHERE u.username = ? ";
 
        Object[] params = new Object[] { userName };
        try {
            User user = jdbcTemplate.queryForObject(sql, params, new UserMapper());
            return user;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
	}

	@Override
	public List<String> getUserRoles(String userName) {
		String sql = "Select r.user_role "//
                + " from user_roles r where r.username = ? ";
         
        Object[] params = new Object[] { userName };
         
        List<String> roles = jdbcTemplate.queryForList(sql,params, String.class);
         
        return roles;
	}
	
	private static final class UserMapper implements RowMapper<User> {

	    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	    	User user = new User();
	    	user.setUsername(rs.getString("username"));
	    	user.setPassword(rs.getString("password"));
	        return user;
	    }        
	}

	@Override
	public User getByEmail(String email) {
		String sql = "SELECT u.email "
                + " FROM users u WHERE u.email = ? ";
 
        Object[] params = new Object[] { email };
        try {
            User user = jdbcTemplate.queryForObject(sql, params, new UserMapper());
            return user;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
	}

}
