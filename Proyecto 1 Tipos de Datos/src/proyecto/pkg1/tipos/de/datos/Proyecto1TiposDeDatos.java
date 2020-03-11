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

// Siempre para poder imprimir colocar
//System.out.println(suma2Numeros(5,10)<---la funcion);

    }
    
    
    
      // void esta funcion no es de ningun tipo 
    
        public static void imprimirNombre(){
              // para saltar una linea se coloca \n 
        System.out.println("Adrian \n Jimenez ");
        
        //Propiedades 
      
        // sirve para poner tabulado ( da un espacio ) = \t
        // \n <--> salto de linea 
        //  \t <--> tabular 
        //  \b  <--> borrar a la izquierda 
        //  \f  <--> comienzo de pagina 
        //  \r  <--> retroceder 
       
        
        // para ver el numero de caracteres que tiene una palabra poner length()
     
     
        String nombre = "   Adrian " ; 
        System.out.println(nombre.length ());
        
         //elimina los espacios de los lados de las cadena de caracteres  .trim(
        
        System.out.println(nombre.trim());
        
        // .toUppersCase () es para hacer a toda la cadena en mayuscula
        
        System.out.println(nombre.toUpperCase());
        
        // .toLowerCase () s para poner en minusculas todas las letras 
        
        System.out.println(nombre.toLowerCase());
        
        //.replace para remplazar 
        
        System.out.println(nombre.replace(nombre , "Aldahir Jimenez "));
        
        //.split() es el valor con el que se divide la palabra 
        
        System.out.println(nombre.split(""));
        

        
        // .t
        
                
                }
       public static int suma2Numeros (int num1 ,int num2 ){
          //declaramos la variable 
          int suma = num1 + num2 ;
           return suma ;
           
       }
//Si se puede    
}
