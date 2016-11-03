package observer;

public class Main {

	public static void main(String[] args) {
		Account account = new Account();
		Logger logger = new Logger(account);	
		SMSSender smssender = new SMSSender(account);
		EmailSender emailSender = new EmailSender(account);
		
		account.setBalance(100.09);
		account.setBalance(2.91);
		account.setAcctNumber(192837);
		
		
		System.out.println("========== Remove sms Sender ========= \n");
		account.removeObserver(smssender);		
		account.setBalance(200.0);
	}

}
