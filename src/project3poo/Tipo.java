/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3poo;

/**
 *
 * @author Elio
 */
public enum Tipo {
    
    AZUL("Blue_Candy.png"),
    VERDE("Green_Candy.png"),
    NARANJO("Orange_Candy.png"),
    PURPURA("Purple_Candy.png"),
    ROJO("Red_Candy.png"),
    AMARILLO("Yellow_Candy.png"),
    NULL("null.png");
    
    private final String filename;
    
    private Tipo(String filename)
    {
        this.filename = filename;
    }

    public String getFilename()
    {
        return filename;
    }
}
