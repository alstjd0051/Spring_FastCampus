package com.company.design.observer;

public class Button {
	private String name;
	private IbuttonListener buttonListener;
	
	public Button(String name) {
		this.name = name;
	}
	
	public void click(String message) {
		buttonListener.clickEvent(message);
	}
	
	public void addListner(IbuttonListener butIbuttonListener) {
		this.buttonListener = butIbuttonListener;
	}
}
