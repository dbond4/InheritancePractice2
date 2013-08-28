/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concretePractice;

/**
 *
 * @author F03 H4MM3R
 */
public class SalariedEmployee extends Employee{
    private double yearlyPay;
    private int vacationDays;
    private int officeNumber;
    
    public void takeVacation(){
        System.out.println("See you in 2 weeks!");
    }
    public void attendMeeting(){
        System.out.println("Snooze time.");
    }
    public void pretendToWork(){
        System.out.println("15 minutes of real work.");
    }

    /**
     * @return the yearlyPay
     */
    public double getYearlyPay() {
        return yearlyPay;
    }

    /**
     * @param yearlyPay the yearlyPay to set
     */
    public void setYearlyPay(double yearlyPay) {
        this.yearlyPay = yearlyPay;
    }

    /**
     * @return the vacationDays
     */
    public int getVacationDays() {
        return vacationDays;
    }

    /**
     * @param vacationDays the vacationDays to set
     */
    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    /**
     * @return the officeNumber
     */
    public int getOfficeNumber() {
        return officeNumber;
    }

    /**
     * @param officeNumber the officeNumber to set
     */
    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }
}
