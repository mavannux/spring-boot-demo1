package com.test.demo;

import com.test.demo.graphql.Query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// https://www.pluralsight.com/guides/building-a-graphql-server-with-spring-boot
	// https://github.com/graphql-java-kickstart/graphql-java-tools/blob/master/example/src/main/java/com/coxautodev/graphql/tools/example/resolvers/Mutation.java
	// https://codenotfound.com/graphql-java-spring-boot-example.html
	
}
