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
    
    private Dimension mundo; //Tamaño del tablero de juego
    private HashMap<Integer,Nivel> levels; //ArrayList con todos los dulces posibles
    private ArrayList<Player> players; //ArrayList con todos los jugadores que han participado
    private boolean initiate; // Estado del juego //true = Iniciado || false = No Iniciado
    
    //Constructor
    public Prototype(int width, int heigth) {
        this.mundo = new Dimension(width,heigth); //Se le da el tamaño total de la ventana al tablero
        this.levels = new HashMap();
        this.players = new ArrayList<>();
        
        for(int i = 0; i < 10; i++){
            Nivel nivel = new Nivel(width,heigth,6,6);
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
    
    public Dimension getMundo(){
        return this.mundo;
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
    
    public void mechanics(Nivel nivel, Candy[] swaps){
        
        if( swaps.length == 2 )
        {
            System.out.println("cambiar");
            int i1, j1;
            int i2, j2;
            
            i1 = ((swaps[0].getY())/64);
            j1 = ((swaps[0].getX())/64)-2;
            i2 = ((swaps[1].getY())/64);
            j2 = ((swaps[1].getX())/64)-2;
            
            System.out.printf( "(%d, %d) <-> (%d, %d)\n", i1, j1, i2, j2 );
            
            if( (i1 == i2 && Math.abs(j1-j2) <= 1) || (j1 == j2 && Math.abs(i1-i2) <= 1))
            {
                //realizo el swap
                System.out.println("estan juntos");
                
                Tipo tipoAux = swaps[0].getTipo();
                nivel.getTablero()[i1][j1].setTipo( swaps[1].getTipo() );
                nivel.getTablero()[i2][j2].setTipo( tipoAux );
            }
            
//            for(int i = 0; i < nivel.getHorizontalBoxes(); i++){
//                if((j2 + i) < nivel.getHorizontalBoxes()){
//                    if((nivel.getTablero()[i2][j2].getTipo() == nivel.getTablero()[i2][j2+1].getTipo()) && (nivel.getTablero()[i2][j2].getTipo() == nivel.getTablero()[i2][j2+1].getTipo())){
//                    
//                        nivel.getTablero()[i2][j2].setTipo(Tipo.NULL);
//                        nivel.getTablero()[i2][j2+1].setTipo(Tipo.NULL);
//                        nivel.getTablero()[i2][j2-1].setTipo(Tipo.NULL);
//                    }
//                }
//                
//            }
            
//            int count = 0;
//            int i = 0;
//            while(nivel.getTablero()[i2][j2].getTipo() == nivel.getTablero()[i2][j2+i].getTipo() 
//                        || nivel.getTablero()[i2][j2].getTipo() == nivel.getTablero()[i2][j2-i].getTipo()){
//            
//                    count++;
//                    i++;
////                    nivel.getTablero()[i2][j2].setTipo(Tipo.NULL);
////                    nivel.getTablero()[i2][j2-1].setTipo(Tipo.NULL);
////                    nivel.getTablero()[i2][j2+1].setTipo(Tipo.NULL);
//            }
//            
//            for(int j = 0; j < count; j ++){
//                if(nivel.getTablero()[i2][j2+j].getTipo() == nivel.getTablero()[i2][j2].getTipo()
//                        && nivel.getTablero()[i2][j2].getTipo() == nivel.getTablero()[i2][j2].getTipo()){
//                    
//                    nivel.getTablero()[i2][j2].setTipo(Tipo.NULL);
//                    nivel.getTablero()[i2][j2-j].setTipo(Tipo.NULL);
//                    nivel.getTablero()[i2][j2+j].setTipo(Tipo.NULL);
//                    }
//                
//            }
                
            //Match solo derecha
            int count = 0;
            int count2 = 0;
            int l = 0;
            
            for(int k = 0 ; k < nivel.getHorizontalBoxes(); k++){
                
                if((nivel.getTablero()[i2][j2].getTipo()) == (nivel.getTablero()[i2][j2+k].getTipo()) && nivel.getTablero()[i2][j2] != nivel.getTablero()[i2][5]){
                    count++;
                }
                else{
                    l = k;
                    break;
                }
                
//                if((nivel.getTablero()[i2][j2].getTipo()) == (nivel.getTablero()[i2][j2-k].getTipo()) && nivel.getTablero()[i2][j2] != nivel.getTablero()[i2][0]){
//                    count++;
//                    count2++;
//                }
//                else{
//                    l = k;
//                    break;
//                }
            }

            if(count >= 3){
                for(int k = 0 ; k < count ; k++) {
                    nivel.getTablero()[i2][j2-count2+k].setTipo(Tipo.NULL); 
                }
            }
        }
    }
        
//        Tipo aux;
//        Candy[][] tablero = nivel.getTablero();
//        for(int i = 0; i < nivel.getVerticalBoxes(); i++){
//            for(int j = 0; j < nivel.getHorizontalBoxes(); j++){
//                if( tablero[i][j] == swaps[0] ){
//                    aux = tablero[i][j].getTipo();
//                    tablero[i][j].setTipo(swaps[1].getTipo());
//                    for(int k = 0; k < nivel.getVerticalBoxes(); k++){
//                        for(int l = 0; l < nivel.getHorizontalBoxes(); l++){
//                            if( tablero[k][l] == swaps[1] ){
//                                tablero[k][l].setTipo(aux);
//                                break;
//                            }
//                        }
//                    }
//                }
//            }
//        }
    
}
