
/**
 * The purpose of this class is to convert a Hex degit to a decimal.
 *
 * @author (Elijah Pemberton)
 * @version (9/20/18)
 */
import java.util.Scanner;
public class HexToDecimal
{
 public static void main(String args[]){
  Scanner input = new Scanner(System.in);//this creates a scanner called input.
  System.out.print("Enter a Hex degit: ");
  String hexString = input.nextLine();//this will record the users response
  
  if (hexString.length() != 1){//this checks to see if the user enters exactly one character.
    System.out.println("Error, you must enter exactly one character");//this informs the user of an error.
    System.exit(1);//this ends the program.
    }
   
  char ch = Character.toUpperCase(hexString.charAt(0));//this converts whatever character he has to uppercase.
  
  if (ch<= 'F' && ch >= 'A'){//this checks to see what character they entered (letter wise)
    int value = ch -'A' + 10;
    System.out.println("The decimal value for hex degit "+ ch +" is " + value);
    }
    
    else if(Character.isDigit(ch)){//this checks to see if the character is a digit.
       System.out.println("The decimal value for hex degit "+ch +" is "+ch); 
    }
    
   else{//if the user didnt enter a valid input.
    System.out.println(ch +" is not a valid input.");
    } 

 }
}