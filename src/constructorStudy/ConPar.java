package constructorStudy;

public class ConPar{ 
// this is the example of user defined zero parameter


 public ConPar() // this is called when the object is created only
{
	System.out.println("Zero Parameter Constructor is Running");
}


 public static void main(String[] args) 
	{
		
ConPar c=new ConPar();
c.test();
	}
	
public void test()
{
	 System.out.println("Test is running");
}

}

