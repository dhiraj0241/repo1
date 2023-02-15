package patterns;

public class Eg5 {

	public static void main(String[] args)
	{
		// *****
		//  ****
		//  ***
		//  **
		//   *

		// row 5, coloumn 5
		
		int space =0;
		int star= 5;
		
		//inner for loop--> column
		//space
		for(int row=1; row<=5; row++)
		{
			for(int i=1; i<=space; i++)
			{
				System.out.print(" ");
			}
			
			// star printing
			for(int coloumn=1;coloumn<=star; coloumn++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
		}
		
	}

}
