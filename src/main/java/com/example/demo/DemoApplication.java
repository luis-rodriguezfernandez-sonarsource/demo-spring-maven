package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public void fooMethod1() {
        System.out.println("not covered");
    }

	public void barMethod1() {
		System.out.println("not covered");
	}

	public void dummyMethod1() {
		System.out.println("not covered");
	}

	public void dummyMethod2() {
		System.out.println("not covered");
	}

	public void randomMethod() {
		System.out.println("not covered");
	}

	public void anotherMethod() {
		System.out.println("not covered");
	}
}
