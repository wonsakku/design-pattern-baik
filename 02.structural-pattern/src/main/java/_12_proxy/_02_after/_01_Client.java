package _12_proxy._02_after;

public class _01_Client {

	public static void main(String[] args) {
		
		_01_GameService gameService = new _01_GameServiceProxy(new _01_DefaultGameService());
		gameService.startGame();
	}
}
