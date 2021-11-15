package _02_factorymethod._02_after;

public class Client {

	public static void main(String[] args) {
		
//		Ship whiteShip = new WhiteShipFactory().orderShip("Whiteship", "email@email.com");
//		System.out.println(whiteShip);
//		
//		Ship blackShip = new BlackShipFactory().orderShip("blackship", "email@email.com");
//		System.out.println(blackShip);

		// 의존성 주입으로 클라이언트쪽 코드도 변화없이...
		Client client = new Client();
		client.print(new WhiteShipFactory(), "whiteship", "email@email.com");
		client.print(new BlackShipFactory(), "blackship", "email@email.com");
		
	}

	private void print(ShipFactory shipFactory, String name, String email) {
		System.out.println(shipFactory.orderShip(name, email));
	}
}
