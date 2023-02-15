package VariableTypes;

public class Overloading {
	int a;
	int b;
	int c;
	int d;

	public static void main(String[] args)
	{
	 Overloading o=new Overloading();
	o.add(100, 200);
	o.add(100, 200, 300);
	o.add(100, 200, 300, 400);
	}

	public void add(int a, int b)
	{
	int sum=a+b;
	System.out.println("Sum is "+sum);
	}

	public void add(int a, int b, int c)
	{
	int sum=a+b+c;
	System.out.println("Sum is "+sum);
	}
	public void add(int a, int b, int c, int d)
	{
	int sum=a+b+c+d;
	System.out.println("Sum is "+sum);
	}	

}
