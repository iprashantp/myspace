package com.ravens;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	ApplicationContext factoryx = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien)factoryx.getBean("alien");
        obj.printer();
        //obj.setAge(20);
        System.out.println("obj1 age: "+obj.getAge());
          
        Alien obj2 = (Alien) factoryx.getBean("alien");
        System.out.println("obj2 age: "+obj2.getAge());
    }
}
