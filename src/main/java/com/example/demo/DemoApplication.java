package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public void run() {
        prepare("action1");   
        execute("action1");
        release("action1");
    }

    private void release(String action1) {
    }

    private void execute(String action1) {
        
    }

    private void prepare(String action1) {
        
    }

}
