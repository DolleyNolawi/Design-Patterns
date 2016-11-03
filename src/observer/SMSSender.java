package observer;

public class SMSSender implements Observer, DisplayElement{

	private double cbalance = 0.0;
	private double oldbalance ;
	private double balance = 9.0 ;
	private Account account;
	
	public SMSSender(Account account){
		this.account = account; 
		account.registerObserver(this);
	}
	
	@Override
	public void update(double balance , int acctNumber ) {
		oldbalance = cbalance;
		cbalance += balance;	
		display();
	}

	@Override
	public void display() {
		System.out.println("SMS balance message " + cbalance);		
	}

}
