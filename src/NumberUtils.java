import java.util.Random;

public class NumberUtils {

	static Long[] generateUnboundedNumbers(int arraySize) {
		Long[] array = new Long[arraySize];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextLong();
			//System.out.println("Generated unbounded number is: " + array[i]);
		}
		return array;
	}

	static Long[] generateBoundedNumbers(int arraySize) {
		Long[] array = new Long[arraySize];
		long leftLimit = 1L;
		long rightLimit = 100000L;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
			//System.out.println("Generated bounded number is: " + array[i]);
		}
		
		return array;
	}
}
