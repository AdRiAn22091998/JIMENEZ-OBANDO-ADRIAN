/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1.tipos.de.datos;

/**
 *
 * @author ADRIAN
 */
public class Proyecto1TiposDeDatos {

    /**
     * @param args the command line arguments
     */
    
    //Entero -32768 a 32767
    int numeroEntero = 0;
    double numeroDouble = 0.0;
    char letra = 'u';
    String cadena = "Hola Mundo" ; 
    // Aqui la primera letra va en mayuscula 
    boolean verdaderoFalso = false ;
    //para cambiar el valor solo se llama a la variable (nombre) y se le da otro valor
   // verdaderoFalso = true;
    boolean verdaderoFalso2 = true ;
    
    public static void main(String[] args) {
        // TODO code application logic here
imprimirNombre() ;
suma2Numeros(5,10);
System.out.println(suma2Numeros(5,10));

// Siempre para poder imprimir colocar System.out.println(suma2Numeros(5,10)<---la funcion);
    }
    
    
    
      // void esta funcion no es de ningun tipo 
    
        public static void imprimirNombre(){
        System.out.println("Adrian");
                
                }
       public static int suma2Numeros (int num1 ,int num2 ){
          //declaramos la variable 
          int suma = num1 + num2 ;
           return suma ;
           
       }
//Si se puede    
}
