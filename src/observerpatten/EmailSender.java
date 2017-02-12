package observerpatten;

public class EmailSender implements Observer , DisplayElement{

	private int acctNumber = 999999;
	private Account account;
	private double balance;
	
	public EmailSender(Account account){
		this.account = account;
		account.registerObserver(this);
	}
	
	
	@Override
	public void display() {
		System.out.println("New account number has created:  " + acctNumber );
	}

	@Override
	public void update(double balance , int acctNumber) {
		this.acctNumber = acctNumber;
		display();
	}

}
