package features;

public class MethodOverloading {
	void add() {
		int sum=5+6;
		System.out.print("Sum Is:");
		System.out.println(sum);
	}

	void add(int a, int b)
	{
		int sum=a+b;
		System.out.print("Sum Is:");
		System.out.println(sum);
	}
	
	void add(double a,double b)
	{
		double sum=a+b;
		System.out.print("Sum Is:");
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		MethodOverloading m=new MethodOverloading();
		m.add();
		m.add(7,8);
		m.add(2.1,3.2);
	}
}
