package net.bluedash.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "net.bluedash.ws.HelloService")
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(HelloRequest request) {
		return "Hello, " + request.getWho();
	}

}
