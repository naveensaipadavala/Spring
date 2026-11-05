package com.example.Git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {

	static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(GitApplication.class, args);

		System.out.println("Hello World 2");
	}

}
