package atividadeSupervisionada9;

import java.util.Random;

public class Executor {
	public static void main(String[] args) {
		int[] array = new int[10000];
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 10000; j++) {
				Random randomGenerator = new Random();
				array[j] = randomGenerator.nextInt(10000);
			}
		}
		
		//System.out.println("BubbleSortv1: "+bubbleSortv1(array)+"x.");
		//System.out.println("BubbleSortv2: "+bubbleSortv2(array)+"x.");
		//System.out.println("SelectionSortv1: "+selectionSortv1(array)+"x.");
		System.out.println("SelectionSortv2: "+selectionSortv2(array)+"x.");
		//System.out.println("InsertionSort: "+insertionSort(array)+"x.");
		//System.out.println("MergeSort: "+mergeSort(array, array.length)+"x.");
	}
	
	public static int bubbleSortv1(int[] array) {
		int numOperations = 0, x;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 1; j < array.length; j++) {
				if(array[j-1] > array[j]) {
					x = array[j-1];
					array[j-1] = array[j];
					array[j] = x;
					numOperations += 3;
				}
			}
		}
		
		return numOperations;
	}
	
	public static int bubbleSortv2(int[] array) {
		int numOperations = 0, i = 0, x;
		boolean change = true;
		
		while (change) {
			change = false;
			for(int j = 1; j < (array.length-1); j++) {
				if(array[j-1] > array[j]) {
					x = array[j-1];
					array[j-1] = array[j];
					array[j] = x;
					change = true;
					numOperations += 3;
				}
			}
			i++;
		}
		
		return numOperations;
	}
	
	public static int selectionSortv1(int[] array) {
		int numOperations = 0, x, k;
		
		for(int i = 0; i < array.length; i++) {
			k = i;
			x = array[i];
			for(int j = 1; j < array.length; j++) {
				if(array[j] < x) {
					k = j;
					x = array[k];
					numOperations += 2;
				}
			}
			array[k] = array[i];
			array[i] = x;
		}
		
		return numOperations;
	}
	
	public static int selectionSortv2(int[] array) {
		int numOperations = 0, min, x;
		
		for(int i = 0; i < (array.length-1); i++) {
			min = i;
			for(int j = (i + 1); j < array.length; j++) {
				if(array[j] < array[min]) {
					min = j;
					//numOperations++;
				}
			}
			x = array[i];
			array[i] = array[min];
			array[min] = x;
			numOperations += 3;
		}
		
		return numOperations;
	}
	
	public static int insertionSort(int[] array) {
		int numOperations = 0, x, i;
		
		for(int j = 1; j < array.length; j++) {
			x = array[j];
			i = (j-1);
			while ((i >= 0) && (array[i] > x)) {
				array[i+1] = array[i--];
				numOperations++;
			}
			array[i+1] = x;
		}
		
		return numOperations;
	}
	
	public static int shellSort(int[] array) {
		
	}
	
	public static int mergeSort(int[] array, int n) {
		int numOperations = 0, middle;
		if(n < 2)
			return 1;
		middle = n / 2;
		int[] left = new int[middle];
		int[] right = new int[n - middle];
		
		for(int i = 0; i < middle; i++)
			left[i] = array[i];
		for(int i = middle; i < n; i++)
			right[i - middle] = array[i];
		
		mergeSort(array, middle);
		mergeSort(array, (n - middle));
		numOperations = merge(array, left, right, middle, (n - middle));
			
		return numOperations;
	}
	
	public static int merge(int[] array, int[] left, int[] right, int begin, int end) {
		int numOperations = 0;
		int i = 0, j = 0, k = 0;
		
		while (i < begin && j < end) {
			if(left[i] <= right[j]) {
				array[k++] = left[i++];
				numOperations++;
			} else {
				array[k++] = right[j++];
				numOperations++;
			}
		}
		
		while (i < begin) {
			array[k++] = left[i++];
			//numOperations++;
		}
		
		while (j < end) {
			array[k++] = right[j++];
			//numOperations++;
		}
		
		return numOperations;
	}
	
	public static int quickSort(int[] array) {
		
	}
}
