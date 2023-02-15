package polymorphism;

public class MethodOverloading 
{
   /* Based on Arguments Passed
    * also known as Compile time polymorphism
    * Early binding
    * can't do rebinding thats'why called static binding 
    */
	
	public static void main(String[] args) 
	{
		MethodOverloading m=new MethodOverloading();
		m.addition();
		m.addition(100, 200);
		m.addition(100, 200.50f, 300);

	}
	
	public void addition()
	{
		int a=10;
		int b=20;
	    int sum=a+b;
	    System.out.println("Addition is "+sum);
	    	
	}
	
	public void addition(int a, int b)
	{
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}
	
	public void addition(int c, float d, int e)
	{
		float sum=c+d+e;
		System.out.println("Addition is "+sum);
	}

}
