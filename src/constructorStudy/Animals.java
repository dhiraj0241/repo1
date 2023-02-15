package constructorStudy;

public class Animals{
	
	String name;
	float age;
	char gender;
	int serialNum;
	
	public Animals()  // zero parameter constructor
	{
	name="Tiger";
	age=3.2f;
	gender='M';
	serialNum=2;
	}
	
	public Animals(String myPet,float old,char gen,int cageNum)
	{
		name=myPet;
		age=old;
		gender=gen;
		serialNum=cageNum;
	}

	public static void main(String[] args) 
	{
       Animals cat=new Animals(); //use of default constructor
       cat.animalinfo();
       
       Animals zebra=new Animals("Zebra",9.5f,'F',21);
       zebra.animalinfo();
       
       Animals lion=new Animals("King Lion",11f,'M',12);
       lion.animalinfo();    
 
	}

	public void animalinfo()
	
	{   
		System.out.println("==================================");
		System.out.println("Animal Name is "+name);
		System.out.println("Animal Age is "+age);
		System.out.println("Animal Gender is "+gender);
		System.out.println("Animal serial no is "+serialNum);
		System.out.println("==================================");
		
	}
}