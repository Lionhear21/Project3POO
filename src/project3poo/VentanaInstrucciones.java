/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class VentanaInstrucciones extends Stage
{
    private MenuPrincipal mainWindow;
    
    public VentanaInstrucciones(MenuPrincipal mainWindow)
    {
        this.mainWindow = mainWindow;
        
        super.setTitle("Instrucciones");
        
        StackPane root = new StackPane();
        
        //Label label = new Label("", new ImageView(Loader.getImage()));
        //root.getChildren().add(label);
    }
}
