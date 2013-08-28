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
    private int yearlyBonus;

    public void yearlyBonus(){
        System.out.println("Clark gets a swimming pool!");
    }
    /**
     * @return the yearlyBonus
     */
    public int getYearlyBonus() {
        return yearlyBonus;
    }

    /**
     * @param yearlyBonus the yearlyBonus to set
     */
    public void setYearlyBonus(int yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }
}
