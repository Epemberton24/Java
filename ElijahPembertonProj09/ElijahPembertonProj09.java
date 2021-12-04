
/**
 * The purpose for this project	is to reinforce	the knowledge from Chapter 9 of	the textbook. The	
students will learn how to write a user defined class.
 *
 * @author (Elijah)
 * @version (11/7/18)
 */
import java.util.Scanner;
public class Test
{
  public static void main(String[] args)
  {
   Scanner input = new Scanner(System.in);//this creates a scanner called input.
   double a,b,c,d;
   //a=10.0; these were test values.
   //b=11.0;
   //c=11.0;
   //d=12.0;
   
   char conversion;//this creates a character called conversion.
   
   Temperature A = new Temperature();//this creates a temperature object called A
   Temperature B = new Temperature();//this creates a temperature object called B
   Temperature C = new Temperature();//this creates a temperature object called C
   Temperature D = new Temperature();//this creates a temperature object called D
   
   //the flowing below help declare whats inside every temperature object.
   System.out.println("for temp object A please enter the number: ");
   a = input.nextDouble();
   System.out.println("Press F if that was in Fahrenheit or Press C if it was in Celcius: ");
   conversion = input.next(".").charAt(0);
    A.setDegree(a,conversion);
    A.getDegreeInFahrenheit();
    A.getDegreeInCelcius();
        System.out.println("temp A is: "+A.getDegreeInFahrenheit() +" F");
        System.out.println("Temp A is: "+A.getDegreeInCelcius()+" C");
    
    
   System.out.println("for temp object B please enter the number;");
   b = input.nextDouble();
   System.out.println("Press F if that was in Fahrenheit or Press C if it was in Celcius: ");
   conversion = input.next(".").charAt(0);
    B.setDegree(b,conversion);
    B.getDegreeInFahrenheit();
    B.getDegreeInCelcius();
        System.out.println("Temp B is: "+B.getDegreeInFahrenheit()+" F");
        System.out.println("Temp B is: "+B.getDegreeInCelcius()+" C");
   
        
   System.out.println("for temp object C please enter the number;");
   c = input.nextDouble();
   System.out.println("Press F if that was in Fahrenheit or Press C if it was in Celcius: ");
   conversion = input.next(".").charAt(0);
    C.setDegree(c,conversion);
    C.getDegreeInFahrenheit();
    C.getDegreeInCelcius();
        System.out.println("Temp C is: "+C.getDegreeInFahrenheit()+" F");
        System.out.println("Temp C is: "+C.getDegreeInCelcius()+" C");
     
   System.out.println("for temp object D please enter the number;");
   d = input.nextDouble();
   System.out.println("Press F if that was in Fahrenheit or Press C if it was in Celcius: ");
   conversion = input.next(".").charAt(0);
    D.setDegree(d,conversion);
    D.getDegreeInFahrenheit();
    D.getDegreeInCelcius();
        System.out.println("Temp D is: "+D.getDegreeInFahrenheit()+" F");
        System.out.println("Temp D is: "+D.getDegreeInCelcius()+" C");
    
    //these If statements from A to D check to see if each temperature 
    //object is greater than, less than, or equal to another temperatre object.
    
   if(A.equal(B)== true){System.out.println("Temperatue A is equals Temperature B.");} 
   else if (A.isLessThan(B)==true){System.out.println("Temperatue A is less than Temperature B");}
   else if (A.isGreaterThan(B)==true){System.out.println("A is greather than B");}
   
   if (A.equal(C)==true){System.out.println("Temperatue A is equals Temperature C.");} 
   else if (A.isLessThan(C)==true){System.out.println("Temperatue A is less than Temperature C");}
   else if(A.isGreaterThan(C)==true){System.out.println("A is greather than B");}
   
   if (A.equal(D)==true){System.out.println("Temperatue A is equals Temperature D.");} 
   else if (A.isLessThan(D)==true){System.out.println("Temperatue A is less than Temperature D");}
   else if(A.isGreaterThan(D)==true){System.out.println("A is greather than D");}
   
   
       
   if (B.equal(A)==true){System.out.println("Temperatue B is equals Temperature A.");} 
   else if (B.isLessThan(A)==true){System.out.println("Temperatue B is less than Temperature A");}
   else if(B.isGreaterThan(A)==true){System.out.println("B is greather than A");}
    
    if (B.equal(C)==true){System.out.println("Temperatue B is equals Temperature C.");} 
   else if (B.isLessThan(C)==true){System.out.println("Temperatue B is less than Temperature C");}
   else if(B.isGreaterThan(C)==true){System.out.println("B is greather than C");}

    if (B.equal(D)==true){System.out.println("Temperatue B is equals Temperature D.");} 
   else if (B.isLessThan(D)==true){System.out.println("Temperatue B is less than Temperature D");}
   else if(B.isGreaterThan(D)==true){System.out.println("B is greather than D");}
   
   
    if (C.equal(A)==true){System.out.println("Temperatue C is equals Temperature A.");} 
   else if (C.isLessThan(A)==true){System.out.println("Temperatue C is less than Temperature A");}
   else if(C.isGreaterThan(A)==true){System.out.println("C is greather than A");}
  
   if (C.equal(B)==true){System.out.println("Temperatue C is equals Temperature B.");} 
   else if (C.isLessThan(B)==true){System.out.println("Temperatue C is less than Temperature B");}
   else if(C.isGreaterThan(B)==true){System.out.println("C is greather than B");} 

   if (C.equal(D)==true){System.out.println("Temperatue C is equals Temperature D.");} 
   else if (C.isLessThan(D)==true){System.out.println("Temperatue C is less than Temperature D");}
   else if(C.isGreaterThan(D)==true){System.out.println("C is greather than D");}
   
   
   if (D.equal(A)==true){System.out.println("Temperatue D is equals Temperature A.");} 
   else if (D.isLessThan(A)==true){System.out.println("Temperatue D is less than Temperature A");}
   else if(D.isGreaterThan(A)==true){System.out.println("D is greather than A");}
   
   if (D.equal(B)==true){System.out.println("Temperatue D is equals Temperature B.");} 
   else if (D.isLessThan(B)==true){System.out.println("Temperatue D is less than Temperature B");}
   else if(D.isGreaterThan(B)==true){System.out.println("D is greather than B");}
   
   if (D.equal(C)==true){System.out.println("Temperatue D is equals Temperature C.");} 
   else if (D.isLessThan(C)==true){System.out.println("Temperatue D is less than Temperature C");}
   else if(D.isGreaterThan(C)==true){System.out.println("D is greather than C");}
}
}
