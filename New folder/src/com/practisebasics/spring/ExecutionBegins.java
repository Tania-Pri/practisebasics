package com.practisebasics.spring;

public class ExecutionBegins {

	public static void main(String[] args) {
		Car honda = new Honda();
		Car mercedes = new Mercedes();
		CarCallingService service1 = new CarCallingService(honda);
		CarCallingService service2 = new CarCallingService(mercedes);
		service1.runService();
        service2.runService();
	}

}
