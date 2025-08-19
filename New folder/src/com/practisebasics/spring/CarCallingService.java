package com.practisebasics.spring;

public class CarCallingService {
	public Car car;

	public CarCallingService(Car car) {
		this.car = car;
	}
	public void runService() {
		car.run();
	}
	}
