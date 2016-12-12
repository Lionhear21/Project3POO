/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

        //BorderPane menuPrincipal = new BorderPane();
        //Image image = new Image(getClass().getResourceAsStream("Red_Candy"));
        //Label fondo = new Label("", new ImageView(image));
        //root.getChildren().add(fondo);
                
        VBox centralPane = new VBox();
        this.jugar = new Button("Jugar");
        this.jugar.setPrefWidth(500);
        this.instrucciones = new Button("Instrucciones");
        this.instrucciones.setPrefWidth(500);
        this.ranking = new Button("Ranking");
        this.ranking.setPrefWidth(500);
        this.acercaDe = new Button("Acerca de");
        this.acercaDe.setPrefWidth(500);
        this.salir = new Button("Salir");
        this.salir.setPrefWidth(500);
        centralPane.getChildren().addAll(this.jugar, this.instrucciones, this.ranking, this.acercaDe, this.salir);
        centralPane.setAlignment(Pos.CENTER);
        root.getChildren().add(centralPane);

        //menuPrincipal.setCenter(centralPane);
        
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
