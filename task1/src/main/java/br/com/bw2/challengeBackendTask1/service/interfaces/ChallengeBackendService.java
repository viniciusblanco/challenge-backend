package br.com.bw2.challengeBackendTask1.service.interfaces;

import java.time.LocalDate;
import java.util.List;

import br.com.bw2.challengeBackendTask1.model.Order;

public interface ChallengeBackendService {

	List<Order> getOrders(LocalDate beginDate, LocalDate finalDate);
	
}
