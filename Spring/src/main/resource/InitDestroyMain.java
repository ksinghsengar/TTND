package main.resource;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishan on 6/29/2017.
 */
public class InitDestroyMain {
    public static void main(String[] args) {
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("main/resource/spring-config.xml");
        abstractApplicationContext.getBean("InitDestroy");
        abstractApplicationContext.registerShutdownHook();

    }
}
