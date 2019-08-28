package chapter2;

import utils.ArrayUtils;

public class BubbleSort {

	public static void bubbleSort(int[] data) {
		for (int i = 1; i < data.length; i++) {
			for (int j = 0; j < data.length - i; j++) {
				if (data[j] > data[j + 1]) {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] data = { 1, 3, 4, 2, 5 };
		System.out.println("Before bubble sorting:");
		ArrayUtils.print(data);
		bubbleSort(data);
		System.out.println("After:");
		ArrayUtils.print(data);
	}
}
