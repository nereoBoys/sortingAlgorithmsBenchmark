package benchmark.algorithms.sort;

public class BubbleSort<T extends Comparable<T>> extends Sort<T> {

    public void sort(T[] unsortedArray) {
    	
        for(int size = unsortedArray.length,indexSize = unsortedArray.length-1; size > 1 ; size-- , indexSize--){
            for(int index = 0; index < indexSize; index ++){
                if((unsortedArray[index]).compareTo(unsortedArray[index+1]) > 0){
                    T tmp = unsortedArray[index];
                    unsortedArray[index] = unsortedArray[index + 1];
                    unsortedArray[index + 1] = tmp;
                }                
            }
        }        
    }
       
}
