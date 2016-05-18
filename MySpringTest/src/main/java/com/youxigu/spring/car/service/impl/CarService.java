package com.youxigu.spring.car.service.impl;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import com.youxigu.spring.car.domain.Car;
import com.youxigu.spring.car.mapper.CarMapper;
import com.youxigu.spring.car.service.ICarService;

/**
* @Description 
* @author Spontaneously
* @time 2016年5月17日 下午2:45:46
*/
@Service
public class CarService implements ICarService {

	private CarMapper carMapper;

	public void setCarMapper(CarMapper carMapper) {
		this.carMapper = carMapper;
	}

	@Override
	public Car getCarById(int id) throws IOException {
		return carMapper.getCarById(id);
	}

}
