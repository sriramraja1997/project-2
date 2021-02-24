package org.tcs.test;

public class POM1 extends Resuseable {
	public static void main(String[] args) throws InterruptedException {
		getDriver();
		loadUrl("https://www.facebook.com/");
		maxWindow();
		POM p =  new POM();
		typeInput(p.getEmail(), "sriram");
		typeInput(p.getPass(),"siram");
		Thread.sleep(2000);
		btnClick(p.getLog());
		
		
	}

}
