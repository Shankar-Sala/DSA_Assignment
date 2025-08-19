
import java.util.*;

public class PQ1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //!using If-else statements
        // int num = sc.nextInt();
        // if(num == 0){
        //     System.out.println("The number is 0.");
        // }
        // if(num < 0){
        //     System.out.println("The number is Negative");
        // }else {
        //     System.out.println("The number is Positive");
        // }
        // ! Using switch Statement
        int num = sc.nextInt();
        int y = num > 0 ? 1 : -1;

        if (num == 0) {
            y = 0;
        }
        switch (y) {
            case 0:
                System.out.println("The number is 0.");
                break;
            case 1:
                System.out.println("The number is Positive");
                break;
            case -1:
                System.out.println("The number is Negative");
               
        }
    }
}
