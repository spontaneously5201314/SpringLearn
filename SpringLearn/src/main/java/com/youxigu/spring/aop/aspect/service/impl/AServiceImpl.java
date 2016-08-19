package com.youxigu.spring.aop.aspect.service.impl;

import com.youxigu.spring.aop.aspect.service.AService;

/**
 * @Description 使用jdk自带动态代理
 * @author Spontaneously
 * @time 2016年8月18日 下午5:45:25
 */
public class AServiceImpl implements AService{
	public void barA() {
		System.out.println("AServiceImpl.barA()");
	}

	public void fooA(String _msg) {
		System.out.println("AServiceImpl.fooA(msg:" + _msg + ")");
	}
}
