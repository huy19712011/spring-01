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
public class MarioGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Go into a hole");
    }

    @Override
    public void left() {
        System.out.println("Stop");
    }

    @Override
    public void right() {
        System.out.println("Go faster");
    }

}
