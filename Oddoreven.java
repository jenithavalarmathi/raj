import java.util.*;
import java.io.*;
public class Odd_Even{
  public static void main(String args[])throws IOException{
    int n;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the n value");
    n=s.nextInt();
    if(n%2==0)
    {
      System.out.println(n+" is even");
    }
    else  
    {
      System.out.println(n+" is odd");
    }
    
  }                     
}
