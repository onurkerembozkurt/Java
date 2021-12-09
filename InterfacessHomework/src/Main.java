  
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerManager customerManager=new CustomerManager();
		customerManager.customerDal=new MySqlCustomerDal();
		customerManager.add();
		
		
	}

}
