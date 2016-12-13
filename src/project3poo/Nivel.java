/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

import java.util.Random;

/**
 *
 * @author William
 */
public class Nivel
{
    static private final int ANCHO_CANDY = 64;
    static private final int ALTO_CANDY = 64;
    
    private int horizontalBoxes;
    private int verticalBoxes;
    private Candy[][] tablero;
    private int xInicio;
    private int yInicio;

    public Nivel(int width , int height, int horizontalBoxes, int verticalBoxes) {
        this.horizontalBoxes = horizontalBoxes;
        this.verticalBoxes = verticalBoxes;
        
        this.tablero = new Candy[this.horizontalBoxes][this.verticalBoxes];
        
        this.xInicio = (width -(ANCHO_CANDY * this.horizontalBoxes))/2 ;
        this.yInicio = (height -(ALTO_CANDY * this.verticalBoxes))/2 ;
        
        for (int i = 0; i < verticalBoxes; i++) {
            for(int j = 0; j < horizontalBoxes; j++) {
                Random random = new Random(); // Se instancia un un objeto Random
                int randomInt = random.nextInt(6); // Se crea un avariable int con una coeficiente aleatorio
                Tipo tipo = Tipo.AMARILLO; //Se instancia una clase tipo predefinida
                switch(randomInt) {
                    case 0: tipo = Tipo.AMARILLO; break; // Se cambia el tipo de dulce
                    case 1: tipo = Tipo.AZUL; break; // Se cambia el tipo de dulce
                    case 2: tipo = Tipo.NARANJO; break; // Se cambia el tipo de dulce
                    case 3: tipo = Tipo.PURPURA; break; // Se cambia el tipo de dulce
                    case 4: tipo = Tipo.ROJO; break; // Se cambia el tipo de dulce
                    case 5: tipo = Tipo.VERDE; break; // Se cambia el tipo de dulce
                }
                //Se crea el nuevo dulce y se  aloja en un ArrayList
                this.tablero[i][j] = new Candy(( xInicio + (j*ANCHO_CANDY)), ( yInicio + (i*ALTO_CANDY)), ANCHO_CANDY, ALTO_CANDY, tipo);
            }
        }
    }

    public int getHorizontalBoxes() {
        return horizontalBoxes;
    }

    public void setHorizontalBoxes(int horizontalBoxes) {
        this.horizontalBoxes = horizontalBoxes;
    }

    public int getVerticalBoxes() {
        return verticalBoxes;
    }

    public void setVerticalBoxes(int verticalBoxes) {
        this.verticalBoxes = verticalBoxes;
    }

    public Candy[][] getTablero() {
        return tablero;
    }

    public void setTablero(Candy[][] tablero) {
        this.tablero = tablero;
    }
    
    public Candy getCandy( double x , double y){
        
        int j = ((int)Math.round(x) - this.xInicio)/ANCHO_CANDY;
        int i = ((int)Math.round(y) - this.yInicio)/ALTO_CANDY;
        System.out.printf("X: " + j + " "+ "Y: " + i);
        System.out.println(this.tablero[i][j].getTipo());
        return this.tablero[i][j];
        
    }
}
