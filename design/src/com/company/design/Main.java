package com.company.design;

import com.company.design.strategy.Base64Strategy;
import com.company.design.strategy.Encoder;
import com.company.design.strategy.EncodingStrategy;
import com.company.design.strategy.NormalStrategy;

public class Main {

	public static void main(String[] args) {
		/**
		 * Strategy
		 */
		Encoder encoder = new Encoder();
		
		//base 64
		EncodingStrategy base64 = new Base64Strategy();
		
		//nomal
		EncodingStrategy nomal = new NormalStrategy();
		
		String message = "hello java";
		encoder.setEncodingStrategy(base64);
		String base64Result = encoder.getMessage(message);
		System.out.println(base64Result);
		
		encoder.setEncodingStrategy(nomal);
		String nomalResult = encoder.getMessage(message);
		System.out.println(nomalResult);
		
		encoder.setEncodingStrategy(new AppendStrategy());
		String appendStrategy = encoder.getMessage(message);
		System.out.println(appendStrategy);
		
		
		/*
		 * facade
		 * 
		 *  Ftp ftpClient = new Ftp("www.naver.com", 22, "/home/etc");
		 * ftpClient.connect(); ftpClient.moveDirectory();
		 * 
		 * Writer writer = new Writer("text.tmp"); writer.fileConnect(); writer.write();
		 * 
		 * Reader reader = new Reader("text.tmp"); reader.fileConnect();
		 * reader.fileRead();
		 * 
		 * reader.fileDisConnect(); writer.fileDisConnect(); ftpClient.disConnect();
		 * 
		 * SftpClient sftpClient = new SftpClient("www.naver.com", 22, "home/etc",
		 * "text.tmp"); sftpClient.connect();
		 * 
		 * sftpClient.read();
		 * 
		 * sftpClient.disConnect();
		 */

		/*
		 * observer
		 * 
		 * Button button = new Button("버튼");
		 * 
		 * button.addListner(new IbuttonListener() {
		 * 
		 * @Override public void clickEvent(String event) { System.out.println(event); }
		 * });
		 * 
		 * 
		 * button.click("메시지 전달 :click1"); button.click("메시지 전달 :click2");
		 * button.click("메시지 전달 :click3"); button.click("메시지 전달 :click4");
		 */

		/**
		 * decorator
		 *//*
			 * Icar audi = new Audi(1000); audi.showPrice();
			 * 
			 * //a3 Icar audi3 = new A3(audi, "A3"); audi3.showPrice(); //a4 Icar audi4 =
			 * new A4(audi, "A4"); audi4.showPrice();
			 * 
			 * //a5 Icar audi5 = new A5(audi, "A5"); audi5.showPrice();
			 */

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

		/*
		 * Adapter
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
		 * proxy Browser browser = new Browser("www.google.com"); browser.show();
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

		/*
		 * proxy pattern AtomicLong start = new AtomicLong(); AtomicLong end = new
		 * AtomicLong();
		 * 
		 * IBrowser aopBrowser = new AopBrowser("www.naver.com", ()-> {
		 * System.out.println("before"); start.set(System.currentTimeMillis()); }, ()->
		 * { long now = System.currentTimeMillis(); end.set(now - start.get()); } );
		 * aopBrowser.show(); System.out.println("loading time : " +end.get());
		 * 
		 * aopBrowser.show(); System.out.println("loading time : " +end.get());
		 */

	}

	/*
	 * adapter
	 * 
	 * 
	 * // 콘센트 public static void connect(Electronic110V electronic110V) {
	 * electronic110V.powerOn(); }
	 */

}
