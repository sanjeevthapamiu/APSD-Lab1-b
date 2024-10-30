package edu.miu.apsd.model;

import java.time.LocalDate;

public class Employee {

    private long employeeId;
    private String firstName;
    private String lastName;
    private LocalDate employmentDate;
    private float yearlySalary;
    private PensionPlan pensionPlan;

    public Employee() {}

    public Employee(long employeeId, String firstName, String lastName, LocalDate employmentDate, float yearlySalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentDate = employmentDate;
        this.yearlySalary = yearlySalary;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    public float getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(float yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public PensionPlan getPensionPlan() {
        return pensionPlan;
    }

    public void setPensionPlan(PensionPlan pensionPlan) {
        this.pensionPlan = pensionPlan;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employmentDate=" + employmentDate +
                ", yearlySalary=" + yearlySalary +
                ", pensionPlan=" + pensionPlan +
                '}';
    }

    public String toJson() {
        return String.format("{\"employeeId\": %s, \"firstName\": %s, \"lastName\": %s, \"employmentDate\": %s, \"yearlyDate\": %s, \"pensionPlan\": %s}",
                employeeId, firstName, lastName, employmentDate, yearlySalary, pensionPlan != null ? pensionPlan.toJson() : null);
    }
}
