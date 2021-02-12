package src;

import java.util.Scanner;

public class Linkedlist
{

      void printlinkedlist(Node head)
       {
          Node current;
          current=head;
           while(current!=null)
          {
            System.out.println(current.data);
            current=current.next;
          }
       }
      
      //To calculate size of the linked list
      int length(Node head)
      {
         int count=0;
         Node temp;
         temp=head;
         while(temp!=null)
         {
          count++;
          temp=temp.next;
         }
         return count;
      }

      //Reverse the linkedlist
      void reverse(Node head)
      {
         Node p=head,q=head;
         int len;
         int i,j,temp;
         int k;
         i=0;
         len=length(head);
         j=len-1;
         while(i<j)
         {
           k=0;
           while(k<j)
           {
             q=q.next;
             k++;
           }

           temp=p.data;
           p.data=q.data;
           q.data=temp;

           i++;
           j--;
        
           p=p.next;
           q=head;
         }
      }

      //Search and print second last element of the Linkedlist
      void second_last(Node head)
      {   
         Node current;
         current=head;
         while(current.next.next!=null)
         {
           current=current.next;
         }
         System.out.println(current.data);
      }   

      
      public static void main(String[] args)
      {    
          Node head=null,current=null;
          Linkedlist sList = new Linkedlist(); 
          System.out.println("how many elements you want:");
          Scanner sc= new Scanner(System.in); 
		  int size= sc.nextInt();
		  for(int i=0;i<size;i++)
		  {
			System.out.println("Enter the data:");
		    int data= sc.nextInt();  
            Node newNode = new Node(data);
            if(head==null)
  	        {
  	          head=newNode;
  	          current=newNode;
  	        }
  	        else
  	        {
  	          current.next=newNode;
  	          current=newNode;
  	        }
		  }    
          
		  
          //Displays the nodes present in the list   
		  System.out.println("Linklist is:");
          sList.printlinkedlist(head);
          
          //Diplays reversed linked list
          System.out.println("Reverse is:");
          sList.reverse(head);
          sList.printlinkedlist(head);
          
          //Displays second last element of the linked list
          System.out.println("Second last element is:");
          sList.second_last(head);
	 
	 
      }
}