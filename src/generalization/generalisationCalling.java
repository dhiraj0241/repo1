package generalization;

public class generalisationCalling {

	public static void main(String[] args) {
		Axis a=new Axis();
		SBI s=new SBI();
		HDFC h=new HDFC();
		
		a.deposit();
		a.loan();
		a.transfer();
		a.withdrawl();
		a.netBanking();
		System.out.println("=============");
		
		s.deposit();
		s.loan();
		s.transfer();
		s.withdrawl();
		System.out.println("==============");
		
		h.deposit();
		h.loan();
		h.transfer();
		h.withdrawl();
		System.out.println("****************");

	}

}
