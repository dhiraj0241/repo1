package exceptions;

public class MultipleCatchBlocks {

	public static void main(String[] args) 
	{
		String a= "abcd";
		
		try 
		{
			System.out.println(a.charAt(9)); // risky code
		} 
		
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("index range should be 0--1");
		}
		
		catch (NullPointerException e) 
		{
		
			System.out.println("a value should not be null");
		}
		

	}

}
