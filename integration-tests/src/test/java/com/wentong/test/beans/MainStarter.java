package com.wentong.test.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainStarter {

	public static void main(String[] args) {
		//  如果类里面有依赖关系，那么依赖关系不会自动装配？？？
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Person.class);
//		System.out.println(context.getBean(Person.class));
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.wentong.test.beans");
//		context.scan("com.wentong.test.beans");
		System.out.println(context.getBean("mainConfig"));
		System.out.println(context.containsBean("normalBean"));
	}

}
