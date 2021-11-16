package _06_adapter._02_after;

public class AccountService {

	public Account findAccountByUsername(String username) {
		return Account.builder()
				.name(username)
				.password(username)
				.email(username)
				.build();
	}
	
	public void createNewAccount(Account account) {
		
	}
	
	public void updateAccount(Account account) {
		
	}
	
}
