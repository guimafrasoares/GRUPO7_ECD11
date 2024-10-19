package com.mycompany.app;

public class HelloWorld {
	private String name;

	public HelloWorld(String name) {
		this.name = name;
	}

	public String getHello() {
		return "Hello world, " + name;
	}
}
