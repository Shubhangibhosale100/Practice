package src;
import java.util.*;

public class Binarysort {

	public static void main(String args[]) {
			System.out.print("Enter the size of array");
			Scanner sc= new Scanner(System.in); 
			int n= sc.nextInt();
		   int i,j,temp;
		   int a[] = new int [n];

			System.out.print("Enter the array");
		   for(i=0;i<n;i++)
		   {
		      a[i]=sc.nextInt();
		   }

		   i=0;
		   j=n-1;

		   while(i<j)
		   {
		     if(a[i]==0)
		     {
		       i++;
		     }
		     if(a[j]==1)
		     {
		       j--;
		       continue;
		     }
		     
		     if(a[i]>a[j])
		     {
		        temp=a[i];
		        a[i]=a[j];
		        a[j]=temp;
		        i++;
		        j--;
		     }
		   }
		    
		   System.out.print("Sorted Array is:");

		    for(i=0;i<n;i++)
		   {
		    	System.out.print(a[i]);
		   }

		  
	}
	
}
