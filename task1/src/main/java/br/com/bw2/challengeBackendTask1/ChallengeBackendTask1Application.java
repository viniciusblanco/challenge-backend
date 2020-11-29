package br.com.bw2.challengeBackendTask1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ChallengeBackendTask1Application {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeBackendTask1Application.class, args);
	}

}
