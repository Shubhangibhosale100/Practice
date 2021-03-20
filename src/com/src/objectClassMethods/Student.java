package com.src.objectClassMethods;

public class Student implements Cloneable {

	private int roll_no;
	private String name;
	private String Address;
	
	Student(){}
	
	Student(int roll_no,String name,String Address)
	{
		this.roll_no=roll_no;
		this.name=name;
		this.Address=Address;
	}
	
	public String toString(){
		return "Name="+name+" "+"Address="+Address;
	}
	
	public int hashCode() {
		return roll_no;
	}
	
	public boolean equals(Student s2)
	{
		if(((s2.roll_no)==(this.roll_no))&&(s2.name.equals(this.name))&&(s2.Address.equals(this.Address))){
			return true;
		}
		return false;
	}
	
	public void finalize()
	{
		System.out.println("Finalize method called.");
		
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	

}
