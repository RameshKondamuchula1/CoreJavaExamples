package com.core.design.pattern;

public class AbstractFactory {
	
	
	public static Car getCarObject(String country, String carType) {
		Car carObject = null;

		switch (country) {

		case "India":
			carObject = new IndianCarFactory().getCar(carType);
			break;
		case "US":
			carObject = new USCarFactory().getCar(carType);
			break;
		
		}
		return carObject;
	}
}
