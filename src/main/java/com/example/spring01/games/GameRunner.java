/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spring01.games;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author huynq
 */
@Component
public class GameRunner {

//    private MarioGame game;
    @Autowired
    @Qualifier("marioGame")
    private GamingConsole game;

//    public GameRunner(@Qualifier("marioGame") GamingConsole game) {
//
//        System.out.println("Using Constructor");
//
//        this.game = game;
//    }

//    // using setter
//    @Autowired
//    public void setGame(GamingConsole game) {
//
//        System.out.println("Using Setter");
//
//        this.game = game;
//    }


    public void runGame() {
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
