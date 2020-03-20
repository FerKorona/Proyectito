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
//En java no se puede derivar una clase de dos o mas clases. La herencia es
//solo para una clase. La alternativa a herencia multiple son las interfaces.
//La clase puede implementar una o mas interfaces.
public class Perro extends Animal implements Carnivoro{
    @Override
    public void hacerRuido(){
        ladrar();
    }
    @Override
    public void comer(){
        /*System.out.println("Comiendo un hueso...");
        System.out.println("vomitando...");
        System.out.println("Comiendome mi vomitada...");*/
        comerCarne();
    }

    private void ladrar() {
        System.out.println("Barf barf...");
    }
    
    @Override
    public void comerCarne(){
        System.out.println("Comiendo un pedazo de carne...");
        System.out.println("Lo vomito...");
        System.out.println("Me lo vuelvo a comer...");
    }
    
}
