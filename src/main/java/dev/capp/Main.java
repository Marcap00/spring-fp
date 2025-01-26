package dev.capp;

import dev.capp.config.AppConfig;
import dev.capp.service.TrainService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan
public class Main {

    public static void main(String[] args) {
        /*TrainService service = new TrainService();
        System.out.println(service.list());*/
        /* ----> */
        /* ApplicationContext --> This is a central interface to provide configuration for an application  */
        /* AnnotationConfigApplicationContext --> This is the class we're going to use to work with this implementation*/
        AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        /*TrainService service = applicationContext.getBean("trainService", TrainService.class);
        System.out.println(service.list());*/

        for (String bean : applicationContext.getBeanDefinitionNames()) {
            System.out.println("Bean --->" + bean);
        }
    }
}