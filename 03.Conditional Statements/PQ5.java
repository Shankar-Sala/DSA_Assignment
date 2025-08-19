import java.util.*;

public class PQ5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //? method-1
    // System.out.print("Enter any Year: ");
    // int year = sc.nextInt();
    
    // boolean x = (year % 4) == 0;
    // boolean y = (year % 100) != 0;
    // boolean z = ((year % 100 == 0) && (year % 400 == 0) );
    
    // if( x && (y || z)){
    //   System.out.println(year + " is a leap year");
    // }
    // else{
    //   System.out.println(year + " is not a leap year");
    // }

    //? Method-2
    int year = sc.nextInt();
    if(year % 4 == 0){
      if(year % 100 == 0){
        if(year % 400 == 0){
          System.out.println("Leap Year");
        }else{
          System.out.println("Not a Leap Year");
        }
      }else{
        System.out.println("Leap Year");
      }
    }else{
      System.out.println("Not a Leap Year");
    }

  }
}

//! imp notes 

//! how to check a year is leap or not 
//? A year is a leap year if it is divisible by 4, unless it is also divisible by 100 but not by 400. In other words, if a year is divisible by 4, it's a leap year, unless it's a century year (divisible by 100) and not divisible by 400. For example, 2000 was a leap year because it's divisible by 400, but 1900 was not a leap year because it's divisible by 100 but not by 400. 

//! what are the conditions for a leap year?
// ?A leap year occurs when a year is divisible by 4, except for years that are divisible by 100, unless they are also divisible by 400. This means: 
//? Divisible by 4: If a year is evenly divisible by 4, it is considered a leap year. 
//? Divisible by 100: If a year is divisible by 100, it is not a leap year, unless it also.. 
//? Divisible by 400: If a year is divisible by both 100 and 400, it is a leap year. 
// For example:
//? 2000 was a leap year because it is divisible by both 100 and 400. 
//? 1900 was not a leap year because it is divisible by 100 but not by 400. 
//? 2024 is a leap year because it is divisible by 4 but not by 100. 