/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concretePractice;

import javax.swing.JOptionPane;

/**
 *
 * @author F03 H4MM3R
 */
public class HourlyEmployee extends Employee{
    private double hourlyPay;
    private double hoursWorked;
    private double wadge;
    
    @Override
    public double payEmployee(){
        wadge = hourlyPay * hoursWorked;
        return wadge;
    
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void NumberOfHoursWorked() {
        hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("How many hours did you work?"));
    }
    
    /**
     * @return the hourlyPay
     */
    public double getHourlyPay() {
        return hourlyPay;
    }

    /**
     * @param hourlyPay the hourlyPay to set
     */
    public void AmountOfHourlyPay() {
        hourlyPay = Double.parseDouble(JOptionPane.showInputDialog("What is your wadge paid per hour?"));
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    
}
