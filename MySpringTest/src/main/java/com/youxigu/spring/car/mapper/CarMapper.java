package com.youxigu.spring.car.mapper;

import java.util.List;

import com.youxigu.spring.car.domain.Car;

/**
* @Description 
* @author Spontaneously
* @time 2016年5月17日 下午5:30:20
*/
public interface CarMapper {
	
//	List<Car> getCars();
	
	Car getCarById(int id);
}
