package com.youxigu.spring.aop.aspect.example.methodcounter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
* @Description 
* @author Spontaneously
* @time 2016年8月19日 下午2:24:32
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext_countering.xml")
public class CountingBeforeAdviceTest {

	@Autowired
	private ApplicationContext applicationContext;
	
	@Test
	public void testCountering(){
		HelloWorld world = new HelloWorld();
		world.saySome();
	}
}
