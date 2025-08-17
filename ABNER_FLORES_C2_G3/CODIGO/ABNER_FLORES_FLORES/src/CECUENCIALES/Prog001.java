package CECUENCIALES;

import java.util.ArrayList; 
import java.util.Collections;

/**
 *
 * @author Eliezer Abner
 */
public class Prog001 {
    public static void inicio() { 
        ArrayList<Integer> numeros = new ArrayList<>(); 
        // Agregar elementos al ArrayList
        numeros.add(5); 
        numeros.add(10); 
        numeros.add(-50); 
        numeros.add(1000); 
        numeros.add(1); 
        // Mostrar datos del ArrayList
        System.out.println("> ArrayList original: " + numeros.toString()); 
        System.out.println("> Tamaño del ArrayList: " + numeros.size()); 
        // Eliminar posición 3 del ArrayList
        System.out.println("\nEliminar posición 3 del ArrayList"); 
        numeros.remove(3); 
        System.out.println("> Nuevo ArrayList: " + numeros.toString()); 
        System.out.println("> Tamaño del nuevo ArrayList: " + numeros.size()); 
        // Recorrido para listar los elementos uno por uno
        System.out.println("\nMostrar elementos con for each()"); 
        int posicion = 0; 
        for (Integer numero : numeros) { 
        System.out.println("numeros[" + posicion + "] --> " + numero); 
        posicion++; 
        } 
        // Para obtener el valor de un elemento utilizamos get()
        System.out.println("\nObtener el valor de un elemento: get()"); 
        System.out.println("numeros[2] --> " + numeros.get(2)); 
        // Para asignar o editar el valor de un elemento utilizamos set()
        System.out.println("\nAsignar el valor de un elemento: set()"); 
        System.out.println("numeros.set(2,777)"); 
        numeros.set(2, 777); 
        System.out.println("> Nuevo ArrayList: " + numeros.toString()); 
        // Agregar un nuevo elemento en una determinada posicion del ArrayList
        System.out.println("\nAgregar el valor 222 en la posicion 2"); 
        System.out.println("numeros.add(2,222)"); 
        numeros.add(2, 222); 
        System.out.println("> Nuevo ArrayList: " + numeros.toString()); 
        System.out.println("> Tamaño del nuevo ArrayList: " + numeros.size()); 
        // Para ordenar elementos numéricos utilizamos Collections.sort()
        System.out.println("\nOrdenar elementos numéricos: Collections.sort()"); 
        Collections.sort(numeros); 
        System.out.println("> Nuevo ArrayList ordenado: " + numeros.toString()); 
        System.out.println("> Tamaño del ArrayList ordenado: " + numeros.size()); 
        } 
       public static void main(String[] args) { 
        inicio(); 
    }
    
}
