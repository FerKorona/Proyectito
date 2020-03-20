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
public class Burro extends Animal{

    @Override
    public void comer() {
        System.out.println("Comiendo maiz....");  
        
    }

    @Override
    public void hacerRuido() {
        System.out.println("Fue horrible!");
    }
    
}
