package com.study.spring.case02;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Student {
	private Integer id;
	private String name;
	private Set<Clazz> clazzs;
	
	public Student() {
		System.out.println("Student constructor建構式"); System.out.println(super.toString());
	}

	public void init() {System.out.println("Student init");}
	public void destroy() {System.out.println("Student destroy_僅scope=singleton會呼叫destroy()_prototype不會");}

	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public Set<Clazz> getClazzs() {return clazzs;}
	public void setClazzs(Set<Clazz> clazzs) {this.clazzs = clazzs;}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", clazzs=" + clazzs + "]";
	}
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Student s1 = (Student)ctx.getBean("student1");
		Student s2 = (Student)ctx.getBean("student1");
		Student s3 = (Student)ctx.getBean("student1");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		((ClassPathXmlApplicationContext)ctx).close();
	}
}
