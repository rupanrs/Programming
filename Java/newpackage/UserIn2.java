
package newpackage;

import java.util.Scanner;


public class UserIn2 {
    public static void main(String [] args){
        Scanner Object1= new Scanner(System.in);
        
        System.out.println("Enter A:");
        int a = Object1.nextInt();
        
        System.out.println("Enter B:");
        int b = Object1.nextInt();
        
        int x= a+b;
        int y= a*b;
        int z= a/b;
        
        System.out.println(a+"+" +b +"=" +x);
        System.out.println(a+"*" +b +"=" +y);
        System.out.println(a+"/" +b +"=" +z);
    }
}
