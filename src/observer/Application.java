package observer;


public class Application {

	public static void main(String[] args) {
		
		
		//let us create account 
		/*
		 * 1, we need to create customer.
		 * 2, we need to create account entry.
		 * 3, we can ask to accountService to create account for us.
		 * 
		 * */
		
		Customer customer = new Customer("meron");
		AccountEntry accEntry = new AccountEntry("10/28/16",800,"savings",1234,"Abebe");
		AccountService accService = new AccountServiceimpl();
		accService.createAccount(1, customer, accEntry, 0);
		
		
		System.out.println("---------");
		System.out.println(accEntry.amount);
		System.out.println("---------");

	}

}
