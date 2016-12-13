/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

import java.util.Calendar;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        System.out.println("Día : " + calendar.get(Calendar.DATE));
        System.out.println("Mes : " + calendar.get(Calendar.MONTH));
        System.out.println("Año : " + calendar.get(Calendar.YEAR));
        System.out.println("Hora : " + calendar.get(Calendar.HOUR));
        System.out.println("Minuto : " + calendar.get(Calendar.MINUTE));
        System.out.println("Segundo : " + calendar.get(Calendar.SECOND));
        
        launch(args);
    }
    
    @Override
    public void start( Stage stage ) throws Exception {//Muestra la Stage principal
        MenuPrincipal menuPrincipal = new MenuPrincipal(); //Se crea una instancia de la clase "MainStage" 
        menuPrincipal.show(); //Se muestra la instancia creada
    }
}
