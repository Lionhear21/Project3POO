/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class VentanaPuntajes extends Stage
{
    private MenuPrincipal mainWindow;
    
    public VentanaPuntajes(MenuPrincipal mainWindow)
    {
        this.mainWindow = mainWindow;
        this.initModality(Modality.APPLICATION_MODAL);
        super.setTitle("Ranking de puntuaciones");
        
        StackPane root = new StackPane();
        
        Scene scene = new Scene(root, 640, 600);
        this.setScene(scene);
    }
}
