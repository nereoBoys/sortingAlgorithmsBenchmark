package benchmark.algorithms.sort;

public class SelectionSort<T extends Comparable<T>> extends Sort<T> {
	
    public void selectionSort(T[] unsortedArray) {

        for(int sorted = 0; sorted < unsortedArray.length ; sorted++){
        	int minIndex = sorted;
        	T minElement = unsortedArray[minIndex];
        	
        	for( int index = sorted; index < unsortedArray.length ; index++){
        		  if(minElement.compareTo(unsortedArray[index]) > 0){
        			  minIndex = index;
        			  minElement = unsortedArray[index];
        		  }
        	}
        	if( unsortedArray[sorted]!= minElement){
        		T tmpElement = unsortedArray[minIndex];
        		unsortedArray[minIndex] = unsortedArray[sorted];
        		unsortedArray[sorted] = tmpElement;
        	}
        }
        
    }
    
}