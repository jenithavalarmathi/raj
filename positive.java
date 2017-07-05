import java.util.*;
import java.io.*;
public class Positive_Negative{
  public static void main(String args[])throws IOException{
    int n;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the n value");
    n=s.nextInt();
    if(n>0)
    {
      System.out.println(n+" is positive");
    }
    else if(n<0) 
    {
      System.out.println(n+" is positive");
    }
    else
    {
      System.out.println(n+" is zero");
    }  
  }                     
}
