
package newpackage;
import java.util.Scanner;

public class InputOutput {
    public static void main (String [] args){
        
        Scanner UserIn= new Scanner(System.in); // Object Created
        System.out.println("Enter your name:");
        String name = UserIn.next();
        
        System.out.println("Enter your Age:");
        int age= UserIn.nextInt();
        
        System.out.println("Your name: "+name);
        System.out.println("Your Age: "+age);
    }
    
}
