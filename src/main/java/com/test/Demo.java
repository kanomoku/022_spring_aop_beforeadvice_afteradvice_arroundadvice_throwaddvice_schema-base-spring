package com.test;

public class Demo {
	public void demo1() {
		System.out.println("demo1");
	}
	public void demo2() {
		System.out.println("demo2");
	}
	public void demo3() {
		System.out.println("demo3");
	}
	public void demo4(String name) {
		System.out.println("demo4  "+name);
		int a=5/0;
	}
	public String demo5(String name) {
		System.out.println("demo5  "+name);
		return name;
	}
}
