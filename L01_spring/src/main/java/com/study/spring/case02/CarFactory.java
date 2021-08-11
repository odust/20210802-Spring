package com.study.spring.case02;
import java.util.Random;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CarFactory implements FactoryBean<Car>{
	@Override//繼applicationContext2.xml中的設定,在此繼續Car物件的動態設定
	public Car getObject() throws Exception {
		Car car = new Car(); car.setName("BMW");
//		car.setPrice(1_500_000 + new Random().nextInt(1_000_000));//或想像為售出軟體之可重複的一百萬組序號
		car.setPrice(1_500_000 + (int)(Math.random()*1_000_000));//這樣寫較省資源,上列寫法須建新物件,消耗Heap
		return car;
	}
	@Override
	public Class<?> getObjectType() {return Car.class;}
	@Override
	public boolean isSingleton() {return false;}
	public static void main(String[] args) {
		//以下Car物件,僅於applicationContext2.xml的bean(carFactory)的scope
		//與本類別的isSingleton()皆設定為singleton,以下Car物件才會是singleton
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Car car1 = (Car)ctx.getBean("carFactory");
		System.out.println(car1);
		Car car2 = (Car)ctx.getBean("carFactory");
		System.out.println(car2);
	}
}
