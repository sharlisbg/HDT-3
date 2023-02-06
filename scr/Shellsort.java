package scr;
/**
 * Shellsort es una clase que implementa el algoritmo de Shellsort para ordenar un arraylist de enteros
 * @author Leonel Contreras 18797
 * @version 1.0
 */

 import java.util.ArrayList;

public class Shellsort {

    /**
     * shellsort es un metodo que implementa el algoritmo de shellsort para ordenar un arraylist de enteros
     * Se declara static para poder utilizarlo sin necesidad de crear una instancia de Shellsort
     * @param listaaordenar
     */
    public static void shellsort(ArrayList <Integer> listaaordenar) {
        int n = listaaordenar.size();

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = listaaordenar.get(i);
                int j = i;
                while (j >= gap && listaaordenar.get(j-gap) > key) {
                    listaaordenar.set(j,listaaordenar.get(j-gap));
                    j -= gap;
                }
                listaaordenar.set(j, key);
            }
        }
    }
}