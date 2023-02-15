package conditionalStatements;

public class IfElse {

	public static void main(String[] args) 
	{
		
//        // if marks are greater than 40 then pass
//		// if marks are less than 40 then fail
		
		int marks=50;
		if(marks>40)
		{
			System.out.println("I am Pass");
		}
		else
		{
			System.out.println("I am Fail");
		}
		
		
		
	    String signal="green";
	    if (signal=="red")
	    {
	    	System.out.println("Please Stop");
	    }
	    else
	    {
	    	System.out.println("Please Go");
	    }
	    
	    char gender='F';
	    if (gender=='F')
	    {
	    	System.out.println("You can enter in the bus");
	    }
	    else
	    {
	    	System.out.println("Sorry");
	    }
	    
	   String sig="red";
	   if (sig=="red")
	   {
		System.out.println("You have to stop anyhow");   
	   }
	}
	
}
