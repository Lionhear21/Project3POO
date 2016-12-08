/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3poo;

import java.util.ArrayList;

/**
 *
 * @author chico
 */
public class Prototype {
    static private final int ANCHO_BLOQUE = 64;
    static private final int ALTO_BLOQUE = 32;
    
    private Board board;
    private ArrayList<Candy> candies;
    
    public Prototype(int width, int heigth) {
        this.board = new Board(width,heigth);
        this.candies = new ArrayList<>();
        int x = (width - 6*ANCHO_BLOQUE)/2;
        int y = 2*ALTO_BLOQUE;
        
        for (int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++){
                Tipo tipo = Tipo.AZUL;
                
                Candy candy = new Candy(x + j*ANCHO_BLOQUE, i*ALTO_BLOQUE, ANCHO_BLOQUE, ALTO_BLOQUE, tipo);
                this.candies.add(candy);
            }
            
        }
        
    }
    
    
    
}
