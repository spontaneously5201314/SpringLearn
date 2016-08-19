package com.youxigu.spring.listen;

import org.springframework.context.ApplicationEvent;

/**
* @Description 定义事件
* @author Spontaneously
* @time 2016年8月8日 下午4:52:05
*/
public class MyEvent extends ApplicationEvent {

	public MyEvent(Object source) {
		super(source);
	}

}
