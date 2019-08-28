package chapter3;

import java.util.Scanner;

/**
 * Callatz conjecture.
 * 
 * @author johnniang
 * @date Aug 28, 2019
 *
 */
public class Callatz {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int step = 0;
			while (n > 1) {
				if (n % 2 == 0) {
					n /= 2;
				} else {
					n = (3 * n + 1) / 2;
				}
				step++;
			}

			System.out.println(step);
		}
	}

}
