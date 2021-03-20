package com.src.features;

class Parent {
	void print() {
		System.out.println("This is Parent Class");
	}

}

class Child extends Parent {
	void print() {
		System.out.println("This is Child Class");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.print();
		Child c = new Child();
		c.print();
		Parent p1 = new Child();
		p1.print();
	}
}
