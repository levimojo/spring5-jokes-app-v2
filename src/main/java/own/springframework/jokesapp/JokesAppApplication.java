package own.springframework.jokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import own.springframework.jokesapp.controllers.JokeController;

@SpringBootApplication
public class JokesAppApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(JokesAppApplication.class, args);


	}
}
