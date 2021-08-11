//Spring Security須自己找課外書補強,未來面試/工作有用
package com.study.spring.case01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainTest {
	public static void main(String[] args) {
		//以下Old Way
		Person person = new Person(); person.setId(1); person.setName("Spring"); System.out.println(person);
		//以下Spring
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//以下IoC,反轉控制,不再用new建立新物件
		Person person2 = (Person)ctx.getBean("person");//來自applicationContext.xml的標籤bean的參數id="person"
		person2.setId(2); person2.setName("Jordan"); System.out.println(person2);

//		Author author1 = ctx.getBean(Author.class);//僅適用於applicationContext.xml之中只有一個Author的bean標籤
		Author author1 = (Author)ctx.getBean("author1");//來自applicationContext.xml的標籤bean的參數id="author1"
		System.out.println(author1);
		Author author2 = (Author)ctx.getBean("author2");
		System.out.println(author2);
		Author author3 = (Author)ctx.getBean("author3");
		System.out.println(author3);
		Author author4 = (Author)ctx.getBean("author4");
		System.out.println(author4);

		Book book1 = (Book)ctx.getBean("book1");
		System.out.println(book1);
		Book book2 = (Book)ctx.getBean("book2");
		System.out.println(book2);
		Book book3 = (Book)ctx.getBean("book3");
		System.out.println(book3);
		Book book4 = (Book)ctx.getBean("book4");
		System.out.println(book4);
	}
}
