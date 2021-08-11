//Spring Security須自己找課外書補強,未來面試/工作有用
package com.study.spring.case01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainTest2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Husband husband = ctx.getBean(Husband.class);
		Wife wife = ctx.getBean(Wife.class);
		System.out.println(husband + "\t\t\t\t\t" + wife);
		System.out.printf("%s的老婆是%s%n", husband.getName(), husband.getWife().getName());
		System.out.printf("%s的老公是%s%n", wife.getName(), wife.getHusband().getName());
	}
}
