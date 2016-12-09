/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3poo;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Elio
 */
public class MainStage extends Stage {

    public MainStage() {
        BorderPane mainPane = new BorderPane(); //Panel principal
        
        MainCanvas Canvas = new MainCanvas(); //Nuestro lienzo en el cual pintaremos todo
        mainPane.setCenter(Canvas); //colocamos el lienzo en medio de Panel principal
        
        //Copiado de ejemplos profe raskanoid, Clase "FXRaskanoidStage.java"
        //Para que el Canvas tome el tamano del panel contenedor
        Canvas.widthProperty().bind(mainPane.widthProperty());
        Canvas.heightProperty().bind(mainPane.heightProperty());
        
        Scene scene = new Scene(mainPane, 800, 600); //Creamos la escena a mostrar,(colocamos el panel principal, ancho en pixeles, largo en pixeles)
        super.setScene(scene); //Mostramos la escena con el panel "principal creado"
        super.setTitle("Sin título - FXPaint");
    }
}
