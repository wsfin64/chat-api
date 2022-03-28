package br.com.wsfin64.apichat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ApiChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiChatApplication.class, args);
	}

}
