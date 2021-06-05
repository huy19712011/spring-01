/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spring01.games;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author huynq
 */
@Component
public class GameRunner {

//    private MarioGame game;
    @Autowired
    private final GamingConsole game;

//    public GameRunner(MarioGame game) {
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void runGame() {
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
