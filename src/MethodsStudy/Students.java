package MethodsStudy;

public class Students {

	public static void main(String[] args) 
	{
		// to call non static methods, we need to create object of a class
		// syntax--> className objectname = new classname();
		
		Students dhiraj = new Students(); //created object
		
		//now calling non static method we have to write syntax 
		
		dhiraj.studentInformation();
		
		// to call non static method from another class we have to 
		// create object first in this main method
		// we take example from rivers class
		Rivers ganga=new Rivers();
		ganga.flow();
		
		// calling non static method of bikes class
		
		Bike pulsar=new Bike();
		pulsar.ride();
		   
	}
public void studentInformation()
{
	System.out.println("My Information");
}
}
