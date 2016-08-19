package com.youxigu.spring.listen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
* @Description 测试下com.youxigu.spring.listen下的spring的监视器模式
* @author Spontaneously
* @time 2016年8月8日 下午5:13:38
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SpringListenerModelTest {

	@Autowired
	private ApplicationContext applicationContext;
	
	@Test
	public void testPublishEvent(){
		String[] definitionNames = applicationContext.getBeanDefinitionNames();
		for (String string : definitionNames) {
			System.out.println(string);
		}
		applicationContext.publishEvent(new MyEvent("我爱你"));
	}
}
