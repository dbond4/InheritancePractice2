/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacePractice;

/**
 *
 * @author F03 H4MM3R
 */
public class SalariedEmployee implements Employee{
    public void hireEmployee(){
        System.out.println("Your hired, gab a seat.");
    }
    public void fireEmployee(){
        System.out.println("Clean out your desk, YOUR FIRED!!");
    }
    public void trainEmployee(){
        System.out.println("Grab a pen and paper. Write that down.");
    }
}
