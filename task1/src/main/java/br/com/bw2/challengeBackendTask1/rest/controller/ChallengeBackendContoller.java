package br.com.bw2.challengeBackendTask1.rest.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.bw2.challengeBackendTask1.model.Order;
import br.com.bw2.challengeBackendTask1.rest.resource.ChallengeBackendResource;
import br.com.bw2.challengeBackendTask1.service.interfaces.ChallengeBackendService;

@RestController
public class ChallengeBackendContoller implements ChallengeBackendResource {
	
	private ChallengeBackendService challengeBackendService;
	
	@Autowired
	public ChallengeBackendContoller(ChallengeBackendService challengeBackendService) {
		this.challengeBackendService = challengeBackendService;
	}
		
	@Override
	public ResponseEntity<List<Order>> getOrders( @RequestParam("begindate") @DateTimeFormat(pattern="dd-MM-yyyy") LocalDate begindate,
								 					@RequestParam("finaldate") @DateTimeFormat(pattern="dd-MM-yyyy") LocalDate finaldate) {
		return ResponseEntity.ok().body(challengeBackendService.getOrders(begindate, finaldate));
	}
}
