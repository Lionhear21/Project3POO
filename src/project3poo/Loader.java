/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

import java.util.HashMap;
import javafx.scene.image.Image;

/**
 *
 * @author chico
 */
public class Loader {
    static private final HashMap<String, Image> IMAGENES = new HashMap<>();
    
    static public Image getImage(String filename) {
        Image image = Loader.IMAGENES.get(filename);
        if(image != null){
            return image;
        }
        image = new Image(Painter.class.getResourceAsStream("/project3poo/Candies_Images/" + filename));
        Loader.IMAGENES.put(filename,image);
        return image;
    }
    
}
