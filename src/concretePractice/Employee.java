/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concretePractice;

/**
 *
 * @author F03 H4MM3R
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private int hireDate;
    private double employeeNumber;

    public void hireEmployee(){
        System.out.println("Your hired, gab a seat.");
    }
    public void fireEmployee(){
        System.out.println("Clean out your desk, YOUR FIRED!!");
    }
    public void trainEmployee(){
        System.out.println("Grab a pen and paper. Write that down.");
    }
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the hireDate
     */
    public int getHireDate() {
        return hireDate;
    }

    /**
     * @param hireDate the hireDate to set
     */
    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * @return the employeeNumber
     */
    public double getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * @param employeeNumber the employeeNumber to set
     */
    public void setEmployeeNumber(double employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
}
