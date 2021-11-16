package _06_adapter._01_before;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Builder
public class Account {

	private String name;
	private String password;
	private String email;
}
