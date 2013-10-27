/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concretePractice;

/**
 *
 * @author F03 H4MM3R
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee{
    private double yearlyBonus;
    private double yearlyPay;
    private double wadge;

    @Override
    public double payEmployee(){
        wadge = yearlyPay + yearlyBonus;
        return wadge;   
    }

    public double getWadge() {
        return wadge;
    }

    public void setWadge(double wadge) {
        this.wadge = wadge;
    }
    
    /**
     * @return the yearlyBonus
     */
    public double getYearlyBonus() {
        return yearlyBonus;
    }

    /**
     * @param yearlyBonus the yearlyBonus to set
     */
    public void setYearlyBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }
}
