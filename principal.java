import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class principal {
    int numero;
    String numCadena;   
    ArrayList<String> lec = new ArrayList<String>();
    ArrayList<String> numeros = new ArrayList<String>();
    for (int i = 1; i <= 3000; i++) {
        numero = (int) (Math.random() * 18500 + 1);
        numCadena = numero+"";
        if (numeros.contains(numCadena)) {
            i--;
        } else {
            numeros.add(numCadena);
        }
    }

    private static String DELIMITADOR=";";  

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
    
    }

}

