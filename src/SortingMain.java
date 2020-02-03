import java.util.Arrays;

import sorting.*;

public class SortingMain {

	public static void main(String[] args) {
		System.out.println("[MERGESORT 1] Average elapsed time for 100 executions: " + executeMergesort());
		System.out.println("[MERGESORT 2] Average elapsed time for 100 executions: " + executeMergesort());
		System.out.println("[QUICKSORT] Average elapsed time for 100 executions: " + executeQuicksort());
		System.out.println("[HEAPSORT] Average elapsed time for 100 executions: " + executeHeapsort());
		System.out.println(
				"[DUAL-PIVOT QUICKSORT] Average elapsed time for 100 executions: " + executeDualPivotQuicksort());
	}

	private static long executeMergesort() {
		long totalElapsedTime = 0;
		for (int i = 0; i < 100; i++) {
			Long[] numbersToSort = NumberUtils.generateUnboundedNumbers(100000);
			long startTime = System.nanoTime();
			Sort.mergeSort(numbersToSort);
			long elapsedTime = System.nanoTime() - startTime;
			// System.out.println("Elapsed time: " + elapsedTime);
			totalElapsedTime += elapsedTime;
		}
		return totalElapsedTime / 100;
	}

	private static long executeQuicksort() {
		long totalElapsedTime = 0;
		for (int i = 0; i < 100; i++) {
			Long[] numbersToSort = NumberUtils.generateUnboundedNumbers(100000);
			long startTime = System.nanoTime();
			Sort.quicksort(numbersToSort);
			long elapsedTime = System.nanoTime() - startTime;
			// System.out.println("Elapsed time: " + elapsedTime);
			totalElapsedTime += elapsedTime;
		}
		return totalElapsedTime / 100;
	}

	private static long executeHeapsort() {
		long totalElapsedTime = 0;
		for (int i = 0; i < 100; i++) {
			Long[] numbersToSort = NumberUtils.generateUnboundedNumbers(100000);
			long startTime = System.nanoTime();
			Sort.heapsort(numbersToSort);
			long elapsedTime = System.nanoTime() - startTime;
			// System.out.println("Elapsed time: " + elapsedTime);
			totalElapsedTime += elapsedTime;
		}
		return totalElapsedTime / 100;
	}

	private static long executeDualPivotQuicksort() {
		long totalElapsedTime = 0;
		for (int i = 0; i < 100; i++) {
			Long[] numbersToSort = NumberUtils.generateUnboundedNumbers(100000);
			long startTime = System.nanoTime();
			Arrays.sort(numbersToSort);
			long elapsedTime = System.nanoTime() - startTime;
			// System.out.println("Elapsed time: " + elapsedTime);
			totalElapsedTime += elapsedTime;
		}
		return totalElapsedTime / 100;
	}
}
