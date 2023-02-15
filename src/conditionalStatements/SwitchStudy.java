package conditionalStatements;

public class SwitchStudy {

	public static void main(String[] args) {
	// 1. Today is Monday
	//2. today is tuesday
	/*3. today is wednesday
	 * 4. today is thursday
	 * 
	 */

		int day=4; //key
		
		switch (day) 
		{
		case 1: System.out.println("Today is Monday");
		break;
		
		case 2: System.out.println("Today is Tuesday");
		break;
		
		case 3: System.out.println("Today is Wednesday");
        break;
        
		case 4: System.out.println("Today is Thursday");
		break;
		
		case 5: System.out.println("Today is Friday");
		break;
		
		case 6: System.out.println("Today Is Saturday");
		break;
		
		case 7: System.out.println("Today is Sunday");
		break;
		
		
		default:System.out.println("Please Enter A Valid Key");
		break;
		}
		
	}

}
