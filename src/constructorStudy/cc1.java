package constructorStudy;

public class cc1 
{
	int x;//global variable declared
	int y;//global variable declared
	
	public cc1()
	{
	System.out.println("This is user defined constructor");
	x=8;
	y=9;
	System.out.println("Value of x by constructor is "+x);
	System.out.println("Value of y by constructor is "+y);
	}
	
	public static void main(String[] args) 
	{
	cc1 c1=new cc1();
	c1.addition();
    c1.multiplication();
    c1.division();
	}
    public void addition()
{
	int a=10;
	int b=20;
	int sum=a+b;
	System.out.println("Sum is "+sum);
}

    public  void multiplication()
    {
      x=100;
      y=200;
      int mul =x*y;
     
    System.out.println("Multiplication is "+mul);
    }
    
   public void division()
   {
	   x=23;
	   y=12;
	   int div =x/y;
	   System.out.println("Division is "+div);
   }
}


