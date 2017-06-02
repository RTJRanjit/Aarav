package com.rtj.dealer.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.core.env.Environment;

import com.rtj.dealer.dao.HomeDao;

@Repository
@PropertySource(value = { "classpath:application.properties" })
public class HomeDaoImpl implements HomeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private Environment environment;



}
