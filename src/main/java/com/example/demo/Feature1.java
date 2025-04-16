package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Feature1 {

    String NOT_COVERED = "not covered";

    Logger logger = LoggerFactory.getLogger(Feature1.class);

    public void method1() {
        logger.info(NOT_COVERED);
    }

    public void method2() {
        String bar = "";
        if (!bar.isEmpty()) {
            logger.info(NOT_COVERED);
        }
    }
}
