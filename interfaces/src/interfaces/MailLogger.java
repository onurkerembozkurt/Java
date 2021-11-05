package interfaces;

public class MailLogger implements Logger{

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("E mail gönderildi:"+message);
		//burayada e mail gönderilmesi için gereken kodlar
	}
	
	
}
