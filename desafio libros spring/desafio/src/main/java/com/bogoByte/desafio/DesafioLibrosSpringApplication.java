package com.bogoByte.desafio;

import com.bogoByte.desafio.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioLibrosSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioLibrosSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraElMenu();
	}
}
