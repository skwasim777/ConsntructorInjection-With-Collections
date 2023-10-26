package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicatonContext {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("map.xml");
		Questions q = (Questions) app.getBean("que");
		q.desplay();
	}
}
