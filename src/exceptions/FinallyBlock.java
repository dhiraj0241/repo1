package exceptions;

public class FinallyBlock 
{

	public static void main(String[] args)
	{
	String a="abc";
	
	try
	{
	
		System.out.println(a.charAt(1));
	}
	
	finally
	{
	
		System.out.println("HI i am finally block");
	}
	}
}
