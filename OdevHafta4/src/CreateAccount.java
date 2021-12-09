
public class CreateAccount extends BaseToDoSomethingAccount{
	
	public CreateAccount(String ad, String soyAd, int birthdate, int tcNo) {
		super(ad, soyAd, birthdate, tcNo);
		// TODO Auto-generated constructor stub
	}

	BaseToDoSomethingAccount createAccountDetails=new BaseToDoSomethingAccount("Kerem","Bozkurt",25,489);
	
	public void createAccount() {
	createAccountDetails.ad();
}
}
