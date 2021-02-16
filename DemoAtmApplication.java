package kz.iitu.spring.demo_atm;

import models.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoAtmApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAtmApplication.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ATM atm = context.getBean("atm", ATM.class);
        atm.run();

        ((ClassPathXmlApplicationContext)context).registerShutdownHook();
    }

}
