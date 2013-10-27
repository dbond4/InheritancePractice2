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
    private double wadge;
    
    public double payEmoployee(){
        wadge = yearlyPay;
        return wadge;
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
}
