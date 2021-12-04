
/**
 * the purpose of this class is to ask a user to enter a mumber between 0 and 511 while displaying
 * the corresponding matri with that characters H and T.
 *
 * @author (Elijah Pemberton)
 * @version (10/29/18)
 */
import java.util.Scanner;
public class HeadsAndTails {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//this create a scanner called in
        char[][] arr = new char[3][3];
        System.out.print("Enter an integer representing the state of the coins:");
        int num = in.nextInt();//num will equal the users response.
        String binary = Integer.toBinaryString(num);//binary will be equal to the number.
        binary = String.format("%09d", Integer.parseInt(binary));
        for (int i = 0; i < binary.length(); i++) {//this loop will continue until i is greater than binary length.
 
        }
        num = 0;
        for (int i = 0; i < 3; i++) {//this loop will continue until i equals 3.
            for (int j = 0; j < 3; j++) {//this loop will continue until j equals 3.
                char a = binary.charAt(num);
                if (a == '0') {
                    arr[i][j] = 'H';// H will be in the matrix.
                } else {
                    arr[i][j] = 'T';//T will be in the matrix.
                }
                num++;
                if (j == 2) {
                    System.out.print(arr[i][j]);//this prints a character.
                } else {
                    System.out.print(arr[i][j] + " ");//this prints a character and black space.
                }
            }
            System.out.println("");
        }
    }
}