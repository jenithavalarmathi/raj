import java.util.*;
import java.io.*;
public class Vowels{
  public static void main(String args[])throws IOException{
    int n;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the charector");
    n=s.next( ).charAt(0);
    if(n=='a'||n=='A'||n=='e'||n=='E'||n=='i'||n=='I'||n=='o'||n=='O'||n=='u'||n=='U')
    {
      System.out.println("Vowels");
    }
    else  
    {
      System.out.println("Consonants");
    }
    
  }                     
}
