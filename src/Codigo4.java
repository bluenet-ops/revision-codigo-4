/**
 * Este programa simula el juego de piedra, papel o tijera.
 * 
 * Inicialmente se importa el paquete java.util.scanner para hacer uso de la función Scanner y recibir datos
 * del usuario, posteriormente se le solicita ingresar dos datos como si fuera el jugador 1 y 2.
 * 
 * Luego se evalua con un if el dato de entrada de j1 vs j2 y se utiliza .equals al ser un tipo de dato String, en
 * la línea 35 compara que si el usuario j1 ingresa lo mismo que el usuario j2 imprimirá la palabra "Empate" de lo
 * contrario se inicia la declaración switch no sin antes definir una variable en la que ganador 2 es el valor
 * inicial para poder hacer las comparaciones de casos.
 * 
 * En el caso 1 que es "piedra", se evalua que si j2 tiene el mismo dato de ingreso "tijera" se modifica la variable
 * ganador a 1 y así consecutivamente según sea el caso hasta que termina en default el cual imprime un mensaje de 
 * dato inválido en caso de que se ingrese una palabra distinta a piedra, papel o tijera y finaliza el ciclo con return.
 * 
 * Finalmente, se imprime el mensaje indicando quién es el ganador con el dato de la variable ganador ya sea 2 o 1
 * y se cierra la función Scanner.
 * 
 */

import java.util.Scanner; // Se importó java.util.Scanner

public class Codigo4 {
	
	public static void main(String[] args) { // Se agrega punto de entrada para su ejecución
	Scanner sc = new Scanner(System.in); // Se modifica nombre de s a sc y se agrega la entrada universal
    
    System.out.println("Turno del jugador 1 (Introduzca piedra, papel o tijera): ");// Se corrigó print por println
    String j1 = sc.nextLine();
    
    System.out.println("Turno del jugador 2 (Introduzca piedra, papel o tijera): ");// Se corrigó print por println
    // Se eliminó la segunda apertura del Scanner
    String j2 = sc.nextLine();
    
    if (j1.equals(j2)) { // Se corrige == a .equals para cadena de texto
      System.out.println("Empate");
    } else {
    
    int ganador = 2;
      
      switch(j1) {
        case "piedra":
          if (j2.equals("tijera")) { // Se corrige == a .equals para cadena de texto
            ganador = 1;
          }
          break; // Se agregan el break correspondiente y en línea 31
        case "papel":
          if (j2.equals("piedra")) { // Se corrige == a .equals para cadena de texto
            ganador = 1;
          }
          break;
        case "tijera":
          if (j2.equals("papel")) {
            ganador = 1;
          }
          break;
        default:
        	System.out.println("Entrada no válida");
        return;
      	}
      System.out.println("Gana el jugador: " + ganador);
    }
    sc.close();// Se agrega cierre de Scanner
	}// main
}// class Codigo4