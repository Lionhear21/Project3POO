/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

import javafx.geometry.Pos;
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
        
        Label fondo = new Label("", new ImageView(Loader.getImage("foto.jpg")));
        root.getChildren().add(fondo);
        
        Label texto = new Label("Elio Valenzuela\nWilliam Benítez");
        root.getChildren().add(texto);
        texto.setAlignment(Pos.BASELINE_LEFT);
        
        Scene scene = new Scene(root, 640, 400);
        this.setScene(scene);
    }
}
