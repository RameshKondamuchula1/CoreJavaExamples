package com.core.basics;

public class ControlStatements {

	public static void main(String[] args) throws CloneNotSupportedException {
		/*
		 * printForLoop(); printEnhancedForLoop(); printWhileLoop();
		 * printBreakAndContinue(); printSwitchStatement("Ramesh");
		 */
        
        Object controlStatements = new ControlStatements().clone();
        System.out.println(controlStatements);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return "cloning is restricted";
	}

	private static void printSwitchStatement(Integer value) {
		switch(value) {
			case 1 : System.out.println("Ramesh");
		                break;
		    case 2 : System.out.println("Manasa");
                        break;
            default : System.out.println("ITI Colony");
                        break;
					/*
					 * without break statement it executes all the cases. default case is optional.
					 * value can be Number, String or Enum.
					 * Decimal, Long, Double values are not supported till JDK-17.
					 */
		}
		
	}

	private static void printBreakAndContinue() {		
		for (int i = 0; i <= 3; i++) {
			System.out.println("executing taditional for loop for break");
			if (i == 2){
				break;	// Breaks the execution of the loop, Controller moves to down streams
			}
			System.out.println("when i is 2 this loop execution failed i: " + i);
		}
		
		for (int i = 0; i <= 3; i++) {
			System.out.println("executing taditional for loop for continue");
			if (i == 2) {
				continue;// Breaks the execution of the loop only for this iteration, continuous other elements iteration
			}
			System.out.println("when i is 2 this statement wont execute i: " + i);
		}

	}

	private void breakInMethods(String name) {
		if("Mansi".equals(name)){
			// break; //break can only use inside loops or switch conditions.
		}

		if("Mansi".equals(name)){
			//continue; // continue can only use inside loops .
		}



	}

	private static void printWhileLoop() {
		int i = 0;
		while(i < 2) {
			i++;
			System.out.println("executing while loop after condition check");
			//This while loop executes only when the condition is true
		}
		
		 do {
			i++;
			System.out.println("executing do-while before condition check");
			//This while loop executes at least 1 time post that it checks the condition
		 } while(i < 0);
		
	}

	private static void printEnhancedForLoop() {
		String[] values = new String[]{"Ramesh", "Manasa"};
		for (String value: values) {// only works with Arrays and Collections
			System.out.println("executing Enhanced for loop for String array");
		}		
	}

	private static void printForLoop() {		
		for(int i = 0; i <= 2; i++) {
			System.out.println("executing taditional for loop");
		}
	}

}
