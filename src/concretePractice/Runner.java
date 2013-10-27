/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concretePractice;

/**
 *
 * @author F03 H4MM3R
 */
public class Runner {
    public static void main(String[] args) {
        HourlyEmployee e = new HourlyEmployee();
        e.NumberOfHoursWorked();
        e.AmountOfHourlyPay();
        System.out.println("Your hourly pay is " + e.payEmployee()+ ".");
    }
    
}
