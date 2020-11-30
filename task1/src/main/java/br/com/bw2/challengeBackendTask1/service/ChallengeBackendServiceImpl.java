package br.com.bw2.challengeBackendTask1.service;

import java.time.LocalDate;
import java.util.ArrayList;
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
	public String getHelloWorld() {
		return "Hello World";
	}
	
	@Override
	public List<Order> get(LocalDate beginDate, LocalDate finalDate) {
		List<Order> itens = new ArrayList<Order>();
		
//		List<Order>itens = mockyIoOrderClient.getItens();
//		System.out.println("Begin Date = " + beginDate);
//		System.out.println("Final Date = " + finalDate);
//		
		try {
			for (Order item : mockyIoOrderClient.getItens()) {
				if (item.getDate().toLocalDate().isAfter(beginDate.minusDays(1)) &&
					item.getDate().toLocalDate().isBefore(finalDate.plusDays(1))) {
					itens.add(item);
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("Ocorreu algum erro, tente novamente mais tarde!!");
		}

		return itens;
	}
}
