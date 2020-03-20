/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.io.FileReader;

/**
 *
 * @author sinfante
 */
public class PruebaExcepciones {
    
    public static void main(String[] args) {
        
        //FileReader lector=new FileReader("archivito.txt");
        
        System.out.println("LOs argumentos que me enviaste para el programa son:");
        /*una excepcion es una notificacion de un error.
        cuando ocurre el error, se crea el objeto de tipo excepciom
        y se "lanza".
        En nuestro programa podemps "atrapar" la excepcion y hacer
        acciones de acuerdo al error.
        */
        try{ //intentaremos ejecutar codigo propenso a error
            int x;
            x=25/1;
           for(int i=0;i<5;i++){
               System.out.println("Argumento "+(i+1)+": "+args[i]);
            }
            System.out.println("Programa terminado...");
        }catch(ArrayIndexOutOfBoundsException e){
           //atrapamos la excepcion.
           //La excepcion es el objeto e recibido en catch
            System.out.println("Debes de poner 5 argumentos... no seas plomo.");
        }
        catch(ArithmeticException em){
            System.out.println("ocurrio un error aritmetico: "+em.getMessage());
        }
        finally{
            System.out.println("Esto siempre se ejecuta al final, "
                    + "ocurra o no una excepcion");
        }
    }
    
}
