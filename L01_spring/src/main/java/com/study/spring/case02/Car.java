package com.study.spring.case02;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Car {
	private String name;
	private Integer price;

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public Integer getPrice() {return price;}
	public void setPrice(Integer price) {this.price = price;}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
}
//以下L03-HW
//class RoundBean{
//	private Double radius;
//	public Double getRadius() {return radius;}
//	public void setRadius(Double r) {this.radius = r;}
//	public Double getArea() {return Math.PI*Math.pow(this.radius, 2);}
//	@Override
//	public String toString() {
//		return "RoundBean [radius=" + radius + ", area=" + this.getArea() + "]";
//	}
//	public static void main(String[] args) {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
//		RoundBean rb = (RoundBean)ctx.getBean("roundBean");
//		System.out.println(rb);
//	}
//}
