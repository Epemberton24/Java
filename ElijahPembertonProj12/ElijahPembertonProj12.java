
/**
 * Write a description of class Bank here.
 *
 * @author (Elijah Pemberton)
 * @version (11/29/18)
 */public class ElijahPembertonProj12 {

    public static void main(String[] args) {
      Account[] accounts = new Account[4];//this creates 4 bank accounts
      accounts[0] = new SavingsAccount(2, 0.25);//this is a savings account
      accounts[1] = new SavingsAccount(3, 0.25);//this is a savings account
      accounts[2] = new CheckingAccount(23, 50);//this is a checking account.
      accounts[3] = new CheckingAccount(24, 50);//this is a checking account.

    for(int i=0; i<accounts.length;i++) {
        if (accounts[i] instanceof SavingsAccount) {
            // You must cast an Account to use any of the descendant's methods
            SavingsAccount account = (SavingsAccount) accounts[i];
            System.out.println(account.getInterest());
        } else { // it's a CheckingAccount
             
        } 
     }
    }
}
