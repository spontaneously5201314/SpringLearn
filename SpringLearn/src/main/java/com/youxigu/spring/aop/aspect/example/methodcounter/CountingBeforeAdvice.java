package com.youxigu.spring.aop.aspect.example.methodcounter;

import java.lang.reflect.Method;

import org.aspectj.lang.annotation.Before;
import org.springframework.aop.MethodBeforeAdvice;

/**
* @Description 
* @author Spontaneously
* @time 2016年8月19日 下午2:04:05
*/
public class CountingBeforeAdvice extends MethodCounter
		implements MethodBeforeAdvice {
	
//	@Before(value = "execution(* com.youxigu.spring.aop.aspect.example.methodcounter.*.*(..))")
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		count(method);
	}

}
