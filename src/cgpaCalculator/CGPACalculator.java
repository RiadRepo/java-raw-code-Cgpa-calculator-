
package cgpaCalculator;

import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        String name;
        String roll;
        int y=0;
        int a;
        int b;
        int c = 0;
        int d;
           int n;double res=0; double cra=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        name = sc.nextLine();
        System.out.println("Enter Your Roll :");
        roll =sc.nextLine();
        System.out.println(" ");
        System.out.println("welcome :"+name);
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                         Cgpa Calculator                        ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("1. Cgpa Calculation    ");
        System.out.println("2. About    ");
        System.out.println("0. Exit    ");
        do{
            System.out.println("press to your command :");
            a = sc.nextInt();
         if(a==1){
             
             System.out.println("How many subject in This semester??");
                n = sc.nextInt(); 
                double x[]=new double[n];
                 double z[]=new double[n];
            System.out.println("enter your "+n+" cradit number");
                  for(int i=0;i<n;i++)
	            z[i]=sc.nextDouble();
                  for(int i=0;i<n;i++)
	            cra =cra+z[i];
            System.out.println("enter   "+n+"  numbers");
 
                  for(int i=0;i<n;i++)
	             x[i]=sc.nextDouble();
 
                  for(int i=0;i<n;i++)
            
	  
	            res += x[i]*z[i];
       
 	      System.out.println(" "+res); 	    
             System.out.println("average="+res/cra);
         
         
             }
           
         if(a==2){
             System.out.println(" it is a cgpa calculator !! created by Riad ");
             
         }
            System.out.println("");
            System.out.println("");
            System.out.println("Do you want to continue the calculation press 1 /otherwise press 0 ");
            y=sc.nextInt();
        }
        while(y!=0);
        System.out.println("Thank You :"+name);
        
    }
    
    
    
    
    
}
