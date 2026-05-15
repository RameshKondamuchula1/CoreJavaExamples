package com.core.design.pattern;

public class FactoryMethodDesignPattern {

	public static void main(String[] args) {
		System.out.println(getCarObjectFactoryDesignPatter("Tata"));
		System.out.println(getCarObjectAbstractFactoryDesignPatter("India", "Maruti"));
		//StudentBulder studentBulder = new StudentBulder(Builder.builder().setName(null).build());
	}

	private static Car getCarObjectFactoryDesignPatter(String car) {

		/*
		 * Factory Method Design Pattern define an interface for creating an object, but
		 * let subclass decide which class to instantiate. Factory Method lets a class
		 * defer instantiation to subclass.
		 */

		Car carObject = null;

		switch (car) {

		case "Tata":
			carObject = new TataCars();
			break;
		case "Maruti":
			carObject = new MarutiCars();
			break;
		case "Toyota":
			carObject = new TotyotaCar();
			break;
		case "Chevrlot":
			carObject = new Cheverlotcar();
			break;
		}

		return carObject;
	}
	
	private static Car getCarObjectAbstractFactoryDesignPatter(String country, String carType) {
		//Abstract Factory Pattern is a way of organizing how you create groups of things that are related to each other
		//Abstract Factory pattern is almost similar to Factory Pattern and is considered as another layer of abstraction
		// over factory pattern.
		//Abstract Factory patterns work around a super-factory which creates other factories.
		return AbstractFactory.getCarObject(country, carType);
	}
}
