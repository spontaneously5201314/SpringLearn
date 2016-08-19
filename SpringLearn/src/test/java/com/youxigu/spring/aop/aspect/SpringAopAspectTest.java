package com.youxigu.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
* @Description 
* @author Spontaneously
* @time 2016年8月18日 下午5:59:48
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:applicationContext.xml")
public class SpringAopAspectTest {

	@Autowired
	private ApplicationContext applicationContext;
	
	@Test
	public void testAspectAop(){
		AspectTest test = new AspectTest();
//		JoinPoint joinPoint = new JoinPoint();
		test.doBefore(null);
	}
}
