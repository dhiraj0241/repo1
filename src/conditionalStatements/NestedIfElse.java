package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
	
		// loginid and password
		
		String UN="Velocity123";
		String PWD="Pass@$%&123";
		
		if (UN=="Velocity123")
		{
			System.out.println("Username is corect,Please enter password");
	
			if (PWD=="Pass@$%")
			{
				System.out.println("Correct password. Login Success");
			}
			else
			{
				System.out.println("Incorrect password, Please Check Again");
			}
		}
		
		else
		{
			System.out.println("Incorrect USername, Please Check Again");
		}
			
	
				
				

	}

}
