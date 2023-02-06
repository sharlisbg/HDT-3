package scr;
/**
 * InsertionSort es la clase que implementa el insertion sort.
 * @author Leonel Contreras
 * @version 1.0
 */

 import java.util.ArrayList;


public class InsertionSort {
    /**insertionSort es un metodo que implementa el algoritmo de insertion sort para ordenar una lista de enteros
     * Se declara el metodo static para poder utilizarlo sin necesidad de crear una instancia de la clase
     * @param listaaordenar es un ArrayList de enteros que se desea ordenar
     */
    public static void insertionSort(ArrayList<Integer> listaaordenar) {
        int numSorted = 1;
        int index; 
        // repetimos el algoritmo mientras el numero de elementos ordenados sea menor a la longitud de la lista
        while (numSorted<listaaordenar.size()) {
            // tomamos el primer valor sin ordenar
            int temporal = listaaordenar.get(numSorted);
            // insertamos el valor entre los datos ya ordenados
            for (index = numSorted; index >0; index--) {
                // verficamos si el temporal es menor al valor en la posicion index-1
                if (temporal < listaaordenar.get(index-1)) {
                    // sustituimos el valor en la posicion index por el valor en la posicion index-1
                    listaaordenar.set(index, listaaordenar.get(index-1));
                }else{
                    break;
                }
            }

            // reinsertamos el valor 
            listaaordenar.set(index, temporal);
            // sumamos en uno el numero de elementos ordenados
            numSorted ++;
        }
    }
}