package com.telusko.quizapp;

import com.telusko.quizapp.service.QuizService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizappApplication {

	QuizService quizService ;
	public static void main(String[] args) {
		SpringApplication.run(QuizappApplication.class, args);
	}

}
