package inheritanceStudy;

public class Son1 extends GrandMother1{

	public static void main(String[] args) 
	{
		stories();
		hardwork();
		
		Son1 s=new Son1();
		s.experience();
		s.study();
	}
	
	public static void hardwork()
	{
		System.out.println("Son's HArdwork");
	}
	
	public void study()
	{
		System.out.println("Son is Studious");
	}

}
