import java.util.*;
import java.io.*;
import java.util.Scanner;
public class SumOfNatural
{
public static void main(String args[])
{
  int x,sum=0,i = 1 ;
  System.out.print("Enter the number:");
  Scanner sc = new Scanner(System.in);
  x = sc.nextInt();
  while(i <= x)
  {
  sum = sum +i;
  i++;
  }
  System.out.println(sum);
    } 
}


 

