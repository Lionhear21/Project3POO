/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

import java.util.Date;

/**
 *
 * @author chico
 */
public class Player {
    private String name;
    private Date date;
    private int[] score;


    public Player(String name, Date date) {
        this.name = name;
        this.date = date;
        this.score = new int[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getScore(int index) {
        return score[index];
    }

    public void setScore(int[] score) {
        this.score = score;
    }
    
    
}
