package edu.miu.apsd.model;

import java.time.LocalDate;

public class PensionPlan {

    private String planReferenceNumber;
    private LocalDate enrollmentDate;
    private float monthlyContribution;

    public PensionPlan() {}

    public PensionPlan(String planReferenceNumber, LocalDate enrollmentDate, float monthlyContribution) {
        this.planReferenceNumber = planReferenceNumber;
        this.enrollmentDate = enrollmentDate;
        this.monthlyContribution = monthlyContribution;
    }

    public String getPlanReferenceNumber() {
        return planReferenceNumber;
    }

    public void setPlanReferenceNumber(String planReferenceNumber) {
        this.planReferenceNumber = planReferenceNumber;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public float getMonthlyContribution() {
        return monthlyContribution;
    }

    public void setMonthlyContribution(float monthlyContribution) {
        this.monthlyContribution = monthlyContribution;
    }

    @Override
    public String toString() {
        return "PensionPlan{" +
                "planReferenceNumber='" + planReferenceNumber + '\'' +
                ", enrollmentDate=" + enrollmentDate +
                ", monthlyContribution=" + monthlyContribution +
                '}';
    }

    public String toJson() {
        return String.format("{\"planReferenceNumber\": %s, \"enrollmentDate\": %s, \"monthlyContribution\": %s}",
                planReferenceNumber, enrollmentDate, monthlyContribution);
    }
}
