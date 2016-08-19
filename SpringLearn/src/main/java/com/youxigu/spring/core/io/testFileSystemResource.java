package com.youxigu.spring.core.io;

import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @Description:
 * @author myg
 * @time 2015年12月23日 下午6:18:59
 */
public class testFileSystemResource {
	public static void main(String[] args) throws IOException {
//		FileSystemResource resource = new FileSystemResource(new File("D:\\Develop\\Centos6.5\\CentOS 64 位.nvram"));
//		System.out.println(resource.getURI());
		//编程式使用IoC容器
		ClassPathResource resource = new ClassPathResource("applicationContext.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);
	}
}
