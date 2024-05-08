package com.example.magicvalue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MagicValueApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagicValueApplication.class, args);
	}

}
