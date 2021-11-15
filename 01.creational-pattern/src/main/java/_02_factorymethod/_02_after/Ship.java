package _02_factorymethod._02_after;

import _03_abstract_factory._02_after.Anchor;
import _03_abstract_factory._02_after.Wheel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter
@Setter
public class Ship {

	private String name;
	private String color;
	private String logo;
	private Wheel wheel;
    private Anchor anchor;
	
}
