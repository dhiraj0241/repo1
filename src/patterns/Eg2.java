package patterns;

public class Eg2 {

	public static void main(String[] args) 
	{
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		
		//rows--> 5 columns--> 5
		//outer for loop-->rows
		
		for(int row=1; row<=5; row++)
		{
			//inner for loop for coloums
			for(int coloumn=1; coloumn<=5; coloumn++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}	
		
	}
}
