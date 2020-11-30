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
	public List<Order> getOrders(LocalDate beginDate, LocalDate finalDate) {
		List<Order> orderResponse = new ArrayList<Order>();
				
		try {
			for (Order item : mockyIoOrderClient.getItens()) {
				if (item.getDate().toLocalDate().isAfter(beginDate.minusDays(1)) &&
					item.getDate().toLocalDate().isBefore(finalDate.plusDays(1))) {
					orderResponse.add(item);
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("Ocorreu um erro, tente novamente mais tarde!!");
		}

		return orderResponse;
	}
}
