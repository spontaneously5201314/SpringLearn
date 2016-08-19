package com.youxigu.spring.aop.aspect.service.impl;

import com.youxigu.spring.aop.aspect.service.BService;

/**
* @Description 使用cglib代理
* @author Spontaneously
* @time 2016年8月18日 下午5:47:32
*/
public class BServiceImpl implements BService {
	public void barB(String _msg, int _type) {  
        System.out.println("BServiceImpl.barB(msg:" + _msg + " type:" + _type + ")");  
        if (_type == 1)  
            throw new IllegalArgumentException("测试异常");  
    }  
  
    public void fooB() {  
        System.out.println("BServiceImpl.fooB()");  
    }  
}
