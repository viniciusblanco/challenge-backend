package br.com.bw2.challengeBackendTask1.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.bw2.challengeBackendTask1.model.Order;

@Component
@FeignClient(name = "${api.order.name}", url = "${api.order.url}")
public interface MockyIoOrderClient {

	@RequestMapping(method = RequestMethod.GET, value="/5817803a1000007d01cc7fc9")
	List<Order> getItens ();
}
