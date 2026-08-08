package com.java.examples.test;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	String department;
	int age;
	double salary;

	public Employee(int id, String name, String department, int age, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return this.name + " " + this.id + " " +  this.age + " " + this.salary + " " + this.department;
	}
}

public class EmployeeProcessor {
public static void main(String[] args) {         
	List<Employee> employees = Arrays.asList(
			new Employee(1, "Alice", "HR", 25, 50000),
			new Employee(2, "Bob", "IT", 30, 70000),
			new Employee(3, "Charlie", "HR", 28, 60000),
			new Employee(4, "David", "IT", 35, 80000),
			new Employee(5, "Eve", "Finance", 29, 65000),
			new Employee(3, "Charlie", "HR", 28, 60000));

	// Filter employees by age < 30        List<Employee> filtered = new ArrayList<>();         for (Employee e : employees) {             if (e.age < 30) {                 filtered.add(e);            }        }         
	// Group by department        Map<String, List<Employee>> grouped = new HashMap<>();         for (Employee e : filtered) {             grouped.computeIfAbsent(e.department, k -> new ArrayList<>()).add(e);         }         
	// Sort within each department by salaryfor
	// (List<Employee> group : grouped.values()) {
	// Collections.sort(group, new Comparator<Employee>() {
	// @Overridepublic int compare(Employee e1, Employee e2) {
	// return Double.compare(e1.salary, e2.salary); } }); }

	// Calculate total salary per department Map<String, Double> totalSalaryByDept = new HashMap<>();
	// for (Map.Entry<String, List<Employee>> entry : grouped.entrySet()) { double total = 0;
	// for (Employee e : entry.getValue()) { total += e.salary; } totalSalaryByDept.put(entry.getKey(), total); }
	// Print resultsfor (Map.Entry<String, Double> entry : totalSalaryByDept.entrySet()) { System.out.println("Department: " + entry.getKey() + ", Total Salary: " + entry.getValue()); } } }

	// Filter employees by age < 30
	employees.stream().filter(e ->e.getAge()>30).forEach(System.out::println);

	// Group by department
	employees.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet()
			.forEach(System.out::println);


	// Sort within each department by salary Descending order
	 employees.stream()
			.collect(Collectors.groupingBy(Employee::getDepartment))
			.values() // Gets the Collection<List<Employee>>
			.forEach(empList -> {
				empList.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
				System.out.println(empList);
			});


	// Calculate total salary per department
	employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
					Collectors.summarizingDouble(Employee::getSalary)))
			.entrySet().forEach(System.out::println);

	// EvenIds and Odd Ids
	//Approach 1
	employees.stream()
			.sorted(Comparator.comparingInt((Employee e) -> e.getId() % 2) // Even (0) comes before Odd (1)
					.thenComparingInt(Employee::getId))// Then sort numerically within those groups
			.map(Employee::getId)
			.distinct().forEach(System.out::println);

	//Approach 2
	var partitioned = employees.stream()
			.collect(Collectors.partitioningBy(e -> e.getId() % 2 == 0));

	List<Employee> result = new ArrayList<>(partitioned.get(true)); // Evens
	result.addAll(partitioned.get(false));
	result.stream().map(Employee::getId)
			.distinct().forEach(System.out::println);
}
}