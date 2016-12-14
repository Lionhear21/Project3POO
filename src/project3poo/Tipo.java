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
public enum Tipo 
{
    AZUL("Blue_Candy.png","Blue_Candy_selected.png"),
    VERDE("Green_Candy.png","Green_Candy_selected.png"),
    NARANJO("Orange_Candy.png","Orange_Candy_selected.png"),
    PURPURA("Purple_Candy.png","Purple_Candy_selected.png"),
    ROJO("Red_Candy.png","Red_Candy_selected.png"),
    AMARILLO("Yellow_Candy.png","Yellow_Candy_selected.png"),
    NULL("null.png","null.png");
    
    private final String filename;
    private final String filenameSelected;
    
    private Tipo(String filename, String filenameSelected)
    {
        this.filename = filename;
        this.filenameSelected = filenameSelected;
    }

    public String getFilename()
    {
        return filename;
    }

    public String getFilenameSelected()
    {
        return filenameSelected;
    }
}
