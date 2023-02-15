package thisNsuper;

public class B extends A 
{
    int x=9;//non static global variable of Class B
	public static void main(String[] args) 
	{
	   B b=new B();
	   b.sum();
	}
	public void sum()
	{
		int x=19; // local variable
		
		int sum=x+10; //used local value of x;
		System.out.println("sum is "+sum);
		
		int sum1=this.x+10; // used global value of x from same class
		System.out.println("Sum is "+sum1);
		
		int sum2=super.x+10;//used global value x from super class
		System.out.println("Sum is "+sum2);
	}

}
