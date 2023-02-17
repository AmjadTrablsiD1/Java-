package mockexam;

public class QuickSort {

    private static boolean debug = true;
    private static void printDebug(Object message) {
        if (debug) {
            System.out.println(message);
        }
    }

    private static <T extends Comparable<T>> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static <T extends Comparable<T>> int partition(T[] array, int start, int end) {
        T pivot = array[end];
        int left = start;
        int right = end - 1;
        printDebug(String.format("Array:%s,Start:%d,End:%d,Pivot:%s",java.util.Arrays.toString(array), start, end, pivot.toString()));
       
       
        while (left < right) {
            while (array[left].compareTo(pivot) < 0 && left < end) {
                left++;
            }
            while (array[right].compareTo(pivot) >= 0 && right > start) {
                right--;
            }
            printDebug(String.format("left:%d,right:%d,Array:%s", left, right, java.util.Arrays.toString(array)));
            
            if (left < right) {
                printDebug(String.format("Swap:%s,%s", array[left].toString(), array[right].toString()));
                swap(array, left, right);
            }
        }
        if (array[left].compareTo(pivot) >= 0) {
            swap(array, left, end);
        }
        return left;
    }
        


    private static <T extends Comparable<T>> void quicksort(T[] array, int start, int end) {
        printDebug(String.format("+++start=%d,end=%d+++", start, end));
        if (start < end) {
            int middle = partition(array, start, end);
            quicksort(array, start, middle - 1);
            quicksort(array, middle + 1, end);
        }
    }

    public static <T extends Comparable<T>> void sort(T[] array) {
        printDebug("=========Starting sort=========");
        quicksort(array, 0, array.length - 1);
        printDebug("=========Finished sort=========");
    }
    
}
