package com.himedia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.himedia.jdbc.util.JDBCConnectionManager;

//@Configuration
public class BoardConfiguration {

//	@Bean //못가져오게 처리(프로퍼티에서 이미 설정한걸로 가는거)
	public JDBCConnectionManager getJDBCConnectionManager() {
		JDBCConnectionManager manager = new JDBCConnectionManager();
		manager.setDriverClass("org.h2.Driver");
		manager.setUrl("jdbc:h2:tcp://localhost/~/test");
		manager.setUsername("sa");
		manager.setPassword("");
		return manager;
	}

}
