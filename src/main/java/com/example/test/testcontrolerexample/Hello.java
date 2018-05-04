package com.example.test.testcontrolerexample;

public class Hello {

	private String title;
	private String value;
	
	public Hello(String title, String value) {
		this.setValue(value);
		this.setTitle(title);
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
