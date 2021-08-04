package com.study.spring.case01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String[] args) {
		//以下Old Way
		Person person = new Person();
		person.setId(1);
		person.setName("Spring");
		System.out.println(person);
		//以下Spring
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person2 = (Person)ctx.getBean("person");//來自applicationContext.xml的標籤bean的參數id="person"
		person2.setId(2);
		person2.setName("Jordan");
		System.out.println(person2);
	}
}
 