package asignments;

public class NonStatic {

	public static  void main(String[] args) 
	{
		
      NonStatic n= new NonStatic();
      n.substraction();
      n.addition();
	}
	
	public void addition()
	{
		System.out.println("I am also non static");
	}
	
	
	public void substraction()
	{
		System.out.println("I am non static to be called in non static");
	}
	
}
