package edu.java.spring;

public class HelloClazz {

	public String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void printMessage() {
		System.out.println("Your message " + this.message);
	}
}
