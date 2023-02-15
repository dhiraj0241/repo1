package inheritanceStudy;

public class Mother extends GrandFather 
{

	public static void main(String[] args) 
	{
	  habbit();
	  
	  Mother m=new Mother();
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
