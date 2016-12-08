/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3poo;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author chico
 */
public class MainCanvas extends Canvas implements EventHandler, ChangeListener {
    
    private Prototype prototype;
    private final GraphicsContext context;

    public MainCanvas() {
        this.prototype = new Prototype(1366,768);
        this.context = super.getGraphicsContext2D();
        
        //Eventos del mouse
        this.addEventHandler(MouseEvent.MOUSE_CLICKED, this);
        
        
    }

    @Override
    public void handle(Event t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changed(ObservableValue ov, Object t, Object t1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    


    
}
