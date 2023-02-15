package inheritanceStudy;

public class Son extends Mother
{   
	// this class is example of multilevel inheritance
	
	public static void main(String[] args) 
	{
	  Son s=new Son();
	  s.nature();
	  s.laptop();
	  s.experience();
	  
	  bike();
	  habbit();
	  stories();
	  
	}
	
	public void laptop()
	{
		System.out.println("Son's Laptop");
	}
	
	public static void bike()
	{
		System.out.println("Son's Bike");
	}

}
