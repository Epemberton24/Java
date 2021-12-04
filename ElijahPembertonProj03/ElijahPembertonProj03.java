
/**
 * The purpose of this class is to write a program will first check if the score is valid (between 0 and 100, inclusive). If the score is not valid, print out the error message and exit the program. Otherwise, display the corresponding letter grade.
 *
 * @author (Elijah Pemberton)
 * @version (9/14/18)
 * The If statement version of has been turned into comments.
 * The Switch statement version is the one that currently is running.
 * 
 */
import java.util.Scanner;
public class ElijahPembertonProj03
{
  public static void main(String[] args)
  {
      Scanner response = new Scanner(System.in);//this creates a scanner called response.
      System.out.print("Enter your score(0--100): ");//this will ask the user to enter a number beteen 0 and 100.
      int score = response.nextInt();//this will record the users response
      //if(score >100 || score < 0)//this checks to see if the user enter a number between 0 and 100.
      //{
       //System.out.println("ERROR ERROR ERROR");
       //System.out.println("NUMBER ENTERED IS OUTSIDE THE RANGE");
      //}
     //else 
     //if
     //((score >=90)&&(score <=100))//this result will print out if the user enters a number between 90 and 100
     //{
      //System.out.println("Your grade is: A");
     //}
     //else
     //if
     //((score >= 80)&&( score <=89 ))//this result will print out if the user enters a number between 80 and 89 
     //{
      //System.out.println("Your grade is: B");
     //}
     //else
     //if
     //((score >=70 )&&(score<=79))//this result will print out if the user enters a number between 70 and 79
     //{
      //System.out.println("Your grade is: C");
     //}
     //else
     //if
     //((score >=60)&&(score<=69))//this result will print out if the user enters a number between 60 and 69
     //{
      //System.out.println(" Your grade is: D");
     //}
     //else
     //if
     //(score <=59 )//this result will print out if the user enters a number between 0 and 59.
     //{
      //System.out.println(" Your grade is: F");
     //}
    
      switch ((int) score/10) {//this creates a switch statement that divides the number the user entered by 10.
     case 0:
        //anything that is between 0 and 9 will go through this case here.
        System.out.println("F");
        break;
     case 1:
        //anything that is between 10 and 19 will go through this case here.
        System.out.println("F");
        break;
     case 2:
        //anything that is between 20 and 29 will go through this case here.
        System.out.println("F");
        break;
     case 3:
        //anything that is between 30 and 39 will go through this case here.
        System.out.println("F");
        break;
     case 4:
        //anything that is between 40 and 49 will go through this case here.
        System.out.println("F");
        break;
     case 5:
        //anything that is between 50 and 59 will go through this case here.
        System.out.println("F");
        break;
     case 6:
        //anything that is between 60 and 69 will go through this case here.
        System.out.println("D");
        break;
     case 7:
        //anything that is between 70 and 79 will go through this case here.
        System.out.println("C");
        break;
     case 8:
        //anything that is between 80 and 89 will go through this case here.
        System.out.println("B");
        break;
     case 9:
        //anything that is between 90 and 99 will go through this case here.
        System.out.println("A");
        break;
        case 10:
        //anything that is equal to 100 will go through this case here.
        System.out.println("A");
        break;
     default://If the user makes an error the default case will occur here.
     System.out.println("Error the input you entered isnt witin the range please try again.");
        break;
    }
     
   }
}
