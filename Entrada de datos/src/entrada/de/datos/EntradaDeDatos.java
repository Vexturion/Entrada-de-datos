package entrada.de.datos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaDeDatos {

    public static void main(String[] args) {

// ya conocemos los metodos de salida de datos
System.out.println("Mensaje con salto de linea");
System.out.print("Mensaje sin salto de linea");
System.out.printf("\nMensaje con %s\n", " formato"); // \n salto de linea, 

// entrada de datos 
// scanner
// deberemos importar la clase Scanner

// una vez importada instanciamos un nuevo objeto de clase Scanner
Scanner sc = new Scanner(System.in); // el constructor de dicha clase recibe como argumento System.in

System.out.println("Cual es tu nombre?");        
String nombre = sc.nextLine(); // el metodo .nextline nos retornara lo que el usuario escribio en consola hasta presionar enter

System.out.println("Cual es tu edad?");
int edad = Integer.parseInt(sc.nextLine()); // nextline solo puede retornar  un string pero como sabemos, edad 
// es un numero entero, por que recurriomos a la clase integer, que pertenece a Java lang y no es necesario importar
// a continuacion utilizamos el metodo estatico .parseint para convertir el string que recibe sc.nextline a numero entero

System.out.println("Cual es tu altura?");
float altura = sc.nextFloat();  // o bien utilizamos el metodo .nextFloat para retornar un valor flotante, en el caso anterior
                               // deberia ser .nextInt 

// System.out.println("Te gusta la salsa?");  // asi obtenemos un booleano, que recibira como argumento un true or false
// boolean respuesta = sc.nextBoolean();      // lo que limita enormemente nuestro programa, por lo que deberiamos hacer lo sig

sc.nextLine();
/* dado que el sc.nextline de boolean recibira el salto de linea de nextfloat, nuestro programa va a evaluar
 si el salto de linea es igual a Y, lo que retornara false, y nuestro programa continuara su ejecucion, sin darnos la
 oportunidad de responder las siguientes preguntas. Sin embarlo la pregunta si recibe respuesta, solo que recibe una que 
 nosotros no escribimos. Por lo tanto colocamos este nextline que almacena el salto de nextfloat y prosigue con la ejecucion
 del programa*/


System.out.println("Te gusta Java? (Y/N)");  // utlizamos (/) para limitar las respuestas del usuario
boolean respuesta = sc.nextLine().equalsIgnoreCase("Y");

if (respuesta==true){
    System.out.println("Hola " + nombre + " cuya edad es de " + edad + " años y su estatura es de " + altura + " metros. Que bueno que te guste Java");
} else {
    System.out.println("Hola " + nombre + " cuya edad es de " + edad + " años y su estatura es de " + altura + " metros. Ojala te gustara java");
}

sc.close();  // este metodo nos permite cerrar el scanner, puesto que scanner va a monitorear todo lo que ocurra en consola
             // a partir de que la instancia de tipo scanner es creada
             // por lo tanto, lo cerramos cuando ya no vayamos a capturar datos introducidos por el usuario para no consumir
             // recursos


// JOptionPane: esta clase nos permite poner una interfaz grafica para que el usuario introduzca informacion

String nombreJOP = JOptionPane.showInputDialog(null, "Cual es tu nombre?");
int edadJOP = Integer.parseInt(JOptionPane.showInputDialog(null, "Cual es tu edad?"));
// dado que .showInputDialog unicamente puede recibir strings, deberemos convertir ese string en un numero entero
float estaturaJOP = Float.parseFloat(JOptionPane.showInputDialog(null, "Cual es tu estatura?"));
int javaJOP = JOptionPane.showConfirmDialog(null, "Te gusta java?");


// JOptionPane.showMessageDialog(null, mensaje);
// con este metodo mostramos mensajes en pantalla
if (javaJOP==0){
    JOptionPane.showMessageDialog(null,"Hola " + nombreJOP + " cuya edad es de " + edadJOP + " y mide " + estaturaJOP + " metros, me alegra que te guste java" );
} else {
    JOptionPane.showMessageDialog(null,"Hola " + nombreJOP + " cuya edad es de " + edadJOP + " y mide " + estaturaJOP + " metros, ojala te gustara java" );
}





    }
    
}
