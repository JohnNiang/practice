package utils;

public class ArrayUtils {

	private ArrayUtils() {
	}

	public static void print(int[] data) {
		if (data == null) {
			return;
		}

		for (int i = 0; i < data.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(data[i]);
		}
		System.out.println();
	}
}
