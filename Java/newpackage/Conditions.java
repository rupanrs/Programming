
package newpackage;

import java.util.Scanner;


public class Conditions {
    public static void main (String args []){
        Scanner user= new Scanner(System.in);
        
        System.out.println("Enter your Age:");
        int age =user.nextInt();
       
         if (age>=18 || age<60){
             System.out.println("You are major");
         }
           else if(age>=60){
             System.out.println("You are old");
         }
         else{
             System.out.println("You are minor");
         }
        
        //Short hand notation
        String r= (age>60)? "old":"Young";
        System.out.println(r);
    }
    
}
