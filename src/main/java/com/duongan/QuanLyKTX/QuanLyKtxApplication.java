package com.duongan.QuanLyKTX;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@ComponentScan(basePackages = {"com.duongan.QuanLyKTX.controller"})
public class QuanLyKtxApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuanLyKtxApplication.class, args);
	}
}
