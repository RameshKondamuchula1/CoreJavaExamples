package com.core.basics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GenericsInJava {

	public static void main(String[] args) {
		
	    List<Integer> listOfInteger = getListFromArray(new Integer[] {1, 4, 2, 3});
	    System.out.println(listOfInteger);
	    
	    List<String> sortedListOfStrings = getSortedListFromArray(new String[] {"Ramesh", "Manasa", "ITI", "Bangalore"});    
	    System.out.println(sortedListOfStrings);
	    
	    Integer[] intArray = {4, 2, 1, 5, 3};
	    List<String> listOfSortedIntegerStrings = getConvertedSortList(intArray, Object::toString);
	    System.out.println(listOfSortedIntegerStrings);
    
	    List<Integer> listOfUpperBound = getNumberList(intArray); 
	    System.out.println(listOfUpperBound);
	    
	    Double[] doubleArray = new Double[] {(double) 247, (double) 56, (double) 896, (double) 125};
	    List<? extends CharSequence> listOfUpperBoundWithWild = getStringUpperBoundListWithWildCard(doubleArray, Object::toString);
	    System.out.println(listOfUpperBoundWithWild);

	    List<? super CharSequence> listOfUpperBoundWithWildSuper = getStringLowerBoundListWithWildCard(doubleArray, Object::toString);
	    System.out.println(listOfUpperBoundWithWildSuper);
	}

	public static <T> List<T> getListFromArray(T[] obejct) {
		return Arrays.stream(obejct).collect(Collectors.toList());
	}
	
	public static <T> List<T> getSortedListFromArray(T[] obejct) {
		return Arrays.stream(obejct).sorted().collect(Collectors.toList());
	}
	//with functions
	public static <T, G> List<G> getConvertedSortList(T[] a, Function<T, G> mappedFunction) {
		return Arrays.stream(a).map(mappedFunction).collect(Collectors.toList());
	}
	
	//Upper-bound
	public static <T extends Number> List<T> getNumberList(T[] a) {
		return Arrays.stream(a).sorted().collect(Collectors.toList());
	}
	
	//Upper-bound with wild card(?) with functions
	public static <T extends Number, G> List<? extends CharSequence> getStringUpperBoundListWithWildCard(T[] a, Function<T, G> mappedFunction) {
		return (List<? extends CharSequence>) Arrays.stream(a).sorted().map(mappedFunction).collect(Collectors.toList());
	}
	
	//lower-bound with wild card(?) and super key word
	public static <T extends Number> List<? super T> getStringLowerBoundList(T[] a) {
		return Arrays.stream(a).sorted().collect(Collectors.toList());
	}

	//lower-bound with wild card(?) and super key word with functions
	public static <T extends Number, G> List<? super CharSequence> getStringLowerBoundListWithWildCard(T[] a, Function<T, G> mappedFunction) {
		return Arrays.stream(a).sorted().map(mappedFunction).collect(Collectors.toList());
	}
	
	/*
	  Generics are mainly used for type-safety in java. With Generics we can guarantee the type.
	  Using Generics, it is possible to create classes that work with different data types.
	  An entity such as class, interface, or method that operates on a parameterized type is a generic entity.
	*/
}
