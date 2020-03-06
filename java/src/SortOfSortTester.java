import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortOfSortTester {
    @Test
    public void sortOfSort1() {//Tests the general functionality of the program
        int[] A = {2, 7, 1, 3, 0, 9, 6, 5};
        int[] results = {6, 5, 1, 0, 2, 3, 7, 9};
        SortOfSort.sortOfSort(A);
        assertArrayEquals(results, A);
    }
    @Test
    public void sortOfSort2() { //Tests the functionality of the program when challenged with negative numbers
        int[] A = {2, -1, 1, -3, 0, 9, -65, 5};
        int[] results = {2, 1, -3, -65, -1, 0, 5, 9};
        SortOfSort.sortOfSort(A);
        assertArrayEquals(results, A);
    }
    @Test
    public void sortOfSort3() { //Tests the functionality of the program when challenged with duplicates
        int[] A = {9, 7, 1, 3, 7, 9, 6, 6};
        int[] results = {7, 7, 3, 1, 6, 6, 9, 9};
        SortOfSort.sortOfSort(A);
        assertArrayEquals(results, A);
    }
    @Test
    public void sortOfSort4() { //Tests the functionality of the program when challenged with a long array
        int[] A = {2, 7, 1, 3, 0, 9, 6, 5, 4, 8, 8};
        int[] results = {8, 7, 4, 3, 0, 1, 2, 5, 6, 8, 9};
        SortOfSort.sortOfSort(A);
        assertArrayEquals(results, A);
    }
    @Test
    public void sortOfSort5() { //Tests the functionality of the program when challenged with an array of length 1
        int[] A = {0};
        int[] results = {0};
        SortOfSort.sortOfSort(A);
        assertArrayEquals(results, A);
    }
}
