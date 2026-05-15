package com.core.design.pattern;

public abstract class Car {

	public String engine;
	public String gears;
	public String fuel;
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getGears() {
		return gears;
	}
	public void setGears(String gears) {
		this.gears = gears;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
}
