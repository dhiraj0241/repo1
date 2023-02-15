package thisNsuper;

public class ThisUse 
{
	//We should not create any static local variable
	
	int a=90; // non static global variable
	int b=80;
	
	static int c=10;

	public static void main(String[] args) 
	{
	
		 ThisUse tu=new ThisUse();
		 tu.addition();
		 

	}
    public void addition()
    {
    	int a=9; // local value of a
    	int b=1;
    	
    	int sum=a+b; // calling local value of a
    	System.out.println("Addition is "+sum);
    	
    	int sum1=this.a+b; // calling global value of a
    	System.out.println("Addition is "+sum1);
    }
}
