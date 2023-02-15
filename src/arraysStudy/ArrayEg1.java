package arraysStudy;

public class ArrayEg1 {

	public static void main(String[] args) {
		// • Array is data structure used to store homogeneous collection of information.
		// • Array declaration need to be done with capacity
		// • Arrays are not growable in nature (fix size)
		// • Array is nothing but an object
		// • Inside array index will be present, array index starts form zero
		//Hi how are you-->
		
		//1. Array declaration
		String [] name= new String[10];
		
		//2.Array initialization -->assign values
		name[0]="hi";
		name[1]="how";
		name[2]="are";
		name[3]="you";
		//name[11]=null;
		
		//usage
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		
		//for loop
		System.out.println("=========using static for loop===========");
		
		for(int i=0;i<=4;i++)//0,1,2,3,4
		{
		System.out.println(name[i]);
		}
		
		System.out.println("=========using dynamic for loop===========");
		
		for(int i=0;i<=name.length-1;i++)
		{
		System.out.println(name[i]);
		}

	}

}
