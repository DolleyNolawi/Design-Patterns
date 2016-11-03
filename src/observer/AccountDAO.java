package observer;
import java.util.List;


public interface AccountDAO {
	void saveAccount(Account acct);
	void updateAccount(Account acct);
	Account loadAccount(int number);
	List<Account> getAccounts();
}
