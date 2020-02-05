import java.util.Random;

public class StringUtils {

	static String[] generateRandomAlphanumericStrings(int stringSize, int arraySize) {
		int leftLimit = 48; // numeral '0'
		int rightLimit = 122; // letter 'z'
		String[] array = new String[arraySize];

		for (int i = 0; i < array.length; i++) {
			Random random = new Random();
			array[i] = random.ints(leftLimit, rightLimit + 1).filter(s -> (s <= 57 || s >= 65) && (s <= 90 || s >= 97))
					.limit(stringSize)
					.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		}
		return array;
	}

	static String[] generateRandomAlphabeticStrings(int stringSize, int arraySize) {
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		String[] array = new String[arraySize];

		for (int i = 0; i < array.length; i++) {
			Random random = new Random();
			array[i] = random.ints(leftLimit, rightLimit + 1).limit(stringSize)
					.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

		}
		return array;
	}
}
