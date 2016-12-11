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

    public Nivel(int horizontalBoxes, int verticalBoxes) {
        this.horizontalBoxes = horizontalBoxes;
        this.verticalBoxes = verticalBoxes;
        this.tablero = new Candy[this.horizontalBoxes][this.verticalBoxes];
        
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
                this.tablero[i][j] = new Candy(j*ANCHO_CANDY, i*ALTO_CANDY, ANCHO_CANDY, ALTO_CANDY, tipo);
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
    
    public Candy getCandy(double x , double y){
        for(int i = 0; i < this.verticalBoxes; i++){
            for(int j = 0; j < this.horizontalBoxes;j++){
                if(x < this.tablero[i][j].getX() && y < this.tablero[i][j].getY()){
                    return this.tablero[i][j];
                }
            }
        }
        return null;
    }
}
