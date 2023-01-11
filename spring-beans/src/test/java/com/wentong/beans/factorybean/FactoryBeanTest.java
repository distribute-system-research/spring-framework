package com.wentong.beans.factorybean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class FactoryBeanTest {

	@Test
	void testBeanDefinitionBuild() {
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(XiaoMing.class).getBeanDefinition();
		beanDefinition.getPropertyValues().add("regards", "Hello World");

		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		beanFactory.registerBeanDefinition("person", beanDefinition);

		Person person = (Person) beanFactory.getBean("person");
		person.sayHello();
	}

}
