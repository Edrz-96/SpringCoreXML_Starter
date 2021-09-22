package com.qa.springstarter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qa.springstarter.domain.Person;
import com.qa.springstarter.domain.Student;
import com.qa.springstarter.domain.Teacher;

public class App {
	public static void main(String[] args) {
		//Spring IOC context with XML configuration file, see context.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		// prototype bean, see xml
		Person p = context.getBean("personBean", Person.class);
		// default singleton with literal values set via xml and application.properties
		Student s = context.getBean("studentBean", Student.class);
		System.out.println(s.getFirstName() + " " + s.getLastName());
		System.out.println(s);
		// Spring annotated @component bean
		Teacher t = context.getBean("Teacher", Teacher.class);
		System.out.println(t);
	}
}
