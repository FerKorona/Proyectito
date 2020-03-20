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
public class Gato extends Animal implements Volador{

    @Override
    public void comer() {
        cazar();
        System.out.println("Comiendome un raton...");
    }

    //@Override
    @Override
    public void hacerRuido() {
        System.out.println("Miau...");
    }
    public void cazar(){
        System.out.println("Cazando un raton...");
    }

    @Override
    public void volar() {
        System.out.println("El gato voladooor!...");
    }
    
    
}
