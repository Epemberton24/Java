
/**
 * Write a description of class Practice here Apply linear search algorithm, apply select sort algorithm, and apply array iteration skills
 * from what I have learned from chapter 07.
 *
 * @author (Elijah Pemberton)
 * @version (/10/19/18)
 */
import java.util.Arrays;
import java.util.Scanner;
public class Practice
{
   public static void main(String[] args){
     int[] arr;//this creates an int array called arr.
     int max, min, r, key, search;//this creates ints called max,min,r,key,and search.
     double avg;//this creates a double called avg.
     Scanner response = new Scanner(System.in);//this creates a scanner called response.
     
     arr = new int[10];//this means there are 10 elements.
    
     initializeArray(arr);//this runs arr through the initializeArray method.
     printArray(arr);//this runs arr through the printArray method.
     
     max = largest(arr);//this makes max equal to whatever the largest number is inside arr.
     min = smallest(arr);//this makes min equal to whatever the smallest number is inside arr.
     System.out.println("");
     System.out.println("largest: " + max);//this prints out max.
     System.out.println("smallest: " + min);//this prints out min.
    
     r = range(arr);//r will equal the whatever the range of arr is.
     System.out.println("Range: " + r);//this prints out the range.
     
     avg = average(arr);//ave will equal whatever the average of arr is.
     System.out.println("average: "+ avg);//this prints out the average.
     
     System.out.print("Please enter a search key: ");//this asks a user to enter a key to search for.
     key = response.nextInt();//this records the users response.
     
     search = linearSearch(arr,key);//search will equal what position the key is in inside the arr array.
     System.out.println("that is found in index: "+ search);//this prints out search.
     
     selectSort(arr);//this will sort arr from least to greatest.
     printArray(arr);//this will print out arr.
    }
    
    
    
    
    public static int linearSearch(int arr[],int key){//this method will look for what position key is in within an array.
     for(int i=0; i< arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;//if key isnt in the array then -1 will be returned instead.    
    } 
    
    
    public static void selectSort(int arr[]){//this will sort out an array from least to greatest.
       for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }
    
    public static void printArray(int arr[]){//this method will print an array.
      int count = 0;
     for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
         count++;
         if (count == 5) {
             System.out.println();
             
      }
       }
     }
    
     public static void initializeArray(int arr[]){//this method will give an array's elements random numbers 
    for (int i=0; i< arr.length; i++)
      {arr[i] = (int) (Math.random() * 100);
      }
    }
    
    public static int range(int arr[]){//this will search for the range of an array.
     int max = 0;
     int min = 0;
     int range = 0;
     for(int i = 0; i < arr.length; i++)
        {
          if (arr[i] > max){max = arr[i]; }
        }
        
       
     for(int i = 0; i < arr.length; i++)
        {
          if (arr[i] < min){min = arr[i]; }
        }
        range = max - min;
        
        return range;
    }
    
    public static int largest(int arr[]){//this will search for the largest number in an array.
     int max = arr[0];
     for(int i = 0; i < arr.length; i++)
        {
          if (arr[i] > max){max = arr[i]; }
        }
        
        return max;
    }
    
    public static int smallest(int arr[]){//this will search for the smallest number in an array.
     int min = arr[0];
      for(int i = 0; i < arr.length; i++)
        {
          if (arr[i] < min){min = arr[i]; }
        }
      
        return min;
    }
    
    public static double average(int arr[]){//this will look for the average within an array.
     int i, sum, avg;
     sum = 0;
     for (i = 0; i<arr.length; i++){ sum += arr[i];}
    
     avg = sum / arr.length;
     
     return avg;
    }
}
