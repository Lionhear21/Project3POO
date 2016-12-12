/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

import java.util.logging.Level;
import java.util.logging.Logger;
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
 * @author Elio Lienzo en el cual trabajaremos las imagenes
 */
public class MainCanvas extends Canvas implements EventHandler, ChangeListener {
    

    private Prototype prototype; //Mecanicas de juego
    private final GraphicsContext context; //Buffer del Canvas
    private int count;
    private Candy[] swaps;

    //Constructor
    public MainCanvas() {
        this.prototype = new Prototype(1366, 768); //Instanciamos el juego(ancho de la ventana, largo de la ventana)
        this.context = super.getGraphicsContext2D(); //Instanciamos el Buffer del Canvas

        //Copiado de ejemplos profe raskanoid, Clase "FXRaskanoidCanvas.java"
        //Eventos del mouse
        this.count = 0;
        this.addEventHandler(MouseEvent.MOUSE_PRESSED, this); // Click del mouse
        this.swaps = new Candy[2]; //Array para guardar los que van a ser cambiados
        
        

        //agrego eventos de cambios del tamano 
        this.widthProperty().addListener(this);
        this.heightProperty().addListener(this);

        //Timeline timer = new Timeline( new KeyFrame(Duration.millis(5), this));
        //timer.setCycleCount(Animation.INDEFINITE);
        //timer.play();
    }

    @Override
    public void handle(Event event) {
        if (event.getEventType() == MouseEvent.MOUSE_PRESSED){
            MouseEvent me = (MouseEvent) event;
            double x = me.getX(); //obtengo el x del mouse
            double y = me.getY(); //obtengo el y del mouse
            System.out.println("X: " + x + "\nY: " + y);
            Candy candy = prototype.getNivel(0).getCandy(x, y); //obtengo el objeto en clickeado
            this.swaps[count] = candy;
            this.count++;
            if(this.count == 2){
                this.prototype.changePosition(this.prototype.getNivel(0), swaps);
                this.prototype.checkeo(this.prototype.getNivel(0), 0, 0);
                this.repaint(); //Repinta el canvas
                this.count = 0;
            }
        }
        
    }

    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue)//Metodo que indica si algo a cambiado
    {
        this.repaint();//repinta el canvas si algo a cambiado
    }

    private void repaint() { //Metodo el cual repinta todo el canvas
        this.context.clearRect(0, 0, (int) this.getWidth(), (int) this.getHeight()); //Borra el canvas actual
        //this.context.drawImage(Loader.getImage("Red_Candy"), 0, 0, this.getWidth(), this.getHeight());

        if (this.prototype != null) { //Si el juego "aun esta corriendo" o "si contiene algun valor" ?
            //El pintador vuelve a pintar el canvas
            Painter.paint(this.prototype, //Con el juego... 
                    this.context, //El buffer...
                    prototype.getBoard(), //El tablero de juego...
                    new Dimension((int) this.getWidth(), (int) this.getHeight())); //...y el tamaño
        }
    }
}
