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
public class RegistroPuntaje extends Stage
{
    public RegistroPuntaje()
    {
        this.initModality(Modality.APPLICATION_MODAL);
        super.setTitle("Registrar Puntaje");
        
        StackPane root = new StackPane();
        
        Label fondo = new Label("", new ImageView(Loader.getImage("fondoMenu.jpg")));
        root.getChildren().add(fondo);
        
        Scene scene = new Scene(root, 400, 400);
        this.setScene(scene);
    }
    
//    if( (vidas = 0) || (nivelesSuperados = 10) ) {
//        if(!this.gameWindow.isShowing()) {
//            this.gameWindow.setResizable(false);
//            this.gameWindow.show();
//        }
//    }
}
