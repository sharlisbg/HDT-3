import java.util.ArrayList;

/**
 * SelectionSort es la clase que tiene el metodo selectionSort que ordena un array de enteros usando el algoritmo de selectionSort
 * @author Leonel Contreras 18797
 * @version 1.0
 */
public class SelectionSort {

    /**
     * selectionSort es un metodo que utiliza el algoritmo de selection sort para ordenar un arraylist de enteros.
     * Declaramos el metodo static para poder ser utilizado sin necesidad de crear una instancia de SelectionSort
     * @param listaaordenar
     */
    public static void selectionSort(ArrayList<Integer> listaaordenar) {
        // declaramos tres enteros que nos serviran en el algoritmo
        // iniciamos con todos los elementos en desorden
        int numUnsorted = listaaordenar.size();
        int indexmax;

        // repetimos el selection sort mientras existan elementos sin ser ordenados
        while (numUnsorted>0) {
            // asumimos, para iniciar el algoritmo, que el valor maximo esta en la primera posicion, i.e. posicion cero del arraylist
            indexmax = 0;
            // recorremos el arraylist
            for (int i = 0; i < numUnsorted; i++) {
                // validamos si el valor en la iesima posicion es mayor al valor en la posicion indexmax
                if (listaaordenar.get(indexmax)<listaaordenar.get(i)) {
                    // cambiamos de valor el indexmax y lo colocamos en la iesima posicion
                    indexmax = i;
                }
            }
            // penultimo valor 
            int penultimo = listaaordenar.get(numUnsorted-1);
            // valor maximo
            int valormaximo = listaaordenar.get(indexmax);
            // movemos el valor maximo a la penultima posicion y el valor que estaba en esa posicion al lugar donde estaba el maximo de los no ordenados
            listaaordenar.set(indexmax, penultimo);
            listaaordenar.set(numUnsorted-1, valormaximo);
            // reducimos en 1 la cantidad de elementos no ordenados
            numUnsorted--;

        }

    }
}