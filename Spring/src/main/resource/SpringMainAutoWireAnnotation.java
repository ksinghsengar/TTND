package main.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishan on 6/29/2017.
 */
public class SpringMainAutoWireAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("main/resource/spring-config.xml");
        Triangle triangle = (Triangle)applicationContext.getBean("triangle4");
        System.out.println(triangle);
    }
}
