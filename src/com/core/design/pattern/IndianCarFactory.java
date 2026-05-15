package com.core.design.pattern;

public class IndianCarFactory extends CarFactory {

	@Override
	public Car getCarObject(String carType) {
		Car carObject = null;

		switch (carType) {

		case "Tata":
			carObject = new TataCars();
			break;
		case "Maruti":
			carObject = new MarutiCars();
			break;
		}

		return carObject;
	}
	
}
