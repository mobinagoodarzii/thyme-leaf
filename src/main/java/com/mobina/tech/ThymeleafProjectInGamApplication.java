package com.mobina.tech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafProjectInGamApplication implements CommandLineRunner {

	@Autowired
	private PersonRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafProjectInGamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		PersonEntity s1 = new PersonEntity("Mobina", "Tehran", 23);
		PersonEntity s2 = new PersonEntity("Avina", "Mashhad", 13);
		PersonEntity s3 = new PersonEntity("Moein", "Shiraz", 13);

		repository.save(s1);
		repository.save(s2);
		repository.save(s3);
	}
}
