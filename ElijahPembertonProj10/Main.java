
/**
 * The purpose of class Main is to play around with my MyString class.
 *
 * @author (Elijah Pemberton)
 * @version (11/13/18)
 */

public class Main
{
   public static void main(String[] args) {
    char[] gohan = {'g','o','h','a','n'};//this creates a char array called gohan.
    MyString str = new MyString(gohan);//this creates a new Mystring class called str.
    System.out.println(str.charAt(3));// this prints at character 3.
    System.out.println(str.length());// this prints out the length.
 }
}