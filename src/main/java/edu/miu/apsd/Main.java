package edu.miu.apsd;

import edu.miu.apsd.model.Employee;
import edu.miu.apsd.model.PensionPlan;
import edu.miu.apsd.service.EmployeeService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee(12345L, "Daniel", "Agar", LocalDate.of(2018,1,17), 105_945.50F);
        employee.setPensionPlan(new PensionPlan("EX1089", LocalDate.of(2023, 1, 17), 100F));
        employees.add(employee);

        employee = new Employee(23456L, "Benard", "Shaw", LocalDate.of(2019,4,3), 197_750F);
        employees.add(employee);

        employee = new Employee(34567L, "Carly", "Agar", LocalDate.of(2014,5,16), 1_555.50F);
        employee.setPensionPlan(new PensionPlan("SM2307", LocalDate.of(2014, 11, 4),  1_555.5F));
        employees.add(employee);

        employee = new Employee(45678L, "Wesley", "Schneider", LocalDate.of(2019,10,2), 74_500F);
        employees.add(employee);

        System.out.println("---Employees Sorted in Last Names and Yearly Salaries---");
        System.out.println(employeeService.employeesWithSortedLastNameAndYearlySalary(employees));

        System.out.println("\n---Monthly Upcoming Enrolls---");
        System.out.println(employeeService.monthlyUpcomingEnrolls(employees));
    }

}