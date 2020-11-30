package br.com.bw2.challengeBackendTask1.rest.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	
	public String helloWorld() {
		return challengeBackendService.getHelloWorld();
	}
	
	
	@Override
	public List<Order> get(LocalDate beginDate, LocalDate finalDate) {
		List<Order> itens = challengeBackendService.get(beginDate, finalDate);
		return itens;
	}
}
