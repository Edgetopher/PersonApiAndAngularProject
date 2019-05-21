package com.Topher.ChallengeQuestion;

import com.Topher.ChallengeQuestion.Domain.Peoples;
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
	private static final Logger log = LoggerFactory.getLogger(ChallengeQuestionApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ChallengeQuestionApplication.class, args);
	}
}
