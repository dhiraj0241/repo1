package stringStudy;

public class StringStudy 
{
  public static void main (String [] args)
  {
	//length() method use
		
			String a="Velocity";
			
			System.out.println(a.length());
			
			
			String a1=" Pune  ";
			
			System.out.println(a1.length());
			//directly printing--> we can't reuse
			
			String a2=" ";
			System.out.println(a2.length());
			
			
			//storing in ref variable--> can reuse the value
			int lengthOfA2 = a2.length();
			System.out.println(lengthOfA2);
			System.out.println("===================");
			
			
			//toUppercase() method use
			
			
			String b="velocity";
			
		System.out.println(	b.toUpperCase()); // directly printing the values
		
		
		String b1 = b.toUpperCase();
			
			System.out.println("Upper case of " +b+" is "+b1); 
			
			
		// toLowercase() method use 
			
		String c="VELOCITY";
		System.out.println(c.toLowerCase());
		String c1 = c.toLowerCase();
		System.out.println(c1);
		System.out.println(c1.toUpperCase());
		System.out.println(c1.length());
		System.out.println("==========================================");
		
		
		//equals() method use
		String d1="Pune";
		String d2="Pune";
		String d3= new String("Pune");
		String d4= new String("Pune");
		String d5="pune";
		System.out.println(d1==d2);
		System.out.println(d2==d3);
		System.out.println(d3==d4);
		System.out.println("====================");
		
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d4));
		System.out.println(d3.equals(d4));
		System.out.println(d1==d5);
		System.out.println(d1.equals(d5));
		System.out.println("========================");
		
		
		// equalsIgnoreCase() method use
		String e1="Pune";
		String e2="pune";
		String e3= new String("Pune");
		String e4= new String("pune");
		System.out.println(e1.equalsIgnoreCase(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e2.equalsIgnoreCase(e3));
		System.out.println(e3.equals(e4));
		System.out.println(e3.equalsIgnoreCase(e4));
		System.out.println("========================");
		
		//contains() method use
		String f1="Velocity";
		System.out.println(f1.contains("ve"));
		System.out.println(f1.contains("city"));
		System.out.println(f1.contains("elo"));	
			
  }
}
