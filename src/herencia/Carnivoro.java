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
//solo para una clase. (no hay herencia multiple).
//Una alternativa es es uso de interfaces. Una interfaz es como una clase
//abstracta que solamente declara metodos (no puede tener atributos).
// La interfaz define forma de interaccion con otros objetos, todos los metodos
//son public y abstract, aunque no se declaren asi explicitamente.
//Los nombres de interfaces regularmente son adjetivos, por que deben
//dar la idea de que haran los objetos del tipo de la interfaz.
//Una interfaz, puede ser implementada por una clase.

public interface Carnivoro {
    public void comerCarne();
}
