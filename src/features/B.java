package features;

import java.util.Scanner;

public class B extends A {

	 int b;
     public
    	 void get()
    	 {
    	    System.out.println("Enter the value of b:");
    	    Scanner sc=new Scanner(System.in);
    	    b=sc.nextInt();
    	 }
         void put()
         {
        	 System.out.println("Value of b is:"); 
        	 System.out.println(b);
         }
    
}
