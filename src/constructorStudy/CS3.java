package constructorStudy;

public class CS3 
// this is the ex of constructor with parameters
{
	int num1;
	int num2;
	int num3;
	
	public CS3() //  user defined without parameters
	{
		num1=10;
		num2=20;
		num3=30;
		
	}
	
	public CS3(int a)
	{
	num1=a;	
	}
	
	public CS3(int a, int b)
	{
		num1=a;
		num2=b;
	}
	
	public CS3(int a, int b, int c)
	{
		num1=a;
		num2=b;
		num3=c;
	}
	
	
	public static void main(String[] args) 
	{
		CS3 c=new CS3();
		c.addition();
		
		CS3 c1=new CS3(100);
		c1.addition();
		
		CS3 c2=new CS3(100, 200);
		c2.addition();
		
		CS3 c3=new CS3(100, 200, 300);
		c3.addition();
		
		

	}
	
	public void addition()
	{
		int sum=num1+num2+num3;
		System.out.println("Addition is  "+sum);
	}

}
