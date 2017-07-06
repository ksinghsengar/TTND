package main.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by krishan on 6/29/2017.
 */
@Configuration
public class SpringConfig {
    @Bean
    @Scope("prototype")
    Triangle triangle(){
        Triangle triangle = new Triangle();
        triangle.setAltitude(23);
        triangle.setHeight(14);
        return  triangle;


    }
}
