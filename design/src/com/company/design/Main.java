package com.company.design;

import java.util.concurrent.atomic.AtomicLong;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;

public class Main {

	public static void main(String[] args) {
		/**
		 * singleton
		 * 
		 * 
		 * AClazz aClazz = new AClazz(); BClazz bClazz = new BClazz();
		 * 
		 * SocketClient aClient = aClazz.getSocketClient(); SocketClient bClient =
		 * bClazz.getSocketClient();
		 * 
		 * System.out.println("두개의 객체가 동일한가?");
		 * System.out.println(aClient.equals(bClient));
		 * 
		 * 
		 */
		
		/*Adapter
		 * 
		 * HairDryer hairDryer = new HairDryer(); connect(hairDryer);
		 * 
		 * Cleaner cleaner = new Cleaner(); // connect(cleaner); Electronic110V adapter
		 * = new SocketAdapter(cleaner); connect(adapter);
		 * 
		 * AirConditioner airConditioner = new AirConditioner(); Electronic110V
		 * airAdapter = new SocketAdapter(airConditioner);
		 * 
		 * connect(airAdapter);
		 */

		/*
		 * proxy
		 * Browser browser = new Browser("www.google.com"); browser.show();
		 * browser.show(); browser.show(); browser.show(); browser.show();
		 */
		
//		//처음만 proxy해주고 나머지는 cache해준다.
//		IBrowser browser = new BrowserProxy("www.naver.com");
//		browser.show();
//		browser.show();
//		browser.show();
//		browser.show();
//		browser.show();
//		browser.show();

		/*proxy pattern
		 * AtomicLong start = new AtomicLong(); AtomicLong end = new AtomicLong();
		 * 
		 * IBrowser aopBrowser = new AopBrowser("www.naver.com", ()-> {
		 * System.out.println("before"); start.set(System.currentTimeMillis()); }, ()->
		 * { long now = System.currentTimeMillis(); end.set(now - start.get()); } );
		 * aopBrowser.show(); System.out.println("loading time : " +end.get());
		 * 
		 * aopBrowser.show(); System.out.println("loading time : " +end.get());
		 */
		
		
	}
	
	/*adapter
	 * 
	 * 
	 * // 콘센트 public static void connect(Electronic110V electronic110V) {
	 * electronic110V.powerOn(); }
	 */
}
