package stringStudy;

public class EqualsMethod {

	/* == is a operator--> check memory location
	 * equals() is a method --> check string content
	 * equalsIgnoreCase()--> check for memory location 
	 *                       by ignoring case sensitiveness
	 */
	
	public static void main(String[] args) 
	{
	  String a1="Pulsar";
	  String a2="ulsar";
//	  String a3="pulsar";
//      String a4=new String("Pulsar");
//      String a5=new String("Pulsar");
      
      System.out.println(a1==a2);
      do
      {
    	  System.out.println("My Bike is Pulsar"); 
      }
      while (a1.equalsIgnoreCase(a2));
      {
    	  System.out.println("My Bike is Honda");
    	 boolean a6=(a1!=a2);
      }
      
      System.out.println("Hi "+( 12+12));
      System.out.println((12+12)+" Hi "+( 12+12));
//      else
//      {
//    	  System.out.println("My Bike is Honda");
//      }

	}

}
