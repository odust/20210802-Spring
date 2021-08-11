package com.study.spring.case02;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.function.ToIntFunction;
public class Teacher {
	private Integer id;
	private String name;
	private Set<Student> students;
	private List<String> subjects;
	private Map<String, Integer> salary;
	//用Spring建一個Teacher物件的樣板:id=1,name=Bob,有3個學生(student1~3),班導師可得知此3學生的總學分
	//禁止使用for, while等語法(須使用Java 8 API)

	public Integer getId() {return id;}
	public void setId(Integer id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public Set<Student> getStudents() {return students;}
	public void setStudents(Set<Student> students) {this.students = students;}
	public List<String> getSubjects() {return subjects;}
	public void setSubjects(List<String> subjects) {this.subjects = subjects;}
	public Map<String, Integer> getSalary() {return salary;}
	public void setSalary(Map<String, Integer> salary) {this.salary = salary;}

	public int getTotalCredits() {
		int total = 0;
		if (students != null) {
//			ToIntFunction<Student> fun1 = stu -> stu.getClazzs().stream().mapToInt(c -> c.getCredit()).sum();
//			total = students.stream().mapToInt(fun1).sum();
			total = students.stream().flatMapToInt(stu -> stu.getClazzs().stream().mapToInt(Clazz::getCredit)).sum();
		}
		return total;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", students=" + students + ", subjects=" + subjects + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Teacher t1 = (Teacher)ctx.getBean("teacher1");
		System.out.println(t1);
		System.out.println(t1.getStudents().size());
		System.out.println(t1.getTotalCredits());
		Teacher t2 = (Teacher)ctx.getBean("teacher2");
		System.out.println(t2);
		Teacher t3 = (Teacher)ctx.getBean("teacher3");
		System.out.println(t3);
	}
}
