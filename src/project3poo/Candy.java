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
public class Candy {
    private int x;
    private int y;
    private int width;
    private int height;
    private Tipo tipo;
    
    public Candy(int x, int y, int width, int height, Tipo tipo)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.tipo = tipo;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
