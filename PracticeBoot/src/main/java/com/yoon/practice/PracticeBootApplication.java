package com.yoon.practice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackageClasses = PracticeBootApplication.class)
@SpringBootApplication
public class PracticeBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeBootApplication.class, args);
	}

}
