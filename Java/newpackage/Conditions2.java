
package newpackage;
import java.util.Scanner;

public class Conditions2 {
    public static void main (String args []){
        Scanner uin = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name=uin.next();
       
        System.out.println("Enter your age:");
        int age=uin.nextInt();
        
        System.out.println("Enter your salary:");
        double salary=uin.nextDouble();
        double per=20/100;
        double per2=5/100;
        
        if (salary>=100000){
            double tax=salary*per;
            
            System.out.println("Your Name:"+name);
            System.out.println("Your Age:"+age);
            System.out.println("Your salary:"+salary);
            System.out.println("Your Tax:"+tax);
        }
        else{
            double tax=salary*per2;
            
            System.out.println("Your Name:"+name);
            System.out.println("Your Age:"+age);
            System.out.println("Your salary:"+salary);
            System.out.println("Your Tax:"+tax);
        }
        
        System.out.println("Thank You....!");
    }
    
}
