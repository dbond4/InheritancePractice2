/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractPractice;

/**
 *
 * @author F03 H4MM3R
 */
public class HourlyEmployee {
    private int hourlyPay;
    private int cubicleNumber;
    
    public void payHourlyWadge(){
        System.out.println("Is that before... or after taxes??");
    }

    /**
     * @return the hourlyPay
     */
    public int getHourlyPay() {
        return hourlyPay;
    }

    /**
     * @param hourlyPay the hourlyPay to set
     */
    public void setHourlyPay(int hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    /**
     * @return the cubicleNumber
     */
    public int getCubicleNumber() {
        return cubicleNumber;
    }

    /**
     * @param cubicleNumber the cubicleNumber to set
     */
    public void setCubicleNumber(int cubicleNumber) {
        this.cubicleNumber = cubicleNumber;
    }
}
