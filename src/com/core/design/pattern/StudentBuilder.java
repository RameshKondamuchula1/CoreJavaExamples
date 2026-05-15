package com.core.design.pattern;

public class StudentBuilder {

	private String name;
	private String rollNumber;
	
	public static Builder builder() {
		return new Builder();
	}
		
	public String getName() {
		return name;
	}

	public String getRollNumber() {
		return rollNumber;
	}


	public StudentBuilder(Builder builder) {
		this.name = builder.name;
		this.rollNumber = builder.rollNumber;
	}
	
	public static class Builder {
		private String name;
		private String rollNumber;
		
		public Builder addName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder addRollNumber(String rollNumber) {
			this.rollNumber = rollNumber;
			return this;
		}
		
		public StudentBuilder build() {
			return new StudentBuilder(this);
		}		
	}
}
