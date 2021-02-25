package features;

class Student{
	int roll_no;
	float marks;
	public void getdata(int a,float b)
	{
		roll_no=a;
		marks=b;
	}
	public void putdata()
	{
		System.out.print("Roll No:");
		System.out.println(roll_no);
		System.out.print("Marks:");
		System.out.println(marks);
		
	}
}
public class Encapsulation {
   public static void main(String[] args)
   {
	   Student s=new Student();
	   s.getdata(1, 90);
	   s.putdata();
   }

}
