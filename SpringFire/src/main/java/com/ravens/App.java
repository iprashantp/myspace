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
    	App obj = new App();
    	obj.dependencyInjDemo();
    	//obj.constructorInjDemo();
    	
    }
    
    private void dependencyInjDemo() {
    	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	ApplicationContext factoryx = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien)factoryx.getBean("alien");
        obj.printer();
        //obj.setAge(20);
        System.out.println("obj1 age: "+obj.getAge());
        obj.code();
        
        //Alien obj2 = (Alien) factoryx.getBean("alien");
        //System.out.println("obj2 age: "+obj2.getAge());
    }
    
    private void constructorInjDemo() {
    	ApplicationContext factoryx = new ClassPathXmlApplicationContext("spring.xml");
        Alien2 obj = (Alien2)factoryx.getBean("alien2");
        obj.code();
    }
}
