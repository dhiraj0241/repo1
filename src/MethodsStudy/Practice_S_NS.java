package MethodsStudy;

public class Practice_S_NS {
	
	

	public static void main(String[] args)
	{
		Practice_S_NS.m1();
		
		Practice_S_NS dhiraj = new Practice_S_NS();
				dhiraj.m2();
		
	}
	
	public static void m1()
	{
		System.out.println("I am m1 from static method");
	}
	
		public void m2()
	
	{
		System.out.println("I am m2 from non static method");
	}
		public void m33()
		{
			System.out.println("I'm New method to call");
		}
}

