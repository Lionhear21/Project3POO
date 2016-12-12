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
public class VentanaAcercaDe extends Stage
{
    private MenuPrincipal mainWindow;
    
    public VentanaAcercaDe(MenuPrincipal mainWindow)
    {
        this.mainWindow = mainWindow;
        this.initModality(Modality.APPLICATION_MODAL);
        super.setTitle("Acerca de ...");
        
        StackPane root = new StackPane();
        
        Label fondo = new Label("hola", new ImageView(Loader.getImage("fondo.jpg")));
        fondo.setMinWidth(400);
        fondo.setMinHeight(400);
        
        root.getChildren().add(fondo);
        
        
        Scene scene = new Scene(root, 640, 600);
        this.setScene(scene);
    }
}
