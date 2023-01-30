package com.wentong.test.beans;

import com.wentong.test.beans.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainConfig {

	@Autowired
	private Person person;


	@Override
	public String toString() {
		return "MainConfig{" +
				"person=" + person +
				'}';
	}
}
