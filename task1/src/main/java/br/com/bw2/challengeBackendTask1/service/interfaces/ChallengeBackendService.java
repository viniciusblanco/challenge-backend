package br.com.bw2.challengeBackendTask1.service.interfaces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bw2.challengeBackendTask1.client.MockyIoOrderClient;
import br.com.bw2.challengeBackendTask1.model.Order;

public interface ChallengeBackendService {
	
	public String getHello();
	
	public List<Order> get();
}
