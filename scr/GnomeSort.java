package scr;
import java.util.ArrayList;


/**
 * @author Leonel Contreras 18797
 * obtenido desde https://www.geeksforgeeks.org/java-program-for-gnome-sort/ 
 * @version 1.0
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
                index++;
            }

            if (listaaordenar.get(index)>= listaaordenar.get(index-1)){
                index++;
            }else {
            temp = listaaordenar.get(index);         
            listaaordenar.set(index,listaaordenar.get(index-1));
            listaaordenar.set(index-1, temp);            
            index--;
            }
        }
        //return;
        }

}
