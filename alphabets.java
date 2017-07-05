import java.util.*;
import java.io.*;
public class Alphabets{
  public static void main(String args[])throws IOException{
    int n;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the charector");
    n=s.next( ).charAt(0);
    if((n>='a' && n<='z') || (n>='A' && n<='Z'))
    {
      System.out.println("Alphabet");
    }
    else  
    {
      System.out.println("not Alphabet");
    }
    
  }                     
}
