
/**
 * Write a description of class SavingsAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingsAccount extends Account { 
    private double interest;

    public SavingsAccount(int acctNum, double interest) {
        super(acctNum);
        this.interest=interest;
    }

    public double getInterest() { 
        double x= getBalance() + getBalance()*interest;
        return x;//this returns x

   
    }
    public void AddInterest (double interest) {// this add interest. 
        double x = super.getBalance() * interest; 
        super.deposit(x);
    }
    public String toString() {//this returns interest as a string.
        return super.toString()+" Interest : " + interest; 
    }
}
