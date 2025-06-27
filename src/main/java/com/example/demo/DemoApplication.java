package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public void method1() {
        // Some duplicated code here
        System.out.println("Hello");
        System.out.println("World");
        // more duplicated code
    }

    public void method2() {
        // Some duplicated code here
        System.out.println("Hello");
        System.out.println("World");
        // more duplicated code
    }

    public void method3() {
        // Some duplicated code here
        System.out.println("Hello");
        System.out.println("World");
        // more duplicated code
    }

    public void method4() {
        // Some duplicated code here
        System.out.println("Hello");
        System.out.println("World");
        // more duplicated code
    }

    public void method5() {
        // Some duplicated code here
        System.out.println("Hello");
        System.out.println("World");
        // more duplicated code
    }

}
