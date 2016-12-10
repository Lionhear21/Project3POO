/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class MenuPrincipal extends Stage
{
    private MainStage gameWindow;
    private Button jugar;
    private Button instrucciones;
    private Button ranking;
    private Button acercaDe;
    private Button salir;
    
    public MenuPrincipal()
    {
        super.setTitle("MenuJuego");
        StackPane root = new StackPane(); //Menu principal del juego

        BorderPane menuPrincipal = new BorderPane();
        root.getChildren().add(menuPrincipal);
        
        VBox centralPane = new VBox();
        centralPane.getChildren().addAll();
        menuPrincipal.setCenter(centralPane);
        
        Scene scene = new Scene(root, 800, 600); 
        super.setScene(scene); 
    }
}
