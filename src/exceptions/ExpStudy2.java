package exceptions;

public class ExpStudy2 
{
	public static void main(String[] args) 
	{
		String a="abc";
		
		try 
		{
			System.out.println(a.charAt(2)); // risky code
			
			System.out.println("HI hello");
		} 
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("please select index range between 0-2");
		}
		
		System.out.println("Good Evening");
	}

}
