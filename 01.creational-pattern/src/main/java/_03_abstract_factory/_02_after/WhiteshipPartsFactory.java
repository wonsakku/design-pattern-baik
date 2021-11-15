package _03_abstract_factory._02_after;

public class WhiteshipPartsFactory implements ShipPartsFactory{

	@Override
	public Anchor createAnchor() {
		return new WhiteAchor();
	}

	@Override
	public Wheel createWheel() {
		return new WhiteWheel();
	}

	
}
