package abstractReCap;

public class CustomerManager {

	BaseDataBaseManager dataBaseManager;
	
	
	public void getCustomers() {
		//OracleDataBaseManager oracleDataBaseManager=new OracleDataBaseManager();
		//bunu yaparsak yarragı yedik, bağımlıyız !
		// bunun yerine bunların extend ettiği sınıftan ulaşabiliriz
		dataBaseManager.getData();
}




}
