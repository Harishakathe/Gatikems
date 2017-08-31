package com.mindworx.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import oracle.jdbc.pool.OracleDataSource;

@Component
@PropertySource("classpath:config.properties")
public class DataConfig {
	
	@Autowired
	private Environment env;
	public static final Logger log = Logger.getLogger(DataConfig.class);
	
	@Bean(name = "dataSource")
    public DataSource getDataSource() {
		log.info("url:"+env.getProperty("jdbc.url")+" user:"+env.getProperty("jdbc.user")+" password:"+env.getProperty("jdbc.password"));
		BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(env.getProperty("jdbc.driverClassName"));
        ds.setUsername(env.getProperty("jdbc.user"));
        ds.setPassword(env.getProperty("jdbc.password"));
        ds.setUrl(env.getProperty("jdbc.url"));
        ds.addConnectionProperty("rewriteBatchedStatements", "true");
        return ds;
    }
	
	@Bean(name = "oracelDbSource")
    public DataSource getOracelDbSource() {
		log.info("oracelDbSource url:"+env.getProperty("oracle.db.url")+" user:"+env.getProperty("oracle.db.user")+" password:"+env.getProperty("oracle.db.password"));
		OracleDataSource dataSource = null;
		try {
			dataSource = new OracleDataSource();
			dataSource.setURL(env.getProperty("oracle.db.url"));
	        dataSource.setUser(env.getProperty("oracle.db.user"));
	        dataSource.setPassword(env.getProperty("oracle.db.password"));
			dataSource.setImplicitCachingEnabled(true);
	        dataSource.setFastConnectionFailoverEnabled(true);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return dataSource;        
    }
	
	@Bean(name = "oracelTestDbSource")
    public DataSource getOracelTastDbSource() {
		log.info("oracelDbSource url:"+env.getProperty("oracle.testdb.url")+" user:"+env.getProperty("oracle.testdb.user")+" password:"+env.getProperty("oracle.testdb.password"));
		OracleDataSource dataSource = null;
		try {
			dataSource = new OracleDataSource();
			dataSource.setURL(env.getProperty("oracle.testdb.url"));
	        dataSource.setUser(env.getProperty("oracle.testdb.user"));
	        dataSource.setPassword(env.getProperty("oracle.testdb.password"));
			dataSource.setImplicitCachingEnabled(true);
	        dataSource.setFastConnectionFailoverEnabled(true);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return dataSource;        
    }
	

	/*@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}*/
}
