package generalization;

public class Axis implements RBI{

	@Override
	public void deposit() {
		
		System.out.println("Axis Deposit");
	}

	@Override
	public void withdrawl() {
		
		System.out.println("Axis Withdrawl");
	}

	@Override
	public void loan() {
		
		System.out.println("Axis Loan");
	}

	@Override
	public void transfer() {
		
		System.out.println("Axis Transfer");
	}
	
	public void netBanking()
	{
		System.out.println("Axis Netbanking");
	}
}
