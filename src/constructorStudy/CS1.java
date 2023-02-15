package constructorStudy;

public class CS1 
{
  //example of default constructor
 // public CS1()---> default constructor provided by compiler
	//{
		
	//}
	
	
	public static void main(String[] args) 
	{
		CS1 d=new CS1();
		d.display();

	}
	
	public void display()
	{
		System.out.println("I am display method, I am non static");
	}

}
