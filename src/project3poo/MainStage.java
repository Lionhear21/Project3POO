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
    private int score = 0;
    private MenuPrincipal mainWindow;

    public MainStage(MenuPrincipal mainWindow) {
        
        this.mainWindow = mainWindow;
        this.initModality(Modality.APPLICATION_MODAL);
        super.setTitle("Candy Crush 100% real no fake 2016 un link mega");
        
        BorderPane mainPane = new BorderPane(); //Panel principal
        
        HBox hud = new HBox(20);
        Label labelVidas = new Label("Vidas = 5");
        labelVidas.setMinHeight(20);
        Label labelPuntaje = new Label("Puntaje = " + score);
        hud.getChildren().addAll(labelVidas, labelPuntaje);
        
        MainCanvas Canvas = new MainCanvas(); //Nuestro lienzo en el cual pintaremos todo
        mainPane.setCenter(Canvas); //Colocamos el lienzo en medio de Panel principal
        mainPane.setTop(hud);
        
        //Copiado de ejemplos profe raskanoid, Clase "FXRaskanoidStage.java"
        //Para que el Canvas tome el tamano del panel contenedor
        Canvas.widthProperty().bind(mainPane.widthProperty());
        Canvas.heightProperty().bind(mainPane.heightProperty());
        
        Scene scene = new Scene(mainPane, 800, 600); //Creamos la escena a mostrar,(colocamos el panel principal, ancho en pixeles, largo en pixeles)
        super.setScene(scene); //Mostramos la escena con el panel "principal creado"
    }
}
