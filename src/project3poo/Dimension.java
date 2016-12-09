/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

/**
 *
 * @author chico
 */
public class Dimension {
    int width;
    int heigth;
    
    public Dimension(int width, int height) {
        this.width = width;
        this.heigth = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return heigth;
    }

    public void setHeight(int heigth) {
        this.heigth = heigth;
    }
}
