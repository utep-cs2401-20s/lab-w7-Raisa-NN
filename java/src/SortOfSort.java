public class SortOfSort {
    public void sort(int array[])
    { int count = 0;
    int begin = 0;
    int end = array.length;
    int max;
        // One by one move boundary of unsorted subarray
    while (begin < end) {

        // Find the maximum element in unsorted array
        max = findMax(array);

        // Swap the found maximum element with the last element
        int temp = max;
        max = array[array.length - 1 - count];
        array[array.length - 1 - count] = temp;
        count++;
        end--;
    }

            //After sorting the last 2 elements correctly (put to end), the next largest numbers are swapped to the beginning instead
            // Swap the found maximum element with the first element
//            if (count == 3)
//                temp = array[max];
//                array[max] = array[i+i];
//                array[i+i] = temp;
//                count = 0;

    public int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
         return max;
    }
    // Prints the array
    public void printArray(int array[])
    {
        for (int i=0; i<array.length; ++i)
            System.out.print(array[i]+" ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[])
    {
        SortOfSort ob = new SortOfSort();
        int array[] = {2,7,1,3,0,9,6,5};
        ob.sort(array);
        System.out.println("Sorted array");
        ob.printArray(array);
    }
}