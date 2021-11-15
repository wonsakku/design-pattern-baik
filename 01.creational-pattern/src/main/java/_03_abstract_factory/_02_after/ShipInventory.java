package _03_abstract_factory._02_after;

import javax.xml.parsers.DocumentBuilderFactory;

import _02_factorymethod._02_after.Ship;
import _02_factorymethod._02_after.ShipFactory;

public class ShipInventory {

	public static void main(String[] args) {
		ShipFactory shipFactory = new WhiteshipFactory(new WhitePartsProFactory());
		Ship ship = shipFactory.createShip();
		System.out.println(ship.getAnchor().getClass());
		System.out.println(ship.getWheel().getClass());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());
		ship = shipFactory.createShip();
		System.out.println(ship.getAnchor().getClass());
		System.out.println(ship.getWheel().getClass());
		
//		DocumentBuilderFactory.newInstance();
	}
}
