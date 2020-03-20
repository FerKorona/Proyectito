/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//para utilzar la clase persona, podemos importarla
//import paquete.nombre_de_clase;
//import paquete.subpaquete.nombre_de_clase;
//import paquete.*;  
import mipaqueton.Persona;
/**
 *
 * @author Sergio Infante
 */
public class PrincipalProyectito {
    
    //metodo principal
    public static void main(String args[]){
        
        System.out.println("Hola mundito...");
        //declaramos una variable de "referencia". Sirven para majear
        //objetos
        Persona elvato;
        elvato=new Persona("Sempronio O'neil",25);
        Persona elotrovato=new Persona("Sosimo Juarez");
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
        
    }
}

