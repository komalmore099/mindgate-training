package com.mindgate.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.mindgate")

@PropertySource("classpath:dbconnection.properties")// annotation for scan the properties file that is security
public class ApplicationConfig
{
	@Autowired
	Environment environment;//It will read all properties from .properties file and send someone i.e.datasource
	
	@Bean
	DataSource dataSource()
	{
		DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();//this object will store the properties accessed from environment.
		driverManagerDataSource.setUrl(environment.getProperty("url"));
		driverManagerDataSource.setUsername(environment.getProperty("user"));
		driverManagerDataSource.setPassword(environment.getProperty("password"));
		driverManagerDataSource.setDriverClassName(environment.getProperty("driver"));
		return driverManagerDataSource;
	}
}
