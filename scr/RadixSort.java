package scr;

import java.util.Vector;

/**
 * @author Obtenido del Libro Java Structures, Duane A. Bailey
 * @version 1.0
 */

public class RadixSort {

    
    /** 
     * @param n
     * @param d
     * @return int
     */
    public static int digit(int n, int d)
        // pre: n >= 0 and d >= 0
        // post: returns the value of the dth decimal place of n
        // where the units place has position 0
        {
        if (d == 0) return n % 10;
        else return digit(n/10,d-1);
        }

    
    public static void radixSort(int data[])
        // pre: data is array of values; each is less than 1,000,000
        // post: data in the array are sorted into increasing order
        {
        for (int i = 0; i < 6; i++)
        {
        bucketPass(data,i);
        }
        }


    public static void bucketPass(int data[], int d)
        // pre: data is an array of data values, and d >= 0
        // post: data is sorted by the digit found in location d;
        // if two values have the same digit in location d, their
        // relative positions do not change; i.e., they are not swapped
        {
        int i,j;
        int value;
        // allocate some buckets
        Vector<Vector<Integer>> bucket = new Vector<Vector<Integer>>(10);
        bucket.setSize(10);
        // allocate Vectors to hold values in each bucket
        for (j = 0; j < 10; j++) bucket.set(j,new Vector<Integer>());
        // distribute the data among buckets
        int n = data.length;
        
        for (i = 0; i < n; i++) {
            value = data[i];
            // determine the d'th digit of value
            j = digit(value,d);
            // add data value to end of vector; keeps values in order
            bucket.get(j).add(value);
        }
        // collect data from buckets back into array
        // collect in reverse order to unload Vectors
        // in linear time
        i = n;
        for (j = 9; j >= 0; j--)
        {
            // unload all values in bucket j
            while (!bucket.get(j).isEmpty())
            {
                i--;
                value = bucket.get(j).remove(j);
                data[i] = value;
            }
        }
    }
        
}
