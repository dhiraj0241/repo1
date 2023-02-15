package generalization;

public class HDFC implements RBI{

	@Override
	public void deposit() {
		System.out.println("HDFC Deposit");
		
	}

	@Override
	public void withdrawl() {
		System.out.println("HDFC Withdraw");
		
	}

	@Override
	public void loan() {
		System.out.println("HDFC Loan");
		
	}

	@Override
	public void transfer() {
		
		System.out.println("HDFC Transfer");
	}

}
