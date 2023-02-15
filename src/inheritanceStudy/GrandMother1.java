package inheritanceStudy;

public class GrandMother1 {

	public static void main(String[] args) 
	{
		stories();
		
		GrandMother1 g = new GrandMother1();
		g.experience();
	}	
	public static void stories()
	{
		System.out.println("Grandmother's Stories");
	}
	
	public void experience()
	{
		System.out.println("Grandmother's Experience");
	}

}
