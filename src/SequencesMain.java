import algorithmDesign.Sequences;

public class SequencesMain {

	public static void main(String[] args) {
		System.out.println("[EDIT DISTANCE] Length = 10: " + executeEditDistanceForStrings(10));
		System.out.println("[EDIT DISTANCE] Length = 20: " + executeEditDistanceForStrings(20));
		System.out.println("[EDIT DISTANCE] Length = 50: " + executeEditDistanceForStrings(50));
		System.out.println("[EDIT DISTANCE] Length = 100: " + executeEditDistanceForStrings(100));
		/*
		System.out.println("[EDIT DISTANCE] Length = 200: " + executeEditDistanceForStrings(200));
		System.out.println("[EDIT DISTANCE] Length = 300: " + executeEditDistanceForStrings(300));
		System.out.println("[EDIT DISTANCE] Length = 400: " + executeEditDistanceForStrings(400));
		System.out.println("[EDIT DISTANCE] Length = 500: " + executeEditDistanceForStrings(500));
		System.out.println("[EDIT DISTANCE] Length = 1000: " + executeEditDistanceForStrings(1000));
		*/
	}
	
	private static long executeEditDistanceForStrings(int wordSize) {
		long totalElapsedTime = 0L;
		
		// Generate 1,000 pairs of random words of lengths 10, 20, 50 and 100
		for (int i = 0; i < 1000; i++) {
			// Create pair of random words of size <wordSize>
			String[] stringsToProcess = StringUtils.generateRandomAlphabeticStrings(wordSize, 2);
			// Compute the edit distance for all words
			long startTime = System.nanoTime();
			Sequences.editDistance(stringsToProcess[0], stringsToProcess[1]);
			long elapsedTime = System.nanoTime() - startTime;
			totalElapsedTime += elapsedTime;
		}
		// Find the average CPU time for each pair.
		return totalElapsedTime / 1000;
	}
}
