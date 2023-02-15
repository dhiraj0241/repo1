package patterns;

public class Eg9 {

	public static void main(String[] args) 
	{
		// Equilateral Triangle Upward With Space
		//   *
		//  * *
		// * * *
		//* * * *
		
	 int space=3;
     int star=1;
     
     for (int i=1; i<=4;i++)
     {
    	 for(int k=1;k<=space;k++)
    	 {
    		 System.out.print(" ");
    	 }
    	 
    	 for (int j=1;j<=star;j++)
    	 {
    		 System.out.print("* ");
    	 }
    	 System.out.println();
    	 space--;
    	 star++;
    	 
     }
		

	}

}
