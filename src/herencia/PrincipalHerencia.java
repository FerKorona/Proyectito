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
public class PrincipalHerencia {
    //El siguiente metodo crea un animale de forma aleatoria.
    //El tipo de animal creado depende de un numero aleatorio
    //Declararamos el metodo como static. Los miembros static
    //se conocen como miembro de clase. Los que no son static
    //se conocen como miembro de instancia. Para estos ultimos
    //es necesario crear una instancia para que existan. LOs
    //miembros static pueden ser usados sin necesidad de crear
    //instancias
    static Animal crearAnimal(){
        //Math.random() devuelve un numero aleatorio entre 0 y 1
        int numero=(int)(Math.random()*3.9);
        //Las variables locales en un metodo deben ser inicializadas
        //antes de ser utilizadas.
        //LAs variables declaradas como miembro de la clase
        //son inicializadas automaticamente a 0.
        Animal animalon=null;
        switch(numero){
            case 0: animalon=new Perro();break;
            case 1: animalon=new Gato();break;
            case 2: animalon=new Pollo();break;
            case 3: animalon=new Burro();break;
        }
        return animalon;
    }
    public static void main(String[] args) {
        //Declaramos un arreglo para crear un ejercito de
        //animales
        Animal animales[]=new Animal[10];
        for(int i=0;i<animales.length;i++)
            animales[i]=crearAnimal();
        System.out.println("Animales creados...");
        //hacemos que los animales ataquen haciendo ruido.
        for (Animal animal : animales) {
            animal.hacerRuido();
            if(animal instanceof Carnivoro)
                ((Carnivoro)animal).comerCarne();
        }
        
        for(int i=0;i<5;i++){
            Volador el_volador=null;
            if(Math.random()>0.5){
                el_volador=new Gato();
            }
            else{
                el_volador=new Dron();
            }
            el_volador.volar();
        }
    }
}
