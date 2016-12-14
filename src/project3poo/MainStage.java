/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Elio
 */
public class MainStage extends Stage 
{
    private MenuPrincipal mainWindow;
    public Label lblVidas;
    public Label lblPuntos;

    public MainStage(MenuPrincipal mainWindow) {
        
        this.mainWindow = mainWindow;
        this.initModality(Modality.APPLICATION_MODAL);
        super.setTitle("Candy Crush 100% real no fake 2016 un link mega");
        
        BorderPane mainPane = new BorderPane(); //Panel principal
        
        MainCanvas Canvas = new MainCanvas(this); //Nuestro lienzo en el cual pintaremos todo
        
        if(getLevelScore(Canvas) >= 1000){
            
        }
        
        HBox hud = new HBox(20);
        Label labelVidas = new Label("Vidas = ");
        lblVidas = new Label("0");
        Label labelPuntaje = new Label("Puntaje = " );
        lblPuntos = new Label("0" );
        hud.getChildren().addAll(labelVidas, lblVidas, labelPuntaje, lblPuntos);
        
        
        mainPane.setCenter(Canvas); //Colocamos el lienzo en medio de Panel principal
        mainPane.setTop(hud);
        
        //Copiado de ejemplos profe raskanoid, Clase "FXRaskanoidStage.java"
        //Para que el Canvas tome el tamano del panel contenedor
        Canvas.widthProperty().bind(mainPane.widthProperty());
        Canvas.heightProperty().bind(mainPane.heightProperty());
        
        Scene scene = new Scene(mainPane, 800, 600); //Creamos la escena a mostrar,(colocamos el panel principal, ancho en pixeles, largo en pixeles)
        super.setScene(scene); //Mostramos la escena con el panel "principal creado"
    }
    
    public int getLevelScore(MainCanvas Canvas)
    {
        return Canvas.getLevelScore();
    }
}
