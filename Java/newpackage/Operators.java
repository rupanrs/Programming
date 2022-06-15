
package newpackage;

public class Operators {
    public static void main(String[] args)
    {
        System.out.println("Operators");
        System.out.println("-----***-----");
        System.out.println("1. Assigment Operators");
        System.out.println("2. Arithmetic Operators");
        
        int a, b, x, y;
        a=10;
        b=20;
        
        int sum=a+b; // ADDITION
        int sub=b-a; // SUBTRACTION
        int multi=a*b; // MULTIPLICATION
        int div=a/b; // DIVISION
        int mod=a%b; // MODULUS
        
        System.out.println("A+B = "+sum);
        System.out.println("B-A = "+sub);
        System.out.println("A*B = "+multi);
        System.out.println("A/B = "+div);
        System.out.println("A%B = "+mod);
        
        //Increment Operator
        x=10;
        System.out.println(x++);//
        System.out.println(x);//
        System.out.println(++x);//
        System.out.println(x);//
        
        //Decrement Operator
        y=10;
        System.out.println(y--); //10
        System.out.println(y);   //9
        System.out.println(--y); //8
        System.out.println(y);   // 8
        
        //Assignment Operator
        int p=15,q;
         p-=5;
          System.out.println(p);//10
         p+=5;
          System.out.println(p);//15
         
        //Comparational Operators
        int l,m;
        float n;
        l=3; m=6;n=6.01f;
        System.out.println(l==m);// False
        System.out.println(l!=m);// True
        
        System.out.println(m==n); // False
        System.out.println(m!=n); // True
        
        System.out.println(l>m); // False
        System.out.println(l<m); // True
        System.out.println(l>=m); // False
        System.out.println(l<=m); // True
         
        //Logical Operators
        int r,s;
        r=10; s=8;
         System.out.println(r==s && r!=s); // False
         System.out.println(r==s || r!=s); // True
        
       
        
                }
}
