package interfaceStudy;

public interface Mother 
{
    void love();
    void cooking();
    
    default void test()
    {
    	System.out.println("Mothers Test default method");
    }
    
    static void test2()
    {
    	System.out.println("Mothers test2 static method");
    }
}


