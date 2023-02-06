package src;
import java.util.ArrayList;

/**
 * BubbleSort es una clase que utiliza el bubblesort para ordenar un array de enteros
 * @author Leonel Contreras 18797
 * @version 1.0
 */
public class BubbleSort {

    
    /** 
     * @param numerosaordenar
     */
    public static void bubbleSort(ArrayList<Integer> numerosaordenar) {
        // declaramos un contador del numero de elementos ordenados
        int numSorted = 0;
        // declaramos un entero que servira de indica
        int i;
        // obtenemos la cantidad de numeros a ordenad
        int n = numerosaordenar.size();

        // Realizamos el ordenamiento hasta ordenar todos los elementos de la lista
        while (numSorted<n) {
            // movemos un elemento mayor a la posicion siguiente
            for (i  = 1; i < n-numSorted; i++) {
                int posicion = numerosaordenar.get(i-1);
                int posicionsucesor = numerosaordenar.get(i);

                // validamos si debe realizarce el cambio de posicion en la lista
                if (posicion>posicionsucesor) {
                    // ponemos el elemento menor en la posicion index-1
                    numerosaordenar.set(i-1, posicionsucesor);
                    // ponemos el elemento mayor en la posicion index
                    numerosaordenar.set(i, posicion);
                }
            }
            // agregamos en uno el numero de elementos ordenados
            numSorted++;
        }

    }
}