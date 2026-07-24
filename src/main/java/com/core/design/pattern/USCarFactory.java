package com.core.design.pattern;

public class USCarFactory extends CarFactory {
	
	@Override
	public Car getCarObject(String carType) {
		
		Car carObject = null;

		switch (carType) {
		case "Toyota":
			carObject = new TotyotaCar();
			break;
		case "Chevrlot":
			carObject = new Cheverlotcar();
			break;
		}

		return carObject;
	}
}
