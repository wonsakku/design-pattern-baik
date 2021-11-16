package _06_adapter._02_after;

import _06_adapter._02_after.security.LoginHandler;
import _06_adapter._02_after.security.UserDetailsService;

public class App {

	public static void main(String[] args) {
		AccountService accountService = new AccountService();
		UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
		LoginHandler loginHandler = new LoginHandler(userDetailsService);
		String login = loginHandler.login("sakku", "sakku");
		System.out.println(login);
	}
}
