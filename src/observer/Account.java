package observer;
import java.util.ArrayList;
import java.util.List;

public class Account implements Subject{
	
	public int acctNumber;
	public Customer customer;
	public List<AccountEntry> acctEntry;
	public double balance; 
	private ArrayList<Observer> observers;
	
	public Account(){
		observers = new ArrayList<Observer>();
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
		measurementsChanged();
	}
		
	public int getAcctNumber() {
		return acctNumber;
	}
	public void setAcctNumber(int acctNumber) {
		this.acctNumber = acctNumber;
		measurementsChanged();
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<AccountEntry> getAcctEntry() {
		return acctEntry;
	}
	public void setAcctEntry(List<AccountEntry> acctEntry) {
		this.acctEntry = acctEntry;
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	@Override
	public void notifyObservers() {
		for(Observer observer : observers){
			observer.update(balance , acctNumber);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
}
