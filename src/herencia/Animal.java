/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author sinfante
 */
public abstract class Animal {
    float peso;
    float tamanio;
    
    public abstract void comer();
    public void dormir(){
        System.out.println("zzzzzz...");
    }
    public abstract void hacerRuido();
    
}
