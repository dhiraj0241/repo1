package MethodsStudy;

public class MethodUse {

	public static void main(String[] args) {
		addition();
        DemoClass.demo();
        
      MethodUse m22= new MethodUse();
      m22.multiplication(100, 200);
        
	}
   public static void addition()
   {
	int a=10;
	int b=20;
	int sum=a+b;
	System.out.println("Addition is "+sum);
}

   public void multiplication(int a,int b)
   {
  //int a=100;
  //int b=200;
  int sum=a*b;
  System.out.println("Multiplication is "+sum);
}
}
   
