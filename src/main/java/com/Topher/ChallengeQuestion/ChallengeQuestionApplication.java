package com.Topher.ChallengeQuestion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Component
public class ChallengeQuestionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeQuestionApplication.class, args);
	}

}
