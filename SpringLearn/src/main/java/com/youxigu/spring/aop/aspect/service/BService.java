package com.youxigu.spring.aop.aspect.service;
/**
* @Description 使用cglib代理
* @author Spontaneously
* @time 2016年8月18日 下午5:47:14
*/
public interface BService {
	public void barB(String _msg, int _type);
  
    public void fooB();
}
