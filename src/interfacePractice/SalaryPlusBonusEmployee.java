/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacePractice;

/**
 *
 * @author F03 H4MM3R
 */
public class SalaryPlusBonusEmployee implements ISalariedEmployee{
    private int bonus;
    
    public void yearlyBonus(){
        System.out.println("Clark gets a swimming pool!");
    }

    /**
     * @return the bonus
     */
    public int getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void hireEmployee(){
        System.out.println("Your hired, gab a seat.");
    }
    @Override
    public void fireEmployee(){
        System.out.println("Clean out your desk, YOUR FIRED!!");
    }
    @Override
    public void trainEmployee(){
        System.out.println("Grab a pen and paper. Write that down.");
    }
}
