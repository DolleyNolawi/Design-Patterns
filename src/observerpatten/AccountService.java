package observerpatten;
import java.util.List;


public interface AccountService {

	void createAccount(int num, Customer c, AccountEntry e, double balance);
	void withdraw(int amt);
	void deposit(int amt);
	void transferFunds();
	List<AccountEntry> getAllAccounts();
	AccountEntry getAccount(int number);
	void addInterest();
}
