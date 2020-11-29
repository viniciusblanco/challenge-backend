package br.com.bw2.challengeBackendTask1.rest.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import br.com.bw2.challengeBackendTask1.model.Order;

public interface ChallengeBackendResource {

	@GetMapping("/")
	public String hello();

	@GetMapping(value="/challenge-backend/item")
	public List<Order> get();
//	public List<?> get(@RequestParam("begindate") Date beginDate, @RequestParam("finalDate") Date finalDate);
}	
