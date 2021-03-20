package features;

class ParentClass{
	void print() {
		System.out.println("This is Parent Class");
	}
	
}

class ChildClass extends ParentClass{
	void print() {
		System.out.println("This is Child Class");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
	ParentClass p=new ParentClass();
	p.print();
	
	ChildClass c=new ChildClass();
	c.print();
	
	ParentClass p1=new ChildClass();
    p1.print();
	
	}
}
