package com.wentong.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class XiaoMing implements FactoryBean<Object>, Person {

	private String regards;

	@Override
	public Object getObject() throws Exception {
		return new ZhangSan(regards);
	}

	@Override
	public Class<?> getObjectType() {
		return ZhangSan.class;
	}

	@Override
	public void sayHello() {
		System.out.println("Greetings from xiaoming: " + regards);
	}

	public void setRegards(String regards) {
		this.regards = regards;
	}
}
