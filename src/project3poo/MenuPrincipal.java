/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

import javafx.event.Event;
import javafx.event.EventHandler;
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
public class MenuPrincipal extends Stage implements EventHandler
{
    final private MainStage gameWindow = new MainStage(this);
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
        this.jugar = new Button("Jugar");
        this.jugar.setPrefWidth(100);
        this.instrucciones = new Button("Instrucciones");
        this.instrucciones.setPrefWidth(100);
        this.ranking = new Button("Ranking");
        this.ranking.setPrefWidth(100);
        this.acercaDe = new Button("Acerca de");
        this.acercaDe.setPrefWidth(100);
        this.salir = new Button("Salir");
        this.salir.setPrefWidth(100);
        centralPane.getChildren().addAll(this.jugar, this.instrucciones, this.ranking, this.acercaDe, this.salir);
        menuPrincipal.setCenter(centralPane);
        
        Scene scene = new Scene(root, 800, 600); 
        super.setScene(scene); 
        
        this.jugar.setOnAction(this);
        this.instrucciones.setOnAction(this);
        this.ranking.setOnAction(this);
        this.acercaDe.setOnAction(this);
        this.salir.setOnAction(this);
    }

    @Override
    public void handle(Event event)
    {
        if( event.getSource() == this.jugar )
        {
            if(!this.gameWindow.isShowing()) {
                this.gameWindow.setResizable(false);
                this.gameWindow.show();
            }
        }
    }
}
