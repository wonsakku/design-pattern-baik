package _12_proxy._02_after;

import util.CommonUtil;

public class _02_DefaultGameService implements _02_GameService {

	@Override
	public void gameStart() {
		System.out.println("소환사의 협곡에 오신 것을 환영합니다.");
		CommonUtil.sleep(10);
	}
}
