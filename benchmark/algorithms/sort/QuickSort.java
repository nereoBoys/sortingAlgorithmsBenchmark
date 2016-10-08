package benchmark.algorithms.sort;

public class QuickSort<T extends Comparable<T>> extends Sort<T> {
	
	 public void sort(T[] unsortedArray){				 
		 sort(unsortedArray, 0, unsortedArray.length-1);
	 }
	
    private void sort(T[] unsortedArray, int pMin, int pMax){
 
        if (pMin < pMax) {
            int min = pMin, max = pMax;
            T pivot = unsortedArray[(min + max) / 2];

            do {
                while (unsortedArray[min].compareTo(pivot) < 0) min++;
                while (pivot.compareTo(unsortedArray[max]) < 0) max--;

                if (min <= max) {
                    T tmp = unsortedArray[min];
                    unsortedArray[min] = unsortedArray[max];
                    unsortedArray[max] = tmp;
                    min++;
                    max--;
                }

            } while (min <= max);

            sort(unsortedArray, pMin, max);
            sort(unsortedArray, min, pMax);
        }
    }
    
}

