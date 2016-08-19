package com.youxigu.spring.listen;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
* @Description 定义无序的监听器
* @author Spontaneously
* @time 2016年8月8日 下午4:53:28
*/
@Component	//使用该注解完成bean的注入
public class UnOrderListener implements ApplicationListener<ApplicationEvent> {

	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof MyEvent){
			System.out.println("收到消息un" + event.getSource());
		}
	}

}
