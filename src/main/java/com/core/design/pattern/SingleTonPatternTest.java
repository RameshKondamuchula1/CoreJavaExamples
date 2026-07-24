package com.core.design.pattern;

public class SingleTonPatternTest {

	public static void main(String[] args) {
		
		String v1 = "Ram";
		String v3 = "Ram";
		
		String v2 = new String("Ram");
		

		
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println(v3.toString());
		
		System.out.println(v1.equals(v2));
		
		System.out.println(v1 == v2);
		System.out.println(v1 == v3);
		
		
		System.out.println("===============");
		try {
		SingleTon singleTon1 = SingleTon.getObject();
		
		SingleTon singleTon2 = SingleTon.getObject();
		
		SingleTon singleTon3 = SingleTon.getObject();
		
        SingleTon2 singleTon12 = SingleTon2.getObject();
		
		SingleTon2 singleTon22 = SingleTon2.getObject();
		
		SingleTon2 singleTon32 = SingleTon2.getObject();
		
		System.out.println(singleTon1.hashCode());
		System.out.println(singleTon2.hashCode());
		System.out.println(singleTon3.hashCode());
		//int i = 1/0;
		//System.exit(0);

		System.out.println(singleTon12.hashCode());
		System.out.println(singleTon22.hashCode());
		System.out.println(singleTon32.hashCode());
		
		//Builder pattern test
		StudentBuilder student = StudentBuilder.builder().addName("Manasa").addRollNumber("60725").build();
		
		System.out.println(student.getName());
		System.out.println(student.getRollNumber());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally block executed");
		}
	}

}
