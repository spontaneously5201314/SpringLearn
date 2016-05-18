package com.youxigu.myspringtest;

import java.io.IOException;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.youxigu.spring.car.domain.Car;
import com.youxigu.spring.car.service.impl.CarService;

/**
* @Description 
* @author Spontaneously
* @time 2016年5月17日 下午2:52:11
*/
public class MySpringTest {

	public static void main(String[] args) throws IOException {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();  
        context.setValidating(false);  
        context.load("classpath*:applicationContext*.xml");  
        context.refresh();  
        CarService carService = context.getBean(CarService.class); 
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactory()
        Car carById = carService.getCarById(1);
        System.out.println(carById);
//        while (true) {  
//            System.out.println(carService.getCarById());  
////            Thread.sleep(10000);  
//        } 
	}
}
