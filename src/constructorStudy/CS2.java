package constructorStudy;

// user defined constructor example
// this for initializing data members

public class CS2 {

	String city="Pune"; // variable declaration
	String name;
	
	public CS2() 
	{
	 name="Velocity"; // variable declaration in constructor
	}
	
	public static void main(String[] args) 
	{
		display1();
      CS2 c2= new CS2();
      c2.display();
	}
	
	public void display()
	{
		System.out.println("I am non static metod");
	     System.out.println("My city name is "+city);
	     System.out.println("My name is "+name);
	     
	    
	}
	
	

	public static void display1()
	{
		System.out.println("I am static display1 method ");
		 System.out.println("================================");
	}
	

}
