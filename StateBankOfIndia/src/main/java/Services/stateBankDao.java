package Services;

import Entity.Account;

public interface stateBankDao {
	
	
	Account findAccountById(int id);
	String saveAccount(Account account);
	String deleteAccountById(int id);
	String withdrawFromAccount(double amount,int accountId);
	String depositInAccount(double amount,int accountId);

}
