package main.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishan on 6/29/2017.
 */
public class TriangleMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("main/resource/spring-config.xml");
//        Triangle triangle = (Triangle) applicationContext.getBean("triangle");
//        Triangle triangle1 = (Triangle)applicationContext.getBean("triangleC");
//        Triangle triangle2 = (Triangle)applicationContext.getBean("triangle2");
//        Triangle triangle3 = (Triangle)applicationContext.getBean("triangle3");
        Triangle triangle4 = (Triangle)applicationContext.getBean("triangle4");
//        System.out.println(triangle);
//        System.out.println(triangle1);
//        System.out.println(triangle2);
//        System.out.println(triangle3);
        System.out.println(triangle4);
        System.out.println(triangle4);
    }
}
