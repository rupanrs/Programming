
package Loops;
import java.util.Scanner;

public class Switch {
    public static void main(String args[]){
        
        Scanner myin= new Scanner(System.in);
        
        System.out.println("Enter your choice: ");
        int x=myin.nextInt();
        
            switch(x){
                case 1:
                // code block
                    System.out.println("your choice "+x);
                break;

                case 2:
                // code block
                    System.out.println("your choice "+x);
                break;

                default:
                // code block
                    System.out.println("System Out Print In "+(x+1));
                }
    }
}
