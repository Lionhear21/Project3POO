/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
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
        this.initModality(Modality.APPLICATION_MODAL);
        super.setTitle("Instrucciones");
        
        StackPane root = new StackPane();
        
        Label fondo = new Label("", new ImageView(Loader.getImage("instrucciones.jpg")));
        root.getChildren().add(fondo);
        
        Scene scene = new Scene(root, 640, 600);
        this.setScene(scene);
    }
}
