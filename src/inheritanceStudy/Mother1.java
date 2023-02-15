package inheritanceStudy;

public class Mother1 extends GrandMother1{

	public static void main(String[] args) 
	{
		stories();
		habbit();
		
		System.out.println("===========");
		
		Mother1 m=new Mother1();
		m.experience();
		m.nature();
		
	}
	
	public void nature()
	{
		System.out.println("Mother's Nature");
	}
	
	public static void habbit()
	{
		System.out.println("Mother's habbit");
	}
}
