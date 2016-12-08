/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3poo;

/**
 *
 * @author chico
 */
public enum Tipo {
    
    AZUL(""),
    VERDE(""),
    GRIS(""),
    PURPURA(""),
    ROJO(""),
    AMARILLO("");
    
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
