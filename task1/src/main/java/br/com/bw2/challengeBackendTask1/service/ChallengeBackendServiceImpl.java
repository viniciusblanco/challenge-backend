package br.com.bw2.challengeBackendTask1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bw2.challengeBackendTask1.client.MockyIoOrderClient;
import br.com.bw2.challengeBackendTask1.model.Order;
import br.com.bw2.challengeBackendTask1.service.interfaces.ChallengeBackendService;

@Service
public class ChallengeBackendServiceImpl implements ChallengeBackendService {

	private MockyIoOrderClient mockyIoOrderClient;
	
	@Autowired
	public ChallengeBackendServiceImpl(MockyIoOrderClient mockyIoOrderClient) {
		this.mockyIoOrderClient = mockyIoOrderClient;
	}
	
	@Override
	public String getHello() {
		return "Hello";
	}
	
	@Override
	public List<Order> get() {
		return mockyIoOrderClient.getItens();
	}
}
