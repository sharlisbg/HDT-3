package scr;

/*
 * @author: Ejercicio en clase MAAG y Sharis Barrios
 */

/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.awt.Component;
import java.io.*;*/
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.List;

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
        int [] numeros5 = new int[10]; /* 10 */
        int [] numeros6 = new int[100]; /* 10 */
        int [] numeros7 = new int[1000]; /* 10 */
        int [] numeros8 = new int[3000]; /* 10 */

        for (int a = 0; a <= 9; a++) {
            numero = (int) (Math.random() * 18500 + 1);
            numeros5[a] = numero;
        }

        for (int a = 0; a <= 99; a++) {
            numero = (int) (Math.random() * 18500 + 1);
            numeros6[a] = numero;
        }

        for (int a = 0; a <= 999; a++) {
            numero = (int) (Math.random() * 18500 + 1);
            numeros7[a] = numero;
        }

        for (int a = 0; a <= 2999; a++) {
            numero = (int) (Math.random() * 18500 + 1);
            numeros8[a] = numero;
        }
        
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
		EscribirArrayList(numeros2);
		System.out.println("ORDENANDO...");
        BubbleSort.bubbleSort(numeros2);
		System.out.println("NUMEROS ORDENADOS");
		EscribirArrayList(numeros2);

        System.out.println("Presione una tecla para continuar BubbleSort 100");
		in.nextLine();
		System.out.println("NUMEROS DESORDENADOS CANTIDAD 100");
		EscribirArrayList(numeros3);
		System.out.println("ORDENANDO...");
        BubbleSort.bubbleSort(numeros3);
		System.out.println("NUMEROS ORDENADOS");
		EscribirArrayList(numeros3);

		System.out.println("Presione una tecla para continuar BubbleSort 1000");
		in.nextLine();
		System.out.println("NUMEROS DESORDENADOS CANTIDAD 1000");
		EscribirArrayList(numeros4);
		System.out.println("ORDENANDO...");
        BubbleSort.bubbleSort(numeros4);
		System.out.println("NUMEROS ORDENADOS");
		EscribirArrayList(numeros4);
        
        System.out.println("Presione una tecla para continuar BubbleSort 3000");
		in.nextLine();
		System.out.println("NUMEROS DESORDENADOS CANTIDAD 3000");
		EscribirArrayList(numeros);
		System.out.println("ORDENANDO...");
        BubbleSort.bubbleSort(numeros);
		System.out.println("NUMEROS ORDENADOS");
		EscribirArrayList(numeros);

        System.out.println("Presione una tecla para continuar con GnomeSort");
		in.nextLine();




        
        //Comparación usando GnomeSort
		System.out.println("NUMEROS DESORDENADOS CANTIDAD 10");
		EscribirArrayList(numeros2);
		System.out.println("ORDENANDO...");
        GnomeSort.gnomeSort(numeros2);
		System.out.println("NUMEROS ORDENADOS");
		EscribirArrayList(numeros2);

        System.out.println("Presione una tecla para continuar GnomeSort 100");
		in.nextLine();
		System.out.println("NUMEROS DESORDENADOS CANTIDAD 100");
		EscribirArrayList(numeros3);
		System.out.println("ORDENANDO...");
        GnomeSort.gnomeSort(numeros3);
		System.out.println("NUMEROS ORDENADOS");
		EscribirArrayList(numeros3);

		System.out.println("Presione una tecla para continuar GnomeSort 1000");
		in.nextLine();
		System.out.println("NUMEROS DESORDENADOS CANTIDAD 1000");
		EscribirArrayList(numeros4);
		System.out.println("ORDENANDO...");
        GnomeSort.gnomeSort(numeros4);
		System.out.println("NUMEROS ORDENADOS");
		EscribirArrayList(numeros4);
        
        System.out.println("Presione una tecla para continuar GnomeSort 3000");
		in.nextLine();
		System.out.println("NUMEROS DESORDENADOS CANTIDAD 3000");
		EscribirArrayList(numeros);
		System.out.println("ORDENANDO...");
        GnomeSort.gnomeSort(numeros);
		System.out.println("NUMEROS ORDENADOS");
		EscribirArrayList(numeros);

        System.out.println("Presione una tecla para continuar con QuickSort");
		in.nextLine();




         //Comparación usando QuickSort
		System.out.println("NUMEROS DESORDENADOS CANTIDAD 10");
		EscribirArreglo(numeros5);
		System.out.println("ORDENANDO...");
        QuickSort.quickSort(numeros5, 0, numeros5.length-1, new ComparadorEnteros<Integer>());
		System.out.println("NUMEROS ORDENADOS");
		EscribirArreglo(numeros5);

        System.out.println("Presione una tecla para continuar QuickSort 100");
		in.nextLine();
		System.out.println("NUMEROS DESORDENADOS CANTIDAD 100");
		EscribirArreglo(numeros6);
		System.out.println("ORDENANDO...");
        QuickSort.quickSort(numeros6, 0, numeros6.length-1, new ComparadorEnteros<Integer>());
		System.out.println("NUMEROS ORDENADOS");
		EscribirArreglo(numeros6);

		System.out.println("Presione una tecla para continuar QuickSort 1000");
		in.nextLine();
		System.out.println("NUMEROS DESORDENADOS CANTIDAD 1000");
		EscribirArreglo(numeros7);
		System.out.println("ORDENANDO...");
        QuickSort.quickSort(numeros7, 0, numeros7.length-1, new ComparadorEnteros<Integer>());
		System.out.println("NUMEROS ORDENADOS");
		EscribirArreglo(numeros7);
        
        System.out.println("Presione una tecla para continuar QuickSort 3000");
		in.nextLine();
		System.out.println("NUMEROS DESORDENADOS CANTIDAD 3000");
		EscribirArreglo(numeros8);
		System.out.println("ORDENANDO...");
        QuickSort.quickSort(numeros8, 0, numeros8.length-1, new ComparadorEnteros<Integer>());
		System.out.println("NUMEROS ORDENADOS");
		EscribirArreglo(numeros8);


        System.out.println("Presione una tecla para continuar con MergeSort");
		in.nextLine();



        //Comparación usando MergeSort
		System.out.println("NUMEROS DESORDENADOS CANTIDAD 10");
		EscribirArreglo(numeros5);
		System.out.println("ORDENANDO...");
        MergeSort.mergeSort(numeros5, numeros5.length);
		System.out.println("NUMEROS ORDENADOS");
		EscribirArreglo(numeros5);

        System.out.println("Presione una tecla para continuar MergeSort 100");
		in.nextLine();
		System.out.println("NUMEROS DESORDENADOS CANTIDAD 100");
		EscribirArreglo(numeros6);
		System.out.println("ORDENANDO...");
        MergeSort.mergeSort(numeros6, numeros6.length);
		System.out.println("NUMEROS ORDENADOS");
		EscribirArreglo(numeros6);

		System.out.println("Presione una tecla para continuar MergeSort 1000");
		in.nextLine();
		System.out.println("NUMEROS DESORDENADOS CANTIDAD 1000");
		EscribirArreglo(numeros7);
		System.out.println("ORDENANDO...");
        MergeSort.mergeSort(numeros7, numeros7.length);
		System.out.println("NUMEROS ORDENADOS");
		EscribirArreglo(numeros7);
        
        System.out.println("Presione una tecla para continuar MergeSort 3000");
		in.nextLine();
		System.out.println("NUMEROS DESORDENADOS CANTIDAD 3000");
		EscribirArreglo(numeros8);
		System.out.println("ORDENANDO...");
        MergeSort.mergeSort(numeros8, numeros8.length);
		System.out.println("NUMEROS ORDENADOS");
		EscribirArreglo(numeros8);


        System.out.println("Presione una tecla para continuar con SelectionSort");
		in.nextLine();



        //Comparación usando SelectionSort
		System.out.println("NUMEROS DESORDENADOS CANTIDAD 10");
		EscribirArrayList(numeros2);
		System.out.println("ORDENANDO...");
        SelectionSort.selectionSort(numeros2);
		System.out.println("NUMEROS ORDENADOS");
		EscribirArrayList(numeros2);

        System.out.println("Presione una tecla para continuar SelectionSort 100");
		in.nextLine();
		System.out.println("NUMEROS DESORDENADOS CANTIDAD 100");
		EscribirArrayList(numeros3);
		System.out.println("ORDENANDO...");
        SelectionSort.selectionSort(numeros3);
		System.out.println("NUMEROS ORDENADOS");
		EscribirArrayList(numeros3);

		System.out.println("Presione una tecla para continuar SelectionSort 1000");
		in.nextLine();
		System.out.println("NUMEROS DESORDENADOS CANTIDAD 1000");
		EscribirArrayList(numeros4);
		System.out.println("ORDENANDO...");
        SelectionSort.selectionSort(numeros4);
		System.out.println("NUMEROS ORDENADOS");
		EscribirArrayList(numeros4);
        
        System.out.println("Presione una tecla para continuar SelectionSort 3000");
		in.nextLine();
		System.out.println("NUMEROS DESORDENADOS CANTIDAD 3000");
		EscribirArrayList(numeros);
		System.out.println("ORDENANDO...");
        SelectionSort.selectionSort(numeros);
		System.out.println("NUMEROS ORDENADOS");
		EscribirArrayList(numeros);



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
    
    public static void EscribirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + i + "] => " + arreglo[i]);
        }
    }

}

