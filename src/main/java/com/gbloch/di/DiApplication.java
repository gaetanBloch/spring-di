package com.gbloch.di;

import com.gbloch.di.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);

        System.out.println("---------- Greeting");
        GreetingController greetingController =
                (GreetingController) ctx.getBean("greetingController");
        System.out.println(greetingController.greeting());

        System.out.println("---------- Farewell");
        FarewellController farewellController =
                (FarewellController) ctx.getBean("farewellController");
        System.out.println(farewellController.farewell());
    }
}
