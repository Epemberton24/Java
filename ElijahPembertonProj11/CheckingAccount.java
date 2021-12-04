
/**
 * Write a description of class CheckingAccount here.
 *
 * @author (Elijah Pemberton)
 * @version (11/29/18)
 */
public class CheckingAccount extends Account {
    private double limit; //this makes limit private.

    public CheckingAccount(int acctNum, double limit) {//this create a checking account and a limit within the account.
        super(acctNum);
        this.limit=limit;//this makes the private limit equal limit.
    }

    public double getLimit() {
        return this.limit;//this returns the limit.
    }

    public void setLimit(double limit) { //this sets the limit.
        this.limit=limit; 
    }
    public void withdraw (double limit) { ///this withdraws the limit.
        if (limit <= this.limit)
            super.withdraw(limit);
        else { 
            System.out.println(" Sorry, Limit Exceeded" );
        }

    }


    public String toString() { //this returns the number to a string.
        return super.toString() +"Limit :   "+limit; 
    }
}
