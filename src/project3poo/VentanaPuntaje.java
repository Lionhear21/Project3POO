/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class VentanaPuntaje extends Stage
{
    private MenuPrincipal mainWindow;
    
    public VentanaPuntaje(MenuPrincipal mainWindow)
    {
        this.mainWindow = mainWindow;
        
        super.setTitle("Ranking de puntuaciones");
        
        StackPane root = new StackPane();
    }
}
