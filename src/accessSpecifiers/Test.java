package accessSpecifiers;
 /* access Specifiers
  * access modifiers
  * access provider
  * visibility labels
  * this all are acronyms
  */
  
public class Test {
	
	private int a=10; // only within class only
	int b=20; // default--> visible only within package
	protected int c=30; // only within package, can be called outside using inheritance
    public int d=40; // visible throughout the project
    
	public static void main(String[] args) 
	{
		Test t= new Test();// created object of Test class
		t.demo1();//calling non static private method from same class
		t.demo2();//calling non static default method from same class
		t.demo3();//calling non static protected method from same class
		t.demo4();//calling non static public method from same class
		
		System.out.println("Calling private variable from same class "+t.a);
		System.out.println("Calling default variable from same class "+t.b);
		System.out.println("Calling protected variable from same class "+t.c);
		System.out.println("Calling public variable from same class "+t.d);
 
	}
	
private void demo1()
{
	System.out.println("Demo1 is private method");
}

void demo2()
{
	System.out.println("Demo2 is default method");
}

protected void demo3()
{
	System.out.println("Demo3 is a protected method");
}

public void demo4()
{
	System.out.println("Demo4 is a public method");
}

}
