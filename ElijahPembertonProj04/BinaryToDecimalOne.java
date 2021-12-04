
/**
 * The purpose of this class is to convert a binary number into a decimal number.
 *(easy way)
 * @author (Elijah Pemberton)
 * @version (9/22/18)
 */
import java.util.Scanner;
public class BinaryToDecimalOne
{
   public static void main(String args[]){
       Scanner input = new Scanner( System.in );//this creates a scanner called input.
       System.out.print("Enter a binary number: ");//this asks the user to enter a binary number.
       String binaryString =input.nextLine();////this records their response as a string.
       System.out.println("Output: "+Integer.parseInt(binaryString,2));//this converts their binary number into a decimal number.
    }
}
