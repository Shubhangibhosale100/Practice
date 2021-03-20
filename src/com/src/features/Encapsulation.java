package com.src.features;

class Student {
	private int roll_no;
	private float marks;

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Student s = new Student();
		s.setRoll_no(1);
		s.setMarks(90);
		int r = s.getRoll_no();
		float m = s.getMarks();
		System.out.print("Roll No:");
		System.out.println(r);
		System.out.print("Marks:");
		System.out.println(m);
	}
}
