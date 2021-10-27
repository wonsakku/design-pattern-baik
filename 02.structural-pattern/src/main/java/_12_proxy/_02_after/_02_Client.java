package _12_proxy._02_after;

public class _02_Client {
	public static void main(String[] args) {
		_02_GameService gameService = new _02_GameServiceProxy();
		gameService.gameStart();
	}
}
