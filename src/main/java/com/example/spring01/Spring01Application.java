package com.example.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.spring01.games.GameRunner;
import com.example.spring01.games.MarioGame;
import com.example.spring01.games.SuperContraGame;

@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
//		SpringApplication.run(Spring01Application.class, args);
//                System.out.println("Welcome to Spring Framework");

//                MarioGame game = new MarioGame();
                SuperContraGame game = new SuperContraGame();

                GameRunner runner = new GameRunner(game);

                runner.runGame();

	}

}
