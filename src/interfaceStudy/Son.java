package interfaceStudy;

public class Son implements Father,Mother{

	public static void main(String[] args) 
	{
		Son s=new Son();
		s.money();
		s.experience();
		System.out.println("==================");
		s.love();
		s.cooking();
		System.out.println("==================");
		s.bike();
		s.mobile();
		System.out.println("=================");
		Father.test4();
		Mother.test2();
		System.out.println("==================");
		s.test();
		

	}

	@Override
	public void money() 
	{
	System.out.println("Fathers Money");	
		
	}

	@Override
	public void experience() {
		
		System.out.println("Fathers Experience");	
	}

	@Override
	public void love() {
		System.out.println("Mothers love");	
		
	}

	@Override
	public void cooking() 
	{
		System.out.println("Mothers Cooking");
		
	}
     
	public void mobile()
	{
		System.out.println("Sons Mobile");
	}
	
	public void bike()
	{
		System.out.println("Sons Bike");
	}

	@Override
	public void test() {
		// if methods from mother and father interfaces have same 
		// name then at that time we have to use super keyword for
		// default method calling, otherwise we can call directly in
		// main method by using the object created.
		
		Father.super.test();
		Mother.super.test();
	}
}
