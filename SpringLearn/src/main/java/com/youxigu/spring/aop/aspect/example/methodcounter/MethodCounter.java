package com.youxigu.spring.aop.aspect.example.methodcounter;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
* @Description 实现统计方法的调用次数
* @author Spontaneously
* @time 2016年8月19日 下午2:01:46
*/
public class MethodCounter implements Serializable{

	private Map<String, Integer> map = new HashMap<String, Integer>();
	private int allCount;
	
	protected void count(Method method){
		count(method.getName());
	}
	
	protected void count(String methodName){
		int count = map.get(methodName);
		if(count == 0){
			map.put(methodName, 1);
		}else{
			map.put(methodName, ++count);
		}
		allCount++;
	}
	
	public int getCalls(String methodName){
		return map.get(methodName) == null ? 0 : map.get(methodName);
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && obj.getClass() == this.getClass();
	}
	
	
}
