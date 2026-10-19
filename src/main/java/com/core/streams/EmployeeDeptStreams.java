package com.core.streams;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDeptStreams {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Ramesh", "Developer", Double.valueOf(150000));
        Employee emp2 = new Employee(2, "Manasa", "HR", Double.valueOf(82000));
        Employee emp3 = new Employee(3, "Meenakshi", "HR", Double.valueOf(74000));
        Employee emp4 = new Employee(4, "Arup", "Developer", Double.valueOf(150000));
        Employee emp5 = new Employee(5, "Shubhi", "HR", Double.valueOf(65000));
        Employee emp6 = new Employee(6, "Swapnil", "DM", Double.valueOf(256000));
        Employee emp7 = new Employee(7, "Srini", "DM", Double.valueOf(233000));
        Employee emp8 = new Employee(8, "Sudharshan", "Developer", Double.valueOf(150000));
        Employee emp9 = new Employee(9, "Deepa", "HR", Double.valueOf(45000));
        Employee emp10 = new Employee(10, "Akhil", "Marketing", Double.valueOf(185000));
        Employee emp11 = new Employee(11, "Kinnera", "Marketing", Double.valueOf(130000));
        Employee emp12 = new Employee(12, "Kinnera", "Marketing", Double.valueOf(120000));

        List<Employee> employees = List.of(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10, emp11, emp12);

        System.out.println("Avg Salary per department: " + avgSalaryPerDepartment(employees));

        System.out.println("Highest paid employee per department: " + highestPaidEmployeesPerDepartment(employees));

        System.out.println("Top 3 paid employees: " + topHighestPaidEmployees(employees, 3));

        System.out.println("Top 2nd paid employee: " + topSecondHighestPaidEmployees(employees));

        System.out.println("Sort employee  by salary: " + sortEmployeesBySalary(employees));

        System.out.println("Department wise count: " + departmentWiseCount(employees));

        System.out.println("Department wise Names: " + departmentWiseNames(employees));

        System.out.println("EmployeeId and Names: " + employeeIdAndNameMapping(employees));

        System.out.println("Duplicate Employee name with highest salary: " + employeeNameHighestSalary(employees));

    }

    public static Map<String, Double> avgSalaryPerDepartment(List<Employee> employees) {
        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
    }

    public static Map<String, Optional<Employee>> highestPaidEmployeesPerDepartment(List<Employee> employees) {
        return employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
    }

    public static List<Employee> topHighestPaidEmployees(List<Employee> employees, int top) {
        return employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(top).toList();
    }

    public static Employee topSecondHighestPaidEmployees(List<Employee> employees) {
        return employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).limit(1).findAny().orElse(null);
    }

    public static List<Employee> sortEmployeesBySalary(List<Employee> employees) {
        return employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed().thenComparing(Employee::getName)).toList();
    }

    public static Map<String, Long> departmentWiseCount(List<Employee> employees) {
        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
    }

    public static Map<String, List<String>> departmentWiseNames(List<Employee> employees) {
        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
    }

    public static Map<Integer, String> employeeIdAndNameMapping(List<Employee> employees) {
        return employees.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
    }

    public static Map<String, Double> employeeNameHighestSalary(List<Employee> employees) {
        return employees.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary, Math::max));
    }


    static class Employee {
        private Integer id;
        private String name;
        private String department;
        private Double salary;

        public Employee() {
        }

        public Employee(Integer id, String name, String department, Double salary) {
            this.salary = salary;
            this.department = department;
            this.name = name;
            this.id = id;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }
}
