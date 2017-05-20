import java.util.Scanner;

public class PasswordChecker 
{
  public static boolean isCorrectLength(String word) 
  {
    return (word.length() >= 8);
  }
  
  public static boolean containsDigit(String word) 
  {
    boolean flag = false;
    for(int i = 0; i < word.length(); i++) 
    {
      if(Character.isDigit(word.charAt(i))) 
      {
        flag = true;
        break;
      }
    }
    return flag;
  }
  
  public static boolean containsUpper(String word) 
  {
    boolean flag = false;
    for(int i = 0; i < word.length(); i++) 
    {
      if(Character.isUpperCase(word.charAt(i))) 
      {
        flag = true;
        break;
      }
    }
    return flag;
  }
  
  public static boolean containsLower(String word)
  {
    boolean flag = false;
    for(int i = 0; i < word.length(); i++) 
    {
      if(Character.isLowerCase(word.charAt(i))) 
      {
        flag = true;
        break;
      }
    }
    return flag;
  }
  
  public static void main (String[] args) 
  {
    Scanner in = new Scanner(System.in);
    String password;
    do 
    {
      System.out.print("Enter a password: ");
      password = in.next();
      System.out.println("");
    }
    while(isCorrectLength(password) == false || containsDigit(password) == false || containsUpper(password) == false || containsLower(password) == false);
    in.close();
  }
}