package _03_abstract_factory._02_after;

import _02_factorymethod._02_after.DefaultShipFactory;
import _02_factorymethod._02_after.Ship;
import _02_factorymethod._02_after.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory{

	private ShipPartsFactory shipPartsFactory;

	public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
		this.shipPartsFactory = shipPartsFactory;
	}

	@Override
	public Ship createShip() {
		Ship ship = new WhiteShip();
		ship.setWheel(shipPartsFactory.createWheel());
		ship.setAnchor(shipPartsFactory.createAnchor());
		return ship;
	}

	
	
}
