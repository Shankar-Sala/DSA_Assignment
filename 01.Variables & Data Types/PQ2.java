import java.util.*;

//Area of a square
public class PQ2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter side of Square: ");
    double side = sc.nextDouble(); //45

    double area = side * side;  
    System.out.println("Area of a Square = "+area);
    // System.out.println("Happy New Year " + area); 
  }
}
