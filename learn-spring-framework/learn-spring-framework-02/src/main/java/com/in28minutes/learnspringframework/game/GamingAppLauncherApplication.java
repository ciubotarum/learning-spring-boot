package com.in28minutes.learnspringframework.game;

import com.in28minutes.learnspringframework.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// make code more simple
@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game") // tell Spring where to find the deleted Bean of Packman
public class GamingAppLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {

            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();

        }
    }

}
