package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) context.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 = context.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());

        Cat cat1 =context.getBean("cat", Cat.class);
        System.out.println(cat1);

        Cat cat2 = context.getBean("cat", Cat.class);
        System.out.println(cat2);

        System.out.println(bean == bean1);
        System.out.println(cat1 == cat2);

    }
}
