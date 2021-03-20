package com.src.objectClassMethods;


public class Test {
   public static void main(String[] args) throws CloneNotSupportedException{
	   Student s1=new Student(101,"sam","Delhi");
	   Student s2=new Student(101,"sam","Delhi");
	   System.out.println(s1.toString());
	   System.out.println(s1.hashCode()); 
	   System.out.println(s2.toString());
	   System.out.println(s2.hashCode());
	   
	   boolean res=s1.equals(s2);
	   System.out.println(res);
	   
	   Student s3=new Student();
	   Student s4=new Student();
	   s3=null;
	   s4=null;
	   System.gc();
	   
	   Student s5=(Student)s1.clone();
	   System.out.println(s5.toString());
	   
	   System.out.println(s1.getClass().getSimpleName());
	   
	  }
}
