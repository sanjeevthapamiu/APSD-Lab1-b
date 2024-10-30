package edu.miu.apsd.service;

import edu.miu.apsd.model.Employee;

import java.time.LocalDate;
import java.util.List;

public class EmployeeService {

    public String employeesWithSortedLastNameAndYearlySalary(List<Employee> employees) {
        StringBuilder listJson = new StringBuilder("[");

        employees.stream()
                .sorted((Employee e1, Employee e2) -> Float.compare(e2.getYearlySalary(), e1.getYearlySalary()))
                .sorted((Employee e1, Employee e2) -> e1.getLastName().compareTo(e2.getLastName()))
                .forEach((Employee emp) -> listJson.append("\n\t").append(emp.toJson()).append(","));

        listJson.setLength(listJson.length() - 1);
        listJson.append("\n]");

        return listJson.toString();
    }

    public String monthlyUpcomingEnrolls(List<Employee> employees) {
        StringBuilder listJson = new StringBuilder("[");

        LocalDate firstDayOfNextMonth = LocalDate.now().plusMonths(1).withDayOfMonth(1);
        LocalDate lastDayOfNextMonth = firstDayOfNextMonth.withDayOfMonth(firstDayOfNextMonth.lengthOfMonth());

        employees.stream()
                .filter((Employee emp) -> emp.getPensionPlan() == null)
                .filter((Employee emp) -> emp.getEmploymentDate().plusYears(5).isBefore(lastDayOfNextMonth))
//                .filter((Employee emp) -> emp.getEmploymentDate().plusYears(5).isAfter(firstDayOfNextMonth))
                .sorted((Employee e1, Employee e2) -> e1.getEmploymentDate().compareTo(e2.getEmploymentDate()))
                .forEach((Employee emp) -> listJson.append("\n\t").append(emp.toJson()).append(","));

        listJson.setLength(listJson.length() - 1);
        listJson.append("\n]");

        return listJson.toString();
    }

}
