
/**
 * the purpose of class MyString is for me as the student to learn how to write a user defined class.
 *
 * @author (Elijah Pemberton)
 * @version (11/14/18)
 */

public class MyString
{
    char[] chars;//this creates a character array called chars.
  
  public MyString(char[] chars){//this makes whatevever was entered into Mystring equal the array char.
    this.chars = chars;
  }
  public char charAt(int index){//this prints the character at that position.
    return chars[index];
  }
  public int length(){//this finds the length of the array.
    int count = 0;
    for (char item : chars){
      count++;
    }
    return count;
  }
  public MyString substring(int begin, int end){
    char[] t = new char[end-begin];
    for(int i=begin;i<end;i++){
      t[i-begin]=chars[i];
    }
    MyString newstr = new MyString(t);
    return newstr;
  }
  public MyString toLowerCase(){//this converts the char in the array into lower case.
    char[] t = new char [chars.length];
    
    for(int i = 0; i < t.length; i++) {
      if(chars[i] >= 65 && chars[i] <= 90) {
        t[i] = (char) (chars[i] - 32);
      }
      else{
        t[i] = chars[i];
      }
    }
    MyString newstr = new MyString(t);
    return newstr;
  } 
  
  public boolean equals(MyString s){// this checks whether or not the array is equal or not to another.

    int test = 0;
    for(int i =0; i<s.length();i++){
      if (chars[i] == s.getChars()[i]){
        return true;
      }
      else{
        return false;
      }
    }
    return false;
  }
  public char[] getChars(){
    return chars;// this returns the characters.
  }
  
  public static MyString valueOf(int i){
    int len = 0;
    while (i > 0) {
      len ++;
      i = i / 10;
    }
    char[] t = new char[len];
    
    for (int j = t.length ; j > 0; j --){
      t[i] = (char) (i%10  + 48);
      i = i / 10;
    }
    MyString newstr = new MyString(t);
    return newstr;
  }
}
