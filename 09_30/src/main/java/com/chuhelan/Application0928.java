package com.chuhelan;

import abc.A;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chuhelan
 * @version 1.0
 * @date 2021/9/28 20:35
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
//@SpringBootApplication
public class Application0928 {
    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(Application0928.class);
        System.out.println("=================================================");
        String[] arr = run.getBeanDefinitionNames();
        for (String s : arr) {
            System.out.println(s);
        }
    }

    @Bean("AAAAAAAAAAAAAAAAAAAAAAAA")
    public A getaaaaaaaaaaaaaaaaaaaaaa() {
        return new A();
    }
}
