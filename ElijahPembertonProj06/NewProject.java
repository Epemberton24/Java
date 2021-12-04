
/**
 * The purpose of this class is to write 2 overload methods.
 *
 * @author (Elijah Pemberton)
 * @version (10/7/18)
 */
import java.util.Scanner;
public class NewProject
{
    public static void main(String[] args) {
    Scanner inputOne = new Scanner(System.in);//this creates a scanner called inputOne
    Scanner inputTwo = new Scanner(System.in);//this creates a scanner called inputTwo
    Scanner inputThree = new Scanner(System.in);// this creates a scanner called inputthree
    String response;//this creates a string called response.
    
    do{
    System.out.print("please enter a string: "); //this asks a user to enter a string.
    String s = inputOne.nextLine();//this records the users response.
    
    
    System.out.print("Please enter a char: ");//this asks a user to enter a character.
    char c = inputTwo.next().charAt(0);//this records their response.
    
    counting(s);//this runs the s string into the counting function
    countOccurrences(s,c);//this runs the s string and the c char into the countOccurrences function
    
    
    System.out.print("Do you want to do another test Y/N: ");//this asks a user if he or she wants to run the program again.
    response = inputThree.next();//this records the users response.
    
   }while((response =="Y") || (response =="y"));//this loop will continue as long as the user enters y.
  }

  public static void counting(String response){//the purpose of this function is to count the total number of letters in a string.
      
      int counter = 0;
    for (int i = 0; i < response.length(); i++) {//this for loop will continue until it records all the letters in the string.
      if (Character.isLetter(response.charAt(i)))//this checks to see if the character in the string is actually a letter.
        counter++;//this will add one to the counter.
    }
    System.out.println("The result of calling function int countLetters(String s) is: " + counter);//this prints out the total number of letters in a string.
    
    }
    
    
    public static void countOccurrences(String haystack, char needle)//this checks to see if a letter has occured more than once on the sting.
{
    int count = 0;
    if (Character.isLetter(needle)){//this checks if the character is a letter first.
    for (int i=0; i < haystack.length(); i++)//this checks the length on the string.
    {
        if (haystack.charAt(i) == needle || Character.toLowerCase(haystack.charAt(i)) == needle)//this checks to see if the letter entered matches a letter thats in the string.
        {
             count++;//this adds to the counter.
        }
    }
    }
    else{//if not a letter then the counter will be -1
    
     count--;
    }
    System.out.println("The result of calling function int countLetters(String s,char c) is: "+ count);//this prints out the results.
}


}


