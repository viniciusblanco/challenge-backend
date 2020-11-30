package br.com.bw2.challengeBackendTask1.rest.resource;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.bw2.challengeBackendTask1.model.Order;

public interface ChallengeBackendResource {

	@GetMapping("/")
	public String helloWorld();

	@GetMapping(value="/challenge-backend/item")
	public List<Order> get( @RequestParam("begindate") @DateTimeFormat(pattern="dd-MM-yyyy") LocalDate begindate,
							@RequestParam("finaldate") @DateTimeFormat(pattern="dd-MM-yyyy") LocalDate finaldate);
//	public List<Order> get();

}	
