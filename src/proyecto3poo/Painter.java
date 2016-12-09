/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3poo;

import java.util.Iterator;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Elio
 */
public class Painter {
    static public void paint( Prototype game, GraphicsContext context, Dimension board, Dimension ventana ) { //Metodo principal, se le entrega el juego, el buffer, la dimension del tablero de juego, dimension del la ventana
        //Pinta a todos los dulces del nivel
        Iterator<Candy> candies = game.iterator();
        while( candies.hasNext() ){
            Candy candy = candies.next();
            Painter.dibujar( candy, context, board, ventana );
        }
        
    }
    
    //Metodo que toma la imagen cargada y la pinta en el canvas
    static private void dibujar(Candy candy, GraphicsContext context, Dimension mundo, Dimension ventana)
    {
        int x = Painter.convertXToWindow(candy.getX(), mundo, ventana);
        int y = Painter.convertYToWindow(candy.getY(), mundo, ventana);
        int ancho = Painter.convertXToWindow(candy.getWidth(), mundo, ventana);
        int alto = Painter.convertYToWindow(candy.getHeight(), mundo, ventana);
        context.drawImage(Loader.getImage( candy.getTipo().getFilename()), x, y, ancho, alto);
    }
    
    //Metodo que convierte a x en coordenadas de ventana
    static private int convertXToWindow(int x, Dimension board, Dimension ventana)
    {
        return x*ventana.getWidth()/board.getWidth();
    }
    
    //Metodo que convierte a y en coordenadas de ventana
    static private int convertYToWindow(int y, Dimension board, Dimension ventana)
    {
        return y*ventana.getHeight()/board.getHeight();
    }
    
    //Metodo que convierte la magnitud en coordenadas de ventana
    static private int convertMagnitudeToWindow(int magnitud, Dimension board, Dimension ventana)
    {
        double diagonalBoard = Math.sqrt( board.getWidth()*board.getWidth() + board.getHeight()*board.getHeight() );
        double diagonalVentana = Math.sqrt( ventana.getWidth()*ventana.getWidth() + ventana.getHeight()*ventana.getHeight() );
        return (int)(magnitud*diagonalVentana/diagonalBoard);
    }
    
}
