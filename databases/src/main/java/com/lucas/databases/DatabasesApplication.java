package com.lucas.databases;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class DatabasesApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(DatabasesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/* 
		Persona p = new Persona("Pedro", "Zains");
		Persona p2 = new Persona("Kaka", "Alvares");

		service.save(p);
		service.save(p2);
		*/
	}

}
