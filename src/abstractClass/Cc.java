package abstractClass;

public class Cc extends Demo {

	public static void main(String[] args) 
	{
		Cc m=new Cc();
		m.test1();
		m.test2();
		m.test3();

	}

	@Override
	public void test3() 
	{
	System.out.println("Test 3 method is completed in Concrete Class");	
		
	}

}
