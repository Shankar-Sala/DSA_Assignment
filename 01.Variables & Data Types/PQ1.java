// package DataTypesAndIdentifier;

import java.util.*;

//Average of 3 numbers
public class PQ1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number A : ");
    int a = sc.nextInt();
    System.out.print("Enter Number B : ");
    int b = sc.nextInt();
    System.out.print("Enter Number C : ");
    int c = sc.nextInt();
    int avg = (a + b + c)/3;
    System.out.println("Average of N numbers = " + avg );
  }

}