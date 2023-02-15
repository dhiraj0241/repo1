package asignments;

public class methods {

	public static void main(String[] args) {
	description();
	
	methods finance = new methods();
	finance.financials();
	}
public static void description()
{
	String name = "Tata Steel Ltd";
	String address="MIDC Industrial Area Nagpur Maharashtra";
	int gst=1234566789;
	String products="TMT Steel, Sections, Frames";
	float rating= 4.3f;
	int manpower = 1234;
	int turnover = 32836;
	
	System.out.println("=====================================================");
	System.out.println("           Company Overview           ");
	System.out.println("Name of Orgaization:- "+name);
	System.out.println("Address:- "+address);
	System.out.println("GSTIN Number:- "+gst);
	System.out.println("Products Manufactured are "+products);
	System.out.println("Overall Product Rating:- "+rating+ "Star");
	System.out.println("Total Manpower:-" +manpower);
	System.out.println("Annual Turnover:- $"+turnover +"million");
	System.out.println("======================================================");
	
}
public void financials()
{
int marketCap=129092;
int price=106;
float pe=3.31f;
float roce=31.6f;
int liabilities=282422;

System.out.println("==================*********================================");
System.out.println("              Financials          ");
System.out.println("TOtal Marketcap:-"+marketCap+"Cr.");
System.out.println("Share Price:- "+price+"Rs");
System.out.println("Stock P/E:- "+pe);
System.out.println("ROCE:- "+roce+"%");
System.out.println("Total Liabilities:- "+liabilities+"Cr");
System.out.println("=======================================================");

}
}
