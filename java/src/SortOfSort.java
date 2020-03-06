public class SortOfSort {
    public static void sortOfSort(int array[]) {//Static, so don't need to instantiate new object in tester
        int i;
        int index = 0;
        int count = 0;
        int begin = 0;
        int end = array.length-1;

        while (begin != end) {
            int max = array[begin];

            //Find maximum element
            for (i = begin; i <= end; i++)
                if (array[i] >= max) {
                    max = array[i]; //biggest number
                    index = i; //index of biggest number
                }

            if (count < 2) { //If count<2, add elements to tail of array

                // Swap the found maximum element with the last element
                int temp = array[index];
                array[index] = array[end];
                array[end] = temp;
                count++;
                end = end - 1;//unsorted array decreases by 1 at the end
            }
            else {
                // Swap the found maximum element with the first element for next 2 iterations after completing 2 iterations
                int temp = array[index];
                array[index] = array[begin];
                array[begin] = temp;
                begin = begin + 1;//unsorted array decreases by 1 at the beginning
                count++;
            }

            if (count == 4) { //After adding 2 elements to the head, reset counts to 0 so max element can be attached to tail of array
                count = 0;
            }

        }//While loop to iterate entire process closes
    }

    // Prints the array
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String[] args) {
        int array[] = {2, 7, 1, 3, 0, 9, 6, 5};
        sortOfSort(array);
        System.out.println("Sorted array");
        printArray(array);
    }
}