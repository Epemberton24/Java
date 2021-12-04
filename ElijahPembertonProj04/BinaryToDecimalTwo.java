
/**
 * The purpose of this class is to convert  binary number into a decimal.
 *(hard way)
 * @author (Elijah Pemberton)
 * @version (9/21/18)
 */
import java.util.Scanner;
public class BinaryToDecimalTwo
{
   public static void main(String[] args)
  {
    Scanner input = new Scanner( System.in );//this creates a scanner called input
        System.out.println("Enter a binary number: ");// this ask the user to enter a binary number.

        int  binarynum = input.nextInt();//this records the users response.
        int binary = binarynum;//this makes a int called binary that equals what binarynum currently equals.

        int decimal = 0;//this creats a int called decimal
        int power = 0;//this creates

        while(true){//this loop will keeping running while the loop is true.

            if(binary == 0){//if binary equals zero then the loop will break

                break;

            } else {

                int temp = binary%10;//them is what the remaind of binary divided by 10 is.
                decimal += temp*Math.pow(2, power);// decimal will equal decimal plus temp times the math.power.
                binary = binary/10;
                power++;

            }
        }
    System.out.println("Binary="+binarynum+" Decimal="+decimal);//this will print out the results. 
      } 
 }


    
 

