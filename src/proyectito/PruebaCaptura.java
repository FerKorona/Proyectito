/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectito;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sinfante
 */
public class PruebaCaptura {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Persona el_vato=new Persona();
        
        System.out.println("Dime el nombre del vato: ");
        //leemos la proxima linea para el nombre
        String nombre=scanner.nextLine();
        el_vato.setNombre(nombre);
        while(true){
            System.out.println("Dime la edad: ");
            int edad=scanner.nextInt();

            try {
                el_vato.setEdad(edad);
                break;
            } catch (InvalidAgeException ex) {
                System.out.println(""+edad+" no es una edad valida!");
            }
        }  
        System.out.println("El vato: "+el_vato);
        
    }
    
}
