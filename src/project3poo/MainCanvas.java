/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Elio
 * Lienzo en el cual trabajaremos las imagenes
 */
public class MainCanvas extends Canvas implements EventHandler, ChangeListener 
{
    
    private Prototype prototype; //Mecanicas de juego
    private final GraphicsContext context; //Buffer del Canvas

    //Constructor
    public MainCanvas() 
    {
        this.prototype = new Prototype(1366, 768); //Instanciamos el juego(ancho de la ventana, largo de la ventana)
        this.context = super.getGraphicsContext2D(); //Instanciamos el Buffer del Canvas
        
        //Copiado de ejemplos profe raskanoid, Clase "FXRaskanoidCanvas.java"
        //Eventos del mouse
        this.addEventHandler(MouseEvent.MOUSE_PRESSED, this); // Click del mouse
        
        //agrego eventos de cambios del tamano 
        this.widthProperty().addListener(this);
        this.heightProperty().addListener(this);
        
        Timeline timer = new Timeline( new KeyFrame(Duration.millis(5), this));
        timer.setCycleCount(Animation.INDEFINITE);
        timer.play();
    }
    
    @Override
    public void handle( Event event ) {
        if(event.getSource() instanceof KeyFrame) { //Si el juego esta andando?
            //Eventos en los cuales se agregan puntos al puntaje del jugador, "Examinar"
            this.repaint();
            
        }
        
        //Eventos del Mouse
        if(event.getEventType() == MouseEvent.MOUSE_PRESSED) {
            MouseEvent me = (MouseEvent)event;
            //Agregar metodos que hagan que se mueva un dulce y se repinte el canvas
            
        }
    }

    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue)//Metodo que indica si algo a cambiado
    {
       this.repaint();//repinta el canvas si algo a cambiado
    }
    
    private void repaint(){ //Metodo el cual repinta todo el canvas
        this.context.clearRect(0, 0, (int)this.getWidth(), (int)this.getHeight()); //Borra el canvas actual
        
        if(this.prototype != null){ //Si el juego "aun esta corriendo" o "si contiene algun valor" ?
            //El pintador vuelve a pintar el canvas
            Painter.paint(this.prototype, //Con el juego... 
                    this.context, //El buffer...
                    prototype.getBoard(), //El tablero de juego...
                    new Dimension((int)this.getWidth(),(int)this.getHeight())); //...y el tamaño
        }
    }
}
