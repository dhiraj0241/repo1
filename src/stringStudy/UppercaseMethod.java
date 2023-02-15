package stringStudy;

public class UppercaseMethod {

	public static void main(String[] args) 
	{
		String a="My Name is Khan and I'm Not a Terrorist.";
		System.out.println(a.toUpperCase());
        
		String a1=a.toUpperCase();
		System.out.println("Uppercase of "+a+" is "+a1);
		
		System.out.println("===========");
		
		System.out.println(a.toLowerCase());
		
		String a3=a.toLowerCase();
		System.out.println("Lowercase of "+a+" is "+a3);
		
		
		System.out.println(a.length());
		System.out.println(a1.length());
		System.out.println(a3.length());
	}

}
