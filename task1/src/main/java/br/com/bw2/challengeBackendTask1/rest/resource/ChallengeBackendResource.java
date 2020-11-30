package br.com.bw2.challengeBackendTask1.rest.resource;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.bw2.challengeBackendTask1.model.Order;

public interface ChallengeBackendResource {

	@GetMapping("/")
	String helloWorld();
	
	@GetMapping(value="/challenge-backend/item")
	ResponseEntity<List<Order>> getOrders(LocalDate begindate, LocalDate finaldate);

}	
