package generalization;

public class  SBI implements RBI
{

	@Override
	public void deposit() {
		System.out.println("SBI deposit");
	}

	@Override
	public void withdrawl() {
		System.out.println("SBI withdrawl");
		
	}

	@Override
	public void loan() {
		System.out.println("SBI Loan");
		
	}

	@Override
	public void transfer() {
		System.out.println("SBI Transfer");
		
	}

}
