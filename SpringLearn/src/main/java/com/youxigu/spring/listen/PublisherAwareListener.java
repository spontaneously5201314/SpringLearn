package com.youxigu.spring.listen;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
* @Description 
* @author Spontaneously
* @time 2016年8月8日 下午6:02:24
*/
@Component
public class PublisherAwareListener implements ApplicationEventPublisherAware {
	
	private String word;
	private ApplicationEventPublisher tradeEventPublisher;

	public void setWord(String word) {
		this.word = word;
	}

	public void set(){
		System.out.println("send message : " + this.word);
		MyEvent event = new MyEvent(new String("i love you"));
		this.tradeEventPublisher.publishEvent(event);
	}
	
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
//		System.out.println("收到消息 + ApplicationEventPublisherAware");
		this.tradeEventPublisher = applicationEventPublisher;
	}

}
