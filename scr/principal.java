package scr;

/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.awt.Component;
import java.io.*;*/
import java.util.ArrayList;
import java.util.Scanner;

//import javax.swing.JOptionPane;


public class principal {
    public static void main(String[] args) {
        int numero;
        Scanner in = new Scanner(System.in);
        
        //String numCadena;   
        //ArrayList<String> lec = new ArrayList<String>();
        ArrayList<Integer> numeros = new ArrayList<Integer>(); /* 3000 */
        ArrayList<Integer> numeros2 = new ArrayList<Integer>(); /* 10 */
        ArrayList<Integer> numeros3 = new ArrayList<Integer>(); /* 100 */
        ArrayList<Integer> numeros4 = new ArrayList<Integer>(); /* 1000 */
        
        for (int a = 1; a <= 10; a++) {
            numero = (int) (Math.random() * 18500 + 1);
            //numCadena = numero+"";
            if (numeros2.contains(numero - 1)) {
                a--;
            } else {
                numeros2.add(numero);
            }
        }
        for (int b = 1; b <= 100; b++) {
            numero = (int) (Math.random() * 18500 + 1);
            //numCadena = numero+"";
            if (numeros3.contains(numero - 1)) {
                b--;
            } else {
                numeros3.add(numero);
            }
        }
        for (int c = 1; c <= 1000; c++) {
            numero = (int) (Math.random() * 18500 + 1);
            //numCadena = numero+"";
            if (numeros4.contains(numero - 1)) {
                c--;
            } else {
                numeros4.add(numero);
            }
        }
        for (int i = 1; i <= 3000; i++) {
            numero = (int) (Math.random() * 18500 + 1);
            //numCadena = numero+"";
            if (numeros.contains(numero - 1)) {
                i--;
            } else {
                numeros.add(numero);
            }
        }

        //Comparación usando BubbleSort
		System.out.println("NUMEROS DESORDENADOS CANTIDAD 10");
		EscribirArrayList(numeros);
		System.out.println("ORDENANDO...");
        BubbleSort.bubbleSort(numeros);
		System.out.println("NUMEROS ORDENADOS");
		EscribirArrayList(numeros);
		
		System.out.println("Presione una tecla para continuar con quicksort");
		in.nextLine();

    /* private static String DELIMITADOR=";";  

        public void saveTxt() throws FileNotFoundException, IOException, ClassNotFoundException{
            OutputStream outputStream = new FileOutputStream("datos.txt");
            OutputStreamWriter fout = new OutputStreamWriter(outputStream);
            //FileOutputStream fout = new FileOutputStream("datos.txt");  
            for(int i=0;i<numeros.size();i++) {
                if(i==numeros.size()-1) {
                    fout.write(numeros.get(i));
                }
                else {
                    fout.write(numeros.get(i)+DELIMITADOR);
                }
            }
        }

        public void leerTxt() throws FileNotFoundException, IOException, ClassNotFoundException{
            FileReader fr = new FileReader("datos.txt");
            String fileText="";
        
            //Leemos byte a byte
            int i;
            while((i=fr.read()) != -1)
            {
                fileText+=(char)i;
            }
        
            //Separamos el string por el delimitador y sobrescribimos la lista
            lec = new ArrayList(fileText.split(DELIMITADOR));
        
        }*/
    }

    public static void EscribirArrayList(ArrayList<Integer> _items) {
        for (int i = 0; i < _items.size(); i++) {
            System.out.println("[" + i + "] => " + _items.get(i).toString());
        }
    }
    
    public static void EscribirArreglo(Integer[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + i + "] => " + arreglo[i]);
        }
    }

}

