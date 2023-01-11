package com.wentong.beans.factorybean;

public class ZhangSan implements Person{

	String regards;

	@Override
	public void sayHello() {
		System.out.println("Greetings from zhangsan: " + regards);
	}

	public ZhangSan(String regards) {
		this.regards = regards;
	}
}
