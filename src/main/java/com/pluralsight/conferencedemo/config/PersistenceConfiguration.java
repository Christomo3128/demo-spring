package com.pluralsight.conferencedemo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfiguration {

//	@Value("${DB_URL}")
//	private String Urldb;
//	
//	@Bean
//	public DataSource dataSource() {
//		DataSourceBuilder builder = DataSourceBuilder.create();
//		builder.url(Urldb);
//		builder.username("postgres");
//		builder.password("admin");
//		System.out.println("Datasource personalizado esta funcionando.");
//		return builder.build();
//	}
//	
}
