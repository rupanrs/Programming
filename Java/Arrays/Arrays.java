
package Arrays;

public class Arrays {
    public static void main(String args[]){
       /* 
        int a=10;
        int b=20;
        int c=30;
        int d=40;
        int e=50;
        int f=60;
        *****************************************
        
        int n=0;
        System.out.println("No 1= "+a);
        System.out.println("No 2= "+b);
        System.out.println("No 3= "+c);
        System.out.println("No 4= "+d);
        System.out.println("No 5= "+e);
        System.out.println("No 6= "+f);
        */
/* 
       //Integer Array
       int[] a={10,20,30,40,50,60};
       int x=0;
       while(true){
           System.out.println("No "+x+"="+(a[x]));
           x++;
           
       }
 
        //String Array
        String[] Names={"Rupan", "Jinea", "Mau", "Yathu", "Vanu", "miki", "thanu"};
        
        for (int i=0; i< Names.length; i++){
            System.out.println("Name "+i+" is "+Names[i]);
        }

     
        //Double Array
        Double[] weight={35.7d, 67.5d, 45.8d, 55.8d, 37.9d, 50d, 63.2d};
                
        for (int i=0; i< weight.length; i++){
            System.out.println("Weight "+i+" is "+weight[i]+" Kg");
        }

        //String Array
        String[] Names={"Rupan", "Jinea", "Mau", "Yathu", "Vanu", "miki", "thanu"};
        Double[] weight={35.7d, 67.5d, 45.8d, 55.8d, 37.9d, 50d, 63.2d};       
        for (int i=0; i< Names.length; i++){
            System.out.println(Names[i]+"'s weight is "+weight[i]+" Kg");
    
        }

        //Upadate Array Values
        String[] Names={"Rupan", "Jinea", "Mau", "Yathu", "Vanu", "miki", "thanu"};
        Double[] weight={35.7d, 67.5d, 45.8d, 55.8d, 37.9d, 50d, 63.2d};       
        
        Names[2]="Sanjeev";
        weight[2]=65.4d;

        for (int i=0; i< Names.length; i++){
            System.out.println(Names[i]+"'s weight is "+weight[i]+" Kg");
    
        }
*/
        //Largest number in array
        double[] numArray = { 23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5, 99 };

        double larger= numArray[0];
        for (int i=0; i< numArray.length; i++){
            if (larger < numArray[i]){
                larger = numArray[i];
            }
        }
        System.out.println("The big no is "+larger);
 
    }
    
}
