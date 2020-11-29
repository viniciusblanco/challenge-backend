package br.com.bw2.challengeBackendTask1.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.bw2.challengeBackendTask1.model.Order;
import br.com.bw2.challengeBackendTask1.rest.resource.ChallengeBackendResource;
import br.com.bw2.challengeBackendTask1.service.interfaces.ChallengeBackendService;

@RestController
public class ChallengeBackendContoller implements ChallengeBackendResource {
	
	private ChallengeBackendService challengeBackendService;
	
	public ChallengeBackendContoller(ChallengeBackendService challengeBackendService) {
		this.challengeBackendService = challengeBackendService;
	}
	
	
	public String hello() {
		return challengeBackendService.getHello();
	}
	
//	@Override
	public List<Order> get() {
		List<Order> itens = challengeBackendService.get();
////	public List<?> get(LocalDate beginDate, LocalDate finalDate) {
////		List<Order> itens = challengeBackendService.getItens();
////		List<Order> itens = mockyIoOrderClient.getItens();
//		List<Order> itens = new List<Order>();
		return itens;
	}
}
