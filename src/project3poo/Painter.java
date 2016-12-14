/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Elio
 */
public class Painter{
    static public void paint( Prototype prototipo, GraphicsContext context, Dimension board, Dimension ventana , int level, Candy[] swaps) { //Metodo principal, se le entrega el juego, el buffer, la dimension del tablero de juego, dimension del la ventana
    
        Nivel nivel = prototipo.getNivel(level);
        Candy[][] tablero = nivel.getTablero();
        if( nivel != null ){
            for(int i = 0; i < nivel.getHorizontalBoxes(); i++){
                for(int j = 0; j < nivel.getVerticalBoxes(); j++){
                    Painter.dibujar(tablero[i][j], context, board, ventana, Painter.isSelected(tablero[i][j], swaps));
                }
            }
        }
    }
    
    static public boolean isSelected(Candy candy, Candy[] swaps)
    {
        for (int i = 0; i < swaps.length; i++) {
            Candy swap = swaps[i];
            if(candy == swap)
                return true;
        }
        return false;
    }
    
    //Metodo que toma la imagen cargada y la pinta en el canvas
    static private void dibujar(Candy candy, GraphicsContext context, Dimension mundo, Dimension ventana, boolean selected)
    {
        int x = Painter.convertXToWindow(candy.getX(), mundo, ventana);
        int y = Painter.convertYToWindow(candy.getY(), mundo, ventana);
        int ancho = Painter.convertXToWindow(candy.getWidth(), mundo, ventana);
        int alto = Painter.convertYToWindow(candy.getHeight(), mundo, ventana);
        if( !selected )
            context.drawImage(Loader.getImage( candy.getTipo().getFilename()), x, y, ancho, alto);
        else
            context.drawImage(Loader.getImage( candy.getTipo().getFilenameSelected()), x, y, ancho, alto);
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
