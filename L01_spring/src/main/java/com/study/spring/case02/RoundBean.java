//L03-HW
package com.study.spring.case02;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class RoundBean{
	private double radius;
	public double getRadius() {return radius;}
	public void setRadius(double r) {this.radius = r;}
	public double getArea() {return Math.PI*Math.pow(this.radius, 2);}
	@Override
	public String toString() {
		return "RoundBean [radius=" + radius + ", area=" + (int)(this.getArea()) + "]";
	}
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
		RoundBean rb = (RoundBean)ctx.getBean("roundBean");
		System.out.println(rb);//////
	}
}
