
package Loops;
import java.util.Scanner;


public class loops {
    public static void main(String args []){
        
        Scanner uscan=new Scanner(System.in);
        
        int i=1, max=0, min=100;
      
        while(i<=5){
            System.out.println("Enter Your marks "+i+":");
            int m=uscan.nextInt();
            
            if(m>=max){
                max=m;
            }
            else if(m<=min){
                min=m;
                }
            i++;
            
        }
        
        System.out.println("Maximum mark is :"+max);
        System.out.println("Minimum mark is :"+min);
    }
    
}
