package com.core.design.pattern;

public abstract class CarFactory {
	public Car getCar(String carType) {
		return getCarObject(carType);
	}
	public abstract Car getCarObject(String carType);
}
