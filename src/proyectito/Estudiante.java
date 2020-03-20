/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectito;

/**
 *
 * @author sinfante
 */
//Para derivar una clase de otra, se utiliza la palabra reservada "extends"
public class Estudiante extends Persona{
    //atributos propios del estudiante
    int matricula=0;
    //declaramos un constructor para esta clase
    public Estudiante(String nombre){
        //Los constructores se invocan recursivamente. Esto es, antes de
        //que se ejecute el codigo de este constructor, se invoca el constructor
        //de la clase padre. De igual forma, antes de ejecutar el codigo de
        //construccion de Persona, se invoca al constructor de la clase padre
        //de PErsona.
        //Todas las clases estan derivadas de otra clase, a excepcion de la clase
        //Object. Object es la raiz de la jerarquia de clases de Java.
        //Si no hacemos explicita la herencia, Java deriva automaticamente de Object.
        //La llamada recursiva a constructores para en el constructor de Object.
        //Si no se especifica un constructor de la clase padre a ejecutar,
        //se ejecuta un constructor sin parametros.
        this.nombre=nombre;
    }
    public Estudiante(String nombre,int edad,int matricula){
        //para hacer referencia a metodos a niver clase padre, se utiliza
        //super. Para invocar un constructor de la clase padre, usamos super.
        //Debe ser la primer linea en un constructor.
        super(nombre,edad);
        //inicializamos el atributo especifico de esta clase
        this.matricula=matricula;   
    }
    
    
    @Override
    //la anotacion @override sirve para indicar que este metodo
    //sobreescribe a otro metodo en la clase padre
    public void saludar(){
        System.out.println("SOy el estudiante "+nombre+" y tengo "+edad+" anios en la carrera...");
    }
    
    //sobreescritura de equals heredado de Object. La version de Object compara
    //referencias, nosotros necesitamos comparar las matriculas.
    @Override
    public boolean equals(Object o2){
        //verificamos primero que el objeto recibido como argumento
        //tambien sea un estudiante. Para eso utilizamos
        //el operador instanceof
        if(o2 instanceof Estudiante){
            //necesitamos convertir la referencia al mismo tipo de
            //este objeto
            Estudiante e2=(Estudiante)o2;
            if(this.matricula==e2.matricula){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String ret="[Nombre->"+nombre+",edad->"+edad+",Matricula->"+matricula+"]";
        
        return ret; //To change body of generated methods, choose Tools | Templates.
    }
    
}
