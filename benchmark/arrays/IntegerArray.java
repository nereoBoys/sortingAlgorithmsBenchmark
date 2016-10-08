package benchmark.arrays;

import java.util.Random;

public class IntegerArray {	
	
	public Integer[] createAscendingOrderArray(int size){
		Integer[] integerArray = new Integer[size];
		for	(int index = 0; index < size; index++){
			integerArray[index] = index+1;	
		}	
		return integerArray;
	}

	public Integer[] createDescendingOrderArray(int size) {
		Integer[] integerArray = new Integer[size];
		for	(int index = 0; index < size; index++){
			integerArray[index] = size-index;	
		}	
		return integerArray;
	}
	
	public Integer[] createDisorderedArray(int size){
		Integer[] integerArray = new Integer[size];
		Random randomInt = new Random();
		for( int index = 0 ; index < size ; index++ ){
			integerArray[index] = randomInt.nextInt(1000);	
		}	
		return integerArray;
	}
}
