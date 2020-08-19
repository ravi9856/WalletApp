package com.assignment.walletpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.assignment"}, useDefaultFilters = false)
//@EnableJpaRepositories(basePackages = {"com.assignment.repository"})
public class WalletPayApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletPayApplication.class, args);
	}

}
