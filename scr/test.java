package scr;

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
        Integer a[] = actual.toArray(new Integer[actual.size()]); 
        assertArrayEquals2(expected1, a);
	}

    private void assertArrayEquals2(int[] expected1, Integer[] a) {
    }

    @Test
	public void GnomeTest(){
        ArrayList<Integer> actual = new ArrayList<>(Arrays.asList(5, 1, 6, 2, 3, 4));
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        GnomeSort.gnomeSort(actual);
        Integer a[] = actual.toArray(new Integer[actual.size()]); 
        assertArrayEquals2(expected, a);
	}

    @Test
	public void QuickTest(){
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        QuickSort.quickSort(actual, 0, actual.length -1, new ComparadorEnteros<Integer>());
        assertArrayEquals(expected, actual);
    }

    @Test
	public void RadixTest(){
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        RadixSort.radixSort(actual);
        assertArrayEquals(expected, actual);
    }
}
