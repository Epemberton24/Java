
/**
 * The Purpose of the class Solution is to asks the user input a change between 1 and 99 cents. The class
   then will display it in amount of quarters, dime, nickels and pennies.
 *
 * @author (Elijah Pemberton)
 * @version (09/02/18)
 */
   import java.util.Scanner;
   import java.util.Random;
public class Solution
{
    
    public static void main(String[] args)  
    {   
        //Scanner response = new Scanner(System.in);//this creates a scanner called response which is what will be used to record a users input.
        //System.out.print("Please enter a change between 1 to 99 cents: ");//this will ask the user to enter a number between 1 to 99.
        //int total = response.nextInt();// This will record the users input.
        
        Random number = new Random();//number will be used to generate a random number.
        int total = number.nextInt(99) + 1;// this will randomly select a number that is between 1 through 99.
        System.out.println( "Random number is: " + total);//this will print out the random number.
        
        
        int quarters = total/25;//this will count how many quarters there can be in the total.
        total = total%25; 
        int dimes = total/10;//this will count how many dimes there can be in the total.
        total = total%10;
        int nickles = total/5;//this will count how many nickles there can be in the total.
        total = total%5;
        int pennies = total;//this will count how many pennies there can be in the total.
        
        
        System.out.println(quarters + " Quarters");//this will print out the number of Quarters.
        System.out.println(dimes + " Dimes");//this will print out the number of Dimes.
        System.out.println(nickles + " Nickles");//this will print out the number of Nickles.
        System.out.println(pennies + " Pennies");//this will print out the number of Pennies.
    }
    
}
