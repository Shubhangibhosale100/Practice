package features;

class ParentClass1{
	public void print() {
		System.out.println("This is Print Method of Parent Class");
	}
	
}

class ChildClass1 extends ParentClass1{
	public void show()
	{
		System.out.println("This is Show Method of Child Class");

	}
}
public class Inheritance {
	public static void main(String[] args)
	{
	ChildClass1 c=new ChildClass1();
	c.print();
	c.show();
	}
	
}
