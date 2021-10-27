package _12_proxy._02_after;

public class _02_GameServiceProxy implements _02_GameService{

	private _02_GameService gameService;
	
	@Override
	public void gameStart() {
		
		long before = System.currentTimeMillis();
		
		// 인증 등 이러저러한 로직 추가
		
		// Lazy Initialization
		if(this.gameService == null) {
			this.gameService = new _02_DefaultGameService();
		}
		
		gameService.gameStart();
		System.out.println(System.currentTimeMillis() - before);
		
		// 리턴 타입이 있는 경우 캐싱 기능 등 추가 가능 
		// DefaultGameService는 gameStart만 기능을 하고 
		// 부가적인 기능은 proxy에서 한다. -> 객체지향 단일책임원칙 
	}
}
