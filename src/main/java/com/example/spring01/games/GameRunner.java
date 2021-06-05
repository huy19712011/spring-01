/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.spring01.games;

/**
 *
 * @author huynq
 */
public class GameRunner {

    private MarioGame game;

    public GameRunner(MarioGame game) {
        this.game = game;
    }

    public void runGame() {
        game.up();
        game.down();
        game.left();
        game.right();
    }

}