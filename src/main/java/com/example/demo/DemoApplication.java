package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
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

	public void methodInMainBranch() {
		System.out.println("not covered");
	}

	public void methodInMainBranchInTheFutureOutOfNewCodePeriod() {
		System.out.println("not covered");
	}

	public void methodInMainBranchInTheFutureOutOfNewCodePeriod90DAYS() {
		System.out.println("not covered");
	}

	public void methodInMainBranchInTheFutureOutOfNewCodePeriod90DAYSAndSCMsensorDisabled() {
		System.out.println("not covered");
	}

	public void dummyDemoMethod() {
		System.out.println("not covered");
	}
}
