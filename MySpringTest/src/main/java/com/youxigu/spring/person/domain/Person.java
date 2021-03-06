package com.youxigu.spring.person.domain;

import java.io.Serializable;

/**
* @Description 
* @author Spontaneously
* @time 2016年5月17日 下午2:54:36
*/
public class Person implements Serializable {

	private static final long serialVersionUID = 4091289065791669699L;
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
