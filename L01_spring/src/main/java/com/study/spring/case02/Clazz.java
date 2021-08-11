package com.study.spring.case02;
import java.util.Objects;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Clazz {
	private Integer id;
	private String name;
	private Integer credit;

	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public Integer getCredit() {return credit;}
	public void setCredit(Integer credit) {this.credit = credit;}

	@Override
	public int hashCode() {return Objects.hash(credit, id, name);}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Clazz other = (Clazz) obj;
		return Objects.equals(credit, other.credit) && Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Clazz [id=" + id + ", name=" + name + ", credit=" + credit + "]";
	}
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Student s1 = (Student)ctx.getBean("student1");
		System.out.println(s1);
	}
}
