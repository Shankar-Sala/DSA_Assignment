public class PQ2{
  public static void main(String[] args){
    int x = 200, y = 50, z=100;
    if(x > y && y > z){
      System.out.println("hello"); // not run T && F = F.
    }
    if(z > y && z < x){
    System.out.println("Java"); // run T && T = T .  O/p=Java
  }
    if((y+200) < x && (y+150) < z){  
    System.out.println("Hello Java"); // not run F && F = F.
  }
  }
}

//JAVA