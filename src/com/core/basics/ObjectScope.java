package com.core.basics;

public class ObjectScope {
	
	

	public static void main(String[] args) {
		
        //Access
		/*
		 * private --> within the class 
		 * default --> within the class, sub-class, non sub-class of same package but not accessible in different package 
		 * protected --> within the class, sub-class, non sub-class of same package, sub-class in
		 *               different package but not in non subclass of different package
		 * public --> accessible anywhere
		 */
		
		
	    //Scope
		/*
		 * class --> accessible anywhere in the classs
		 * method --> only accessible within that method 
		 * control statements --> only accessible within that control statements 
		 * loops --> only accessible within that control loops
		 */

		//
		//Original Scope		Can change to...							Cannot change to...
		//private	       		Anything (Technically "Method Hiding")			N/A
		//default				protected, public								private
		//protected				public											default, private
		//public				Nothing (Must stay public)						protected, default, private
		//

		//private -> default -> protected -> public
		//We can increase the scope but we can not decrease the scope

	}

}
