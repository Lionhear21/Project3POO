/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author chico
 */
public class Prototype {
    static private final int ACTUAL_SCORE = 0; //Puntaje actual del juego
    
    private Dimension board; //Tamaño del tablero de juego
    private HashMap<Integer,Nivel> levels; //ArrayList con todos los dulces posibles
    private ArrayList<Player> players; //ArrayList con todos los jugadores que han participado
    private boolean initiate; // Estado del juego //true = Iniciado || false = No Iniciado
    
    //Constructor
    public Prototype(int width, int heigth) {
        this.board = new Dimension(width,heigth); //Se le da el tamaño total de la ventana al tablero
        this.levels = new HashMap();
        this.players = new ArrayList<>();
        
        for(int i = 0; i < 10; i++){
            Nivel nivel = new Nivel(6,6);
            this.levels.put(i, nivel);
        }
        
        this.initiate = false;
    }
    
    public Nivel getNivel(Integer indice)
    {
        return this.levels.get(indice);
    }

    /*public int getActualScore() {
        return actualScore;
    }

    public void setActualScore(int actualScore) {
        this.actualScore = actualScore;
    }*/

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

    public boolean addPlayer(Player player) {
        return players.add(player); 
    }
    
    public Player get(int index) {
        return players.get(index);
    }

    public boolean remove(Player player) {
        return players.remove(player);
    }

    public Nivel get(Object key) {
        return levels.get(key);
    }
    
    public void changePosition(Nivel nivel, Candy candy1, Candy candy2){
        for(int i = 0; i < nivel.getVerticalBoxes(); i++){
            for(int j = 0; j < nivel.getHorizontalBoxes(); j++){
                Candy[][] tablero = nivel.getTablero();
                if(tablero[i][j] == candy1){
                    if(tablero[i+1][j] == candy2){
                        tablero[i][j] = candy2;
                        tablero[i+1][j] = candy1;
                        
                    }
                    if(tablero[i-1][j] == candy2){
                        tablero[i][j] = candy2;
                        tablero[i-1][j] = candy1;
                        
                    }
                    if(tablero[i][j+1] == candy2){
                        tablero[i][j] = candy2;
                        tablero[i][j+1] = candy1;
                        
                    }
                    if(tablero[i][j-1] == candy2){
                        tablero[i][j] = candy2;
                        tablero[i][j-1] = candy1;
                        
                    }
                }
            }
        }
    }
    
    public void checkeo(Nivel nivel, int h, int v)
    {
        Candy[][] tablero = nivel.getTablero();
        //Checkeo vertical
        for (int i = 0; i < v; i++) {
            for(int j = 0; j < h; j++){
                if(tablero[i][j].getTipo().equals((tablero[i+1][j].getTipo())) && (tablero[i][j].getTipo().equals((tablero[i-1][j].getTipo())))){
                    tablero[i][j] = null;
                    tablero[i+1][j] = null;
                    tablero[i-1][j] = null;
                }
            }
        }
        for (int i = v; i > 0; i--) {
            for(int j = h; j > 0; j--){
                if(tablero[i][j] == null){
                    tablero[i][j] = tablero[i-1][j];  
                }
            }
        }
        
        //Checkeo horizontal
        for (int i = 0; i < v; i++) {
            for(int j = 0; j < h; j++){
                if(tablero[i][j].getTipo().equals((tablero[i][j+1].getTipo())) && (tablero[i][j].getTipo().equals((tablero[i][j-1].getTipo())))){
                    tablero[i][j] = null;
                    tablero[i][j+1] = null;
                    tablero[i][j+1] = null;
                }
            }
        }
        for (int i = v; i > 0; i--) {
            for(int j = h; j > 0; j--){
                if(tablero[i][j] == null){
                    tablero[i][j] = tablero[i][j-1];  
                }
            }
        }
    }
}
