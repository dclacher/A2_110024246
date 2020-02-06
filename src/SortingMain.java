import java.util.Arrays;
import sorting.Sort;
import sorting.RadixSort;

public class SortingMain {

	public static void main(String[] args) {
		
		/*
		 * Task 2: sortingType: 
		 * 1 = Merge sort, 2 = Quick sort, 3 = Heap sort, 4 = Dual-Pivot Quick sort (Java 8)
		 */
		System.out.println("Ignore first execution! " + executeSortingForNumbers(1));
		System.out.println("[MERGESORT] Numbers: " + executeSortingForNumbers(1));
		System.out.println("[QUICKSORT] Numbers: " + executeSortingForNumbers(2));
		System.out.println("[HEAPSORT] Numbers: " + executeSortingForNumbers(3));
		System.out.println("[DUAL-PIVOT QUICKSORT] Numbers: " + executeSortingForNumbers(4));

		/*
		 * Task 3: sortingType: 
		 * 1 = Merge sort, 2 = Quick sort, 3 = Heap sort, 4 = Dual-Pivot Quick sort (Java 8), 5 = Radix sort
		 */
		System.out.println("[MERGESORT] Strings: Length = 4: " + executeSortingForStrings(1, 4));
		System.out.println("[MERGESORT] Strings: Length = 6: " + executeSortingForStrings(1, 6));
		System.out.println("[MERGESORT] Strings: Length = 8: " + executeSortingForStrings(1, 8));
		System.out.println("[MERGESORT] Strings: Length = 10: " + executeSortingForStrings(1, 10));
		System.out.println("[QUICKSORT] Strings: Length = 4: " + executeSortingForStrings(2, 4));
		System.out.println("[QUICKSORT] Strings: Length = 6: " + executeSortingForStrings(2, 6));
		System.out.println("[QUICKSORT] Strings: Length = 8: " + executeSortingForStrings(2, 8));
		System.out.println("[QUICKSORT] Strings: Length = 10: " + executeSortingForStrings(2, 10));
		System.out.println("[HEAPSORT] Strings: Length = 4: " + executeSortingForStrings(3, 4));
		System.out.println("[HEAPSORT] Strings: Length = 6: " + executeSortingForStrings(3, 6));
		System.out.println("[HEAPSORT] Strings: Length = 8: " + executeSortingForStrings(3, 8));
		System.out.println("[HEAPSORT] Strings: Length = 10: " + executeSortingForStrings(3, 10));
		System.out.println("[DUAL-PIVOT QUICKSORT] Strings: Length = 4: " + executeSortingForStrings(4, 4));
		System.out.println("[DUAL-PIVOT QUICKSORT] Strings: Length = 6: " + executeSortingForStrings(4, 6));
		System.out.println("[DUAL-PIVOT QUICKSORT] Strings: Length = 8: " + executeSortingForStrings(4, 8));
		System.out.println("[DUAL-PIVOT QUICKSORT] Strings: Length = 10: " + executeSortingForStrings(4, 10));
		System.out.println("[RADIXSORT] Strings: Length = 4: " + executeSortingForStrings(5, 4));
		System.out.println("[RADIXSORT] Strings: Length = 6: " + executeSortingForStrings(5, 6));
		System.out.println("[RADIXSORT] Strings: Length = 8: " + executeSortingForStrings(5, 8));
		System.out.println("[RADIXSORT] Strings: Length = 10: " + executeSortingForStrings(5, 10));
	}

	/**
	 * This is the main method for task #3
	 * @param sortingType
	 * @return the average time spent for sorting, in nanoseconds
	 */
	private static long executeSortingForStrings(int sortingType, int stringSize) {
		long totalElapsedTime = 0L;
		
		// Repeat 10 times
		for (int i = 0; i < 10; i++) {
			long startTime = 0L;
			
			// Create 100,000 random strings of length <stringSize>
			String[] stringsToSort = StringUtils.generateRandomAlphanumericStrings(stringSize, 100000);

			// Sort the keys
			switch (sortingType) {
			case 1:
				startTime = System.nanoTime();
				Sort.mergeSort(stringsToSort);
				break;
			case 2:
				startTime = System.nanoTime();
				Sort.quicksort(stringsToSort);
				break;
			case 3:
				startTime = System.nanoTime();
				Sort.heapsort(stringsToSort);
				break;
			case 4:
				startTime = System.nanoTime();
				Arrays.sort(stringsToSort);
				break;
			case 5:
				startTime = System.nanoTime();
				RadixSort.radixSortA(stringsToSort, stringSize);
				break;
			default:
				System.out.println("Invalid type.");
				break;
			}
			
			long elapsedTime = System.nanoTime() - startTime;
			//System.out.println("Elapsed time: " + elapsedTime);
			totalElapsedTime += elapsedTime;
		}
		// Compute the average CPU time that takes to sort the keys
		return totalElapsedTime / 10;
	}

	/**
	 * This is the main method for task #2
	 * @param sortingType
	 * @return the average time spent for sorting, in nanoseconds
	 */
	private static long executeSortingForNumbers(int sortingType) {
		long totalElapsedTime = 0L;
		
		// Repeat the sorting 100 times
		for (int i = 0; i < 100; i++) {
			long startTime = 0L;
			
			// Create 100,000 random keys (of type long)
			Long[] numbersToSort = NumberUtils.generateUnboundedNumbers(100000);

			// Sort the keys
			switch (sortingType) {
			case 1:
				startTime = System.nanoTime();
				Sort.mergeSort(numbersToSort);
				break;
			case 2:
				startTime = System.nanoTime();
				Sort.quicksort(numbersToSort);
				break;
			case 3:
				startTime = System.nanoTime();
				Sort.heapsort(numbersToSort);
				break;
			case 4:
				startTime = System.nanoTime();
				Arrays.sort(numbersToSort);
				break;
			default:
				System.out.println("Invalid type.");
				break;
			}
			
			long elapsedTime = System.nanoTime() - startTime;
			//System.out.println("Elapsed time: " + elapsedTime);
			totalElapsedTime += elapsedTime;
		}
		// Compute the average CPU time taken to sort the keys
		return totalElapsedTime / 100;
	}
}
