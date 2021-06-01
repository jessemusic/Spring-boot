package br.com.jmccursos.tecnologia.mudijesse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class MudijesseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MudijesseApplication.class, args);
	}

}
