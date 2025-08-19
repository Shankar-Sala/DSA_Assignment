//! Loops Questions
// ? Qs-1

public class PQ1{
    public static void main(String args[]){

        //! Method-1 for-loop 
        // for(int i=0; i<5; i++){
        //     System.out.println("Hello");
        //     i+=2;
        // }

        // ! Method-2 while loop
        int i=0;
        while(i<5){
            System.out.println("Hello");
            i += 2;  // method-1
            i++;  
            // i +=3;   //  method-2
        }
    }
}
