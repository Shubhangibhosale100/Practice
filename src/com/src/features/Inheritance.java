package com.src.features;

class Parentclass {
	public void print() {
		System.out.println("This is Print Method of Parent Class");
	}
}

class Childclass extends Parentclass {
	public void show() {
		System.out.println("This is Show Method of Child Class");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Childclass c = new Childclass();
		c.print();
		c.show();
	}

}
