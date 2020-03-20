/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectito;

/**
 *
 * @author sinfante
 */
public class InvalidAgeException extends Exception{

    public InvalidAgeException() {
        //invocamos un constructor de la clase padre
        super("Edad invalida");
    }
    
    
}
