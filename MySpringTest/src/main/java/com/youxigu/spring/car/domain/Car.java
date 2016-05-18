package com.youxigu.spring.car.domain;

import java.io.Serializable;

/**
* @Description 
* @author Spontaneously
* @time 2016年5月17日 下午2:53:35
*/
public class Car implements Serializable {

	private static final long serialVersionUID = -422295393135026761L;
	private int id;
	private String color;
	private String name;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", name=" + name + ", price=" + price + "]";
	}
}
