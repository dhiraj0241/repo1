package accessSpecifiers;

public class Demo {
	
	private int a=20;// private, visible within class
	int b=30; // default, visible only within package
	protected int c=40; // visible only within package but using inheritance can be used outside of package
	public int d=50; // visible throughout the project
	

	public static void main(String[] args) 
	{
		Demo p=new Demo();
		p.test1();
		p.test2();
		p.test3();
		p.test4();
		
		System.out.println("============================");
		
		System.out.println("callin private variable "+p.a);
		System.out.println("Calling default variable "+p.b);
		System.out.println("calling protected variable "+p.c);
		System.out.println("Calling public variable "+p.d);
	}
	
	private void test1()
	{
		System.out.println("Test1 private method");
	}
	
    void test2()
    {
    	System.out.println("Test2 default method");
    }
    
    protected void test3()
    {
    	System.out.println("Test3 protected method");
    }
    
    public void test4()
    {
    	System.out.println("Test4 public method");
    }
 
}
