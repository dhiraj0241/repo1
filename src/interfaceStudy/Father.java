package interfaceStudy;

public interface Father 
{
   void money();
   void experience();
   
   default void test()
   {
   	System.out.println("Fathers Test default method");
   }
   
   static void test4()
   {
   	System.out.println("Fathers test4 static method");
   }
}
