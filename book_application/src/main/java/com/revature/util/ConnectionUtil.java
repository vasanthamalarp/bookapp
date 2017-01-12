package com.revature.util;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionUtil {
	public static DataSource getDatasource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUsername("dev_user");
		ds.setPassword("dev_pwd");
		ds.setUrl("jdbc:mysql://139.59.29.57:3306/training_db");
		return ds;
	}

	public static JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDatasource());
		return jdbcTemplate;
	}
}
