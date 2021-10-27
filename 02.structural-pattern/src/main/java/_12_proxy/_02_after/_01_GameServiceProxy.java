package _12_proxy._02_after;

public class _01_GameServiceProxy implements _01_GameService{
	
	private _01_GameService gameService;

	public _01_GameServiceProxy(_01_GameService gameService) {
		this.gameService = gameService;
	}


	@Override
	public void startGame() {
		long before = System.currentTimeMillis();
		gameService.startGame();
		System.out.println(System.currentTimeMillis() - before);
	}
	
}
