package interfaceStudy;

public class ImpleClass implements MyInterface  {

	public static void main(String[] args) 
	{
		ImpleClass i=new ImpleClass();
		i.test1();
		i.test2();
		i.test3();
		
	    System.out.println("======================");
	    
		System.out.println("Value of variable is "+i.a);

	}

	@Override
	public void test1() 
	{
	System.out.println("Test1 method from interface");	
		
	}

	@Override
	public void test2() 
	{
		System.out.println("Test2 method from interface");
		
	}
	
	public void test3()
	{
		System.out.println("Own method of Implementation class");
	}

}
