package main.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by krishan on 6/29/2017.
 */
public class SpringMainJavaConfigDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Triangle triangle = applicationContext.getBean(Triangle.class);
        System.out.println(triangle);

    }
}
