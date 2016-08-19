package com.youxigu.spring.listen;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Description 定义有序的监听器
 * @author Spontaneously
 * @time 2016年8月8日 下午4:56:31
 */
@Component
public class OrderListener implements SmartApplicationListener {

	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("收到消息" + event.getSource());
	}

	// 即顺序，越小优先级越高
	public int getOrder() {
		return 1;
		// return 2;
	}

	// 用于指定支持的事件类型，只有支持的才调用onApplicationEvent
	public boolean supportsEventType(
			Class<? extends ApplicationEvent> eventType) {
		return eventType == MyEvent.class;
	}

	// 支持的目标类型，只有支持的才调用onApplicationEvent
	public boolean supportsSourceType(Class<?> sourceType) {
		return sourceType == MyEvent.class;
	}

}
