package scr;
import java.util.ArrayList;


/**
 * GnomeSort es la clase que imolementa el algoritmo de GnomeSort para ordenar un arraylist de enteros
 * @author Leonel Contreras 18797
 * obtenido desde https://www.geeksforgeeks.org/java-program-for-gnome-sort/ 
 * @version 2.0
 */

public class GnomeSort {
    /** gnomeSort es un metodo que implementa el algoritmo de gnome sort para ordenar un arraylist de enteros
     * Se declara static para poder utilizarlo sin necesidad de crear una instancia de la clase
     * @param listaaordenar es el arraylist de enteros que se desea ordenar
     */
    public static void gnomeSort(ArrayList<Integer> listaaordenar)
        {
        int index = 0;
        int n = listaaordenar.size();
        int temp;
        
        // realizamos el procedimiento mientras el indice sea menor al tamano del array
        while (index < n) {
            // validamos si el indice es igual a cero
            if (index == 0){
                // agregamos en uno el indice
                index++;
            }

            // validamos si el valor en la posicion actual es mayor al valor en la posicion antecesora
            if (listaaordenar.get(index)>= listaaordenar.get(index-1)){
                // nos movemos una posicion hacia adelante
                index++;
            }else {
                // asignamos a una variable temporal el valor de la posicion actual
                temp = listaaordenar.get(index);  
                // colocamos en la posicion actual el valor en la posicion anterior       
                listaaordenar.set(index,listaaordenar.get(index-1));
                // movemos, a la posicion anterior, el valor menor
                listaaordenar.set(index-1, temp);            
                // restamos en uno el indice
                index--;
            }
        }
        //return;
        }

}
