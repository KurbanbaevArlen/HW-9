package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {


    @Bean(name = "cat")
    @Scope("property")
    public Cat cat(){
        Cat cat = new Cat();
        return cat;
    }

    @Bean(name = "helloworld")
    public HelloWorld getHelloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

}
