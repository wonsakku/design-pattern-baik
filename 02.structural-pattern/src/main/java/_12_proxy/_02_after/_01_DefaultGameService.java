package _12_proxy._02_after;

import util.CommonUtil;

public class _01_DefaultGameService implements _01_GameService{

	@Override
	public void startGame() {
		System.out.println("소환사의 협곡에 오신 것을 환영합니다.");
		CommonUtil.sleep(10);
	}

	
}
