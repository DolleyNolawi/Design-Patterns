package observer;

public class Logger implements Observer, DisplayElement{
    private double currentbalance = 3.0;
    private double oldbalance;
    private Account account; 
    
    public Logger(Account account){
    	this.account = account;
    	account.registerObserver(this);    	
    }
    
	@Override
	public void update(double balance, int accNumber) {		
		oldbalance = currentbalance;
		currentbalance = balance;
		display();
	}
    
	public void display(){
		System.out.println("the current balance is:   " + currentbalance );
	}
}
