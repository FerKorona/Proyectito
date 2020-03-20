package proyectito;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//para utilzar la clase persona, podemos importarla
//import paquete.nombre_de_clase;
//import paquete.subpaquete.nombre_de_clase;
//import paquete.*;  
/**
 *
 * @author Sergio Infante
 */
public class PrincipalProyectito {
    
    //metodo principal
    public static void main(String args[]){
        
        try {
            System.out.println("Hola mundito...");
            //declaramos una variable de "referencia". Sirven para majear
            //objetos
            Persona elvato;
            elvato=new Persona("Sempronio O'neil",25);
            Persona elotrovato=new Estudiante("Nicolas",30,12);
            elvato.saludar();
            elotrovato.saludar();
            elotrovato=elvato;
            elotrovato.saludar();
            elvato.setEdad(30);
            elvato.setNombre("Abundio McGregor");
            elvato.saludar();
            elotrovato.saludar();
            //cuando copiamos la referencia de elvato a elotrovato,
            //perdimos referencia a Sosimo.
            //CUando un objeto no esta siendo referenciado, se convierte
            //en candidato para el "garbage collector"
            System.out.println("><><><><><><><><><><>");
            //prueba de comparacion de objetos
            Estudiante est1=new Estudiante("Juan",22,234562);
            Estudiante est2=new Estudiante("Miranda",22,234562);
            
            //CUanto conmparamos dos variables de referencia con ==, comparamos el contenido
            //de las variables (referencias), no los objetos.
            //La comparacion de objetos debe hacerse con equals.
            //La version de equals heredada de Object, compara referencia. Es necesario
            //sobreescribir equals en nuestra clase, para hacer la comparacion correspondiente
            
            if(est1.equals(est2)){
                System.out.println("Son el mismo estudiante");
            }
            else{
                System.out.println("No son el mismo estudiante");
            }
            //la version de println que recibe un object ccmo argumento, convierte el objeto
            //a cadena invocando su metodo toString()
            System.out.println(elvato);
            System.out.println(est1);
        } catch (Exception ex) {
            System.out.println("Edad no valida");
        }
        
        
    }
}

