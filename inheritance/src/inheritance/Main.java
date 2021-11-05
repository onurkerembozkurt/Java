package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndividualCustomer eren=new IndividualCustomer();
		eren.customerNumber="123456";
		
		
		
		
		CorporateCustomer GendoIkari=new CorporateCustomer();
		GendoIkari.customerNumber="78910";
		
		
		SendikaCustomer abc=new SendikaCustomer();
		abc.customerNumber="99999";
		
		
		CustomerManager customerManager= new CustomerManager();
		Customer[] customers= {eren,GendoIkari,abc};
		customerManager.addMultiple(customers);
		
	}

}
