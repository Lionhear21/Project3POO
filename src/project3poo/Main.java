/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start( Stage stage ) throws Exception {//Muestra la Stage principal
        MenuPrincipal menuPrincipal = new MenuPrincipal(); //Se crea una instancia de la clase "MainStage" 
        menuPrincipal.show(); //Se muestra la instancia creada
    }
}
