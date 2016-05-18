package com.youxigu.spring.car.service;

import java.io.IOException;
import java.util.List;

import com.youxigu.spring.car.domain.Car;

/**
* @Description 
* @author Spontaneously
* @time 2016年5月17日 下午2:45:00
*/
public interface ICarService {

//	List<Car> getCars();
	Car getCarById(int id) throws IOException;
}
