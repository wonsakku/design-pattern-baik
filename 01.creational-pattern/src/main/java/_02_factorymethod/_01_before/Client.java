package _02_factorymethod._01_before;

public class Client {

	public static void main(String[] args) {
		Client client = new Client();
		
		Ship whiteShip = ShipFactory.orderShip("WhiteShip", "email@email.com");
		System.out.println(whiteShip);
		
		Ship blackShip = ShipFactory.orderShip("BlackShip", "email@email.com");
		System.out.println(blackShip);
		
		
	}
}
