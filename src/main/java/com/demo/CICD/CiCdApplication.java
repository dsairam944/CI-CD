package com.demo.CICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class CiCdApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiCdApplication.class, args);
		System.out.println("Hello sai, You are in your main class");
	}
}
