package _06_adapter._02_after;

import _06_adapter._02_after.security.UserDetails;
import _06_adapter._02_after.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService{

	private AccountService accountService;

	public AccountUserDetailsService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	@Override
	public UserDetails loadUser(String username) {
		Account account = accountService.findAccountByUsername(username);
		return new AccountUserDetails(account);
	}
	
}
