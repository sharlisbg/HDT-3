package src;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;


public class test {

    @Test
	public void MergeTest(){
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSort.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
	}

    @Test
	public void BubbleTest(){
        ArrayList<Integer> actual = new ArrayList<>(Arrays.asList(5, 1, 6, 2, 3, 4));
        int[] expected1 = { 1, 2, 3, 4, 5, 6 };
        BubbleSort.bubbleSort(actual);
        int[] actual2 = {};
        for ( int i = 1; i < actual.size(); i++ ){
            int num = actual.get(i);
            actual2[i]= num;
        }
        assertArrayEquals(expected1, actual2);
	}


    
}
