import java.util.*;

public class PQ3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter Cost of Pencil = ");
    float pencil = sc.nextFloat();
    System.out.print("Enter Cost of Pen = ");
    float pen = sc.nextFloat();
    System.out.print("Enter Cost of Eraser = ");
    float eraser = sc.nextFloat();
    float total = pencil + pen + eraser;
    System.out.println("Total Cost = "+total);

    // add on 18% GST

    float newTotal = (total + (total * 0.18f));
    System.out.print("Total Cost After Adding 18% GST = "+ newTotal);
    
  }
}


  

