/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

import java.util.Calendar;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class RegistroPuntaje extends Stage implements EventHandler
{
    private Prototype prototipo;
    private Button accept;
    private TextField field;
    
    public RegistroPuntaje(Prototype prototipo)
    {
        this.prototipo = prototipo;
        
        this.initModality(Modality.APPLICATION_MODAL);
        super.setTitle("Registrar Puntaje");
        
        BorderPane root = new BorderPane();
        
        Label fondo = new Label("", new ImageView(Loader.getImage("fondoMenu.jpg")));
        root.getChildren().add(fondo);
        
        this.field = new TextField();
        field.setPrefWidth(200);
        field.getText();
        
        Label nickName = new Label("Nick");
        nickName.setPrefWidth(50);
        
        HBox hbox1 = new HBox();
        hbox1.getChildren().addAll(nickName, field);
        root.setCenter(hbox1);
        
        this.accept = new Button("Aceptar");
        root.setBottom(accept);

        Scene scene = new Scene(root, 400, 200);
        this.setScene(scene);
        
        this.accept.setOnAction(this);
    }

    @Override
    public void handle(Event event) {
        if(event.getSource() == this.accept){
            System.out.println("texto: " + this.field.getText());
            if(!this.field.getText().trim().isEmpty()){
                Calendar calendar = Calendar.getInstance();
                this.prototipo.addPlayer(new Player( this.field.getText() , this.prototipo.getTotalScore(), calendar.get(Calendar.DATE)+ "/" + calendar.get(Calendar.MONTH)+ "/" + calendar.get(Calendar.YEAR) ));
                Player player = this.prototipo.getPlayer(this.field.getText());
                System.out.println("Name: " + player.getName());
                System.out.println("Date: " + player.getDate());
                System.out.println("Score: " +  player.getScore());
            }
        }
        this.close();
    }
}
