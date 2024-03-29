package com.example.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.example.spring01.games.GameRunner;
import com.example.spring01.games.MarioGame;
import com.example.spring01.games.SuperContraGame;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @ComponentScan("com.example.spring01") // by default
// @ComponentScan({"com.example.spring01", other packages here...})

public class Spring01Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Spring01Application.class, args);

        GameRunner runner = context.getBean(GameRunner.class);




//        MarioGame game = new MarioGame();
////        SuperContraGame game = new SuperContraGame();
//
//        GameRunner runner = new GameRunner(game);

        runner.runGame();

    }

}
