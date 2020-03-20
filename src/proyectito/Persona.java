/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectito;

/**
 *
 * @author Sergio Infante
 */
public class Persona {
    //declaramos atributos
    protected int edad=20;
    protected String nombre="Juan";
    
    //los constructores son iguales que en C.
    //Nombre es el mismo que la clase.
    //No lleva tipo de retorno.
    //Pueden llevar parametros y pueden ser sobrecargados
    //Java crea un constructor default, sin parametros.
    //Cuando declaramos un constructor, el constructor default ya no existe
    public Persona(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public Persona(String nombre){
        this.nombre=nombre;
    }

    public Persona() {
    }
    
    private float estatura = 1.7f;

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    
    public void saludar(){
        System.out.println("Hola, mi nombre es "+nombre+" y tengo "+edad+" anios");
    }
    //en Java, el estilo de nomenclatura de metodos es: primer letra de metodo
    //debe de ser minuscula, las palabras nuevas deben comenzar con mayuscula
    
    void hacerReir(int motivo){
        if((motivo%3)==0){
            System.out.println("Jajaja...");
        }
        else{
            System.out.println("...");
        }
    }
    //setter para el atributo persona
    //cuando un metodo podria lanzar una excepcion, debe ser
    //declarado con throws
    public void setEdad(int edad) throws InvalidAgeException{
        //cuando existe un error, deberoamos notificarlo. La forma
        //apropiade es por medio de una excepcion.
        
        if(edad>=0){
            this.edad=edad;
        }
        else{
            //creamos un objeto de tipo excepcion para notificar el error
            InvalidAgeException e=new InvalidAgeException();
            //lo lanzamos para hacer la notificacion
            throw e;
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String toString(){
        //Generamos una cadena con los datos de esta persona
        String ret="["+nombre+","+edad+"]";
        return ret;  
    }
    
}
