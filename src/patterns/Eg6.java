package patterns;

public class Eg6 {

	public static void main(String[] args)
	{
		//     *
		//     **
		//     ***
		//    * * * *
		//   * * * * *
		
		int space=4;
		int star=1;
		
		for(int row=1; row<=5;row++)
		{
			//inner for loop--> colouns
			for(int i=1;i<=space;i++)
			{
				System.out.print(" ");
			}
			
			for(int coloumn=1; coloumn<=star; coloumn++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			star++;
			space--;
		}

	}

}
