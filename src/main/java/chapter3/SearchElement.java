package chapter3;

import java.util.Scanner;

/**
 * Search element.
 * 
 * @author johnniang
 * @date Aug 28, 2019
 *
 */
public class SearchElement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] numbers = new int[n];
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = sc.nextInt();
			}

			int x = sc.nextInt();

			int i = 0;
			for (; i < numbers.length; i++) {
				if (numbers[i] == x) {
					break;
				}
			}
			if (i == numbers.length) {
				i = -1;
			}
			System.out.println(i);
		}
	}

}
