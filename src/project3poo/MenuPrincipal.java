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
    final private VentanaInstrucciones instruccionesWindow = new VentanaInstrucciones(this);
    final private VentanaPuntajes puntajesWindow = new VentanaPuntajes(this);
    final private VentanaAcercaDe acercaDeWindow = new VentanaAcercaDe(this);
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
        
        Label fondo = new Label("", new ImageView(Loader.getImage("fondoMenu.jpg")));
        root.getChildren().add(fondo);
        
        VBox centralPane = new VBox(20);
        this.jugar = new Button("Jugar");
        this.jugar.setPrefWidth(300);
        this.instrucciones = new Button("Instrucciones");
        this.instrucciones.setPrefWidth(300);
        this.ranking = new Button("Ranking");
        this.ranking.setPrefWidth(300);
        this.acercaDe = new Button("Acerca de");
        this.acercaDe.setPrefWidth(300);
        this.salir = new Button("Salir");
        this.salir.setPrefWidth(300);
        centralPane.getChildren().addAll(this.jugar, this.instrucciones, this.ranking, this.acercaDe, this.salir);
        centralPane.setAlignment(Pos.CENTER);
        root.getChildren().add(centralPane);

        //menuPrincipal.setCenter(centralPane);
        
        Scene scene = new Scene(root, 400, 600); 
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
        if( event.getSource() == this.jugar ) {
            if(!this.gameWindow.isShowing()) {
                this.gameWindow.setResizable(false);
                this.gameWindow.show();
            }
        }
        
        if( event.getSource() == this.instrucciones ) {
            if(!this.instruccionesWindow.isShowing()) {
                this.instruccionesWindow.setResizable(false);
                this.instruccionesWindow.show();
            }
        }
        
        if( event.getSource() == this.ranking ) {
            if(!this.puntajesWindow.isShowing()) {
                this.puntajesWindow.setResizable(false);
                this.puntajesWindow.show();
            }
        }
        
        if( event.getSource() == this.acercaDe ) {
            if(!this.acercaDeWindow.isShowing()) {
                this.acercaDeWindow.setResizable(false);
                this.acercaDeWindow.show();
            }
        }
        
        if( event.getSource() == this.salir ) {
            this.close();
        }
    }
}
