package _12_proxy._03_java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import _12_proxy._02_after._02_DefaultGameService;
import _12_proxy._02_after._02_GameService;

public class ProxyInJava {

	public static void main(String[] args) {
		ProxyInJava proxyInJava = new ProxyInJava();
		proxyInJava.dynamicProxy();
	}
	
	private void dynamicProxy() {
		_02_GameService gameServiceProxy = getGameServiceProxy(new _02_DefaultGameService());
		gameServiceProxy.gameStart();
	}
	
	private _02_GameService getGameServiceProxy(_02_GameService target) {
		return (_02_GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(), 
				new Class[] {_02_GameService.class}, new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("Hello Dynamic Proxy");
						System.out.println("똥그라미");
						method.invoke(target, args);
						System.out.println("네모");
						return null;
					}
				});
	}
	
	
	
}
