
/**
 * Write a description of class Account here.
 *
 * @author (Elijah Pemberton)
 * @version (11/28/18)
 */
public class Account
{
     private double balance; 
    private int acctNum; 

    public Account (int num)//this creates a accounr number.
    { 
        balance = 0.0;
        acctNum = num; 
    } 
    public void deposit (double amt)//this creates a deposit.
    { 
        if (amt >0)
            balance +=amt;
        else 
            System.out.println("Account.deposit(...): "
                    +"cannot deposit negative amount.");
    }
    public void withdraw (double amt)//this allows the user to withdraw.
    {
        if (amt>0)
            balance -=amt; 
        else 
            System.err.println("Account.withdraw(...): "
                    +"cannot withdraw negative amount.");

    }
    public double getBalance() //this returns the users balance.
    { 
        return balance; 
    }
    public double getAccountNumber()//this returns account number
    {
        return acctNum;
    }
    public String toString()//this converts account number to a string
    {
      return "Acc " + acctNum + ": " + "balance = "+ balance;   
    }
    public final void print()
    {
           System.out.println( toString()); 
    }
}

