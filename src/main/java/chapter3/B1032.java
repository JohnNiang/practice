package chapter3;

import java.io.IOException;
import java.util.Scanner;

/**
 * B1032: 挖掘机技术哪家强
 * 
 * @author johnniang
 * @date Aug 28, 2019
 *
 */
public class B1032 {

	public static void main(String[] args) throws IOException {
		int[] stat = new int[100000];
		try (Scanner sc = new Scanner(System.in)) {
			int N = Integer.valueOf(sc.next());
			int maxNo = 0, maxScore = -1;
			for (int i = 0; i < N; i++) {
				int no = Integer.valueOf(sc.next());
				int score = Integer.valueOf(sc.next());

				stat[no] += score;

				if (stat[no] > maxScore) {
					maxNo = no;
					maxScore = stat[no];
				}
			}
			System.out.println(maxNo + " " + maxScore);
		}
	}
}
