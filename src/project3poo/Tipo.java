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
    AZUL("Blue_Candy.png"),
    VERDE("Green_Candy.png"),
    NARANJO("Orange_Candy.png"),
    PURPURA("Purple_Candy.png"),
    ROJO("Red_Candy.png"),
    AMARILLO("Yellow_Candy.png"),
    NULL("null.png");
//    AZUL_SELECTED("Blue_Candy_selected.png"),
//    VERDE_SELECTED("Green_Candy_selected.png"),
//    NARANJO_SELECTED("Orange_Candy_selected.png"),
//    PURPURA_SELECTED("Purple_Candy_selected.png"),
//    ROJO_SELECTED("Red_Candy_selected.png"),
//    AMARILLO_SELECTED("Yellow_Candy_selected.png");
    
    private final String filename;
    //private final String filenameSelected;
    
    private Tipo(String filename)//, String filenameSelected)
    {
        this.filename = filename;
        //this.filenameSelected = filenameSelected;
    }

    public String getFilename()
    {
        return filename;
    }

//    public String getFilenameSelected()
//    {
//        return filenameSelected;
//    }
}
