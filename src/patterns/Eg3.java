package patterns;

public class Eg3 {

	public static void main(String[] args) 
	{
		// *
		// **
		// ***
		// ****
		// *****
		
		int star=1;
		
		//outer for loop 
		for (int row=1; row<=5; row++)
		{
			for (int coloumn=1; coloumn<= star; coloumn++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
	}
}
