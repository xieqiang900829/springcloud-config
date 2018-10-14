package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		//配置中心-谢强-first_tag
		SpringApplication.run(Application.class, args);
	}
}