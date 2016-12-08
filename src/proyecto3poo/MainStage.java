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
 * @author chico
 */
public class MainStage extends Stage {

    public MainStage() {
        BorderPane mainPane = new BorderPane();
        
        MainCanvas paint = new MainCanvas();
        mainPane.setCenter(paint);
        
        paint.widthProperty().bind(mainPane.widthProperty());
        paint.heightProperty().bind(mainPane.heightProperty());
        
        Scene scene = new Scene(mainPane, 800, 600);
        super.setScene(scene);
        super.setTitle("Prototype");
    }
    
    
    
}
