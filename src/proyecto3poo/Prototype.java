/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3poo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author chico
 */
public class Prototype {
    static private final int ANCHO_CANDY = 64;
    static private final int ALTO_CANDY = 64;
    
    private int actualScore; //Puntaje actual del juego
    private Dimension board; //Tamaño del tablero de juego
    private ArrayList<Level> levels; //ArrayList con todos los niveles de juego
    private ArrayList<Candy> candies; //ArrayList con todos los dulces posibles
    private ArrayList<Player> players; //ArrayList con todos los jugadores que ham participado
    
    private boolean initiate;
    
    //Constructor
    public Prototype(int width, int heigth) {
        this.board = new Dimension(width,heigth); //Se le da el tamaño total de la ventana al tablero
        this.levels = new ArrayList<>();
        this.candies = new ArrayList<>();
        
        
        int horizontalBoxes = 6;
        int verticalBoxes = 6;
        
        //Llenar cada nivel con los dulces
        int x = (width - horizontalBoxes*ANCHO_CANDY)/2;
        int y = verticalBoxes*ALTO_CANDY;
        
        for (int i = 0; i < verticalBoxes; i++) {
            for(int j = 0; j < horizontalBoxes; j++){
                Random random = new Random();
                int randomInt = random.nextInt(6);
                Tipo tipo = Tipo.AMARILLO;
                switch(randomInt) {
                    case 0: tipo = Tipo.AMARILLO; break;
                    case 1: tipo = Tipo.AZUL; break;
                    case 2: tipo = Tipo.NARANJO; break;
                    case 3: tipo = Tipo.PURPURA; break;
                    case 4: tipo = Tipo.ROJO; break;
                    case 5: tipo = Tipo.VERDE; break;
                }
                
                Candy candy = new Candy(x + j*ANCHO_CANDY, i*ALTO_CANDY, ANCHO_CANDY, ALTO_CANDY, tipo);
                this.candies.add(candy);
            }
        }
    }

    public int getActualScore() {
        return actualScore;
    }

    public void setActualScore(int actualScore) {
        this.actualScore = actualScore;
    }

    public boolean isInitiate() {
        return initiate;
    }

    public void setInitiate(boolean initiate) {
        this.initiate = initiate;
    }
    
    public Dimension getBoard(){
        return this.board;
    }

    public int size() {
        return players.size();
    }

    public Player get(int index) {
        return players.get(index);
    }

    public Player remove(int index) {
        return players.remove(index);
    }
    
    public Iterator<Candy> iterator(){
        return candies.iterator();
    }
}
