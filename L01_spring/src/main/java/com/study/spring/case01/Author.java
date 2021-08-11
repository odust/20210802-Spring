package com.study.spring.case01;
public class Author {
	private String name;
	private Character gender;
	private Integer age;
	
	public Author() {}
	public Author(Character gender, String name, Integer age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
}
