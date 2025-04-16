package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Feature1 {

    Logger logger = LoggerFactory.getLogger(Feature1.class);

    public void method1() {
        System.out.println("not covered");
        logger.info("not covered");
    }

    public void method2() {
        String bar = null;
        if (bar.length() > 0) {
            System.out.println("not covered");
        }
    }
}
