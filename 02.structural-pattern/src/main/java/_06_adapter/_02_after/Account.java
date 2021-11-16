package _06_adapter._02_after;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Builder
public class Account {

	private String name;
	private String password;
	private String email;
}
