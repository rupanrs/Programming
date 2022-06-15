
package newpackage;
import java.util.Scanner;

public class Switch {
    public static void main(String args[]){
        
        Scanner option=new Scanner(System.in);
        
        System.out.println("Enter your 1st letter:");
        char letter=option.next().charAt(0);
        
        switch (letter){
            case 's':
                System.out.println("Sowmiya");
                break;
                
            case 'r':
                System.out.println("Rupan");
                break;
                
            default:
                System.out.println("Not Found");
                break;
                
                
                
        }
    }
}
