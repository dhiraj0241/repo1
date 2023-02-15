package abstractClass;

public class ConcreteClass  extends Test{

	public static void main(String[] args) 
	{
		ConcreteClass c=new ConcreteClass();
		c.demo1();
		c.demo2();
		c.demo3();
	}

	@Override
	public void demo3() {
		System.out.println("I'm overrided method Demo3");
		
	}
	}