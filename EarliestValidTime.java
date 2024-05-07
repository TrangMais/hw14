package be6_week15;

import java.util.Arrays;
import java.util.Scanner;

public class EarliestValidTime {
	public static void main(String[] args) {
		System.out.println("Please enter six digits from range[0; 9]: ");
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, E, F;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		E = sc.nextInt();
		F = sc.nextInt();

		System.out.println("The earliest valid time: ");
		System.out.println(solution(A, B, C, D, E, F));
		sc.close();
	}

	// Time Complexity = O(nlogn)
	public static String solution(int A, int B, int C, int D, int E, int F) {
		int[] time = { A, B, C, D, E, F };

		Arrays.sort(time);
		// start with second
		if (time[4] < 6) {
			if (time[0] * 10 + time[1] < 24) {
				return "" + time[0] + time[1] + ":" + time[2] + time[3] + ":" + time[4] + time[5];
			} else {
				return "impossible";
			}
		} else if (time[3] < 6) {
			if (time[0] * 10 + time[1] < 24) {
				return "" + time[0] + time[1] + ":" + time[2] + time[4] + ":" + time[3] + time[5];
			} else {
				return "impossible";
			}
		} else if (time[2] < 6) {
			if (time[0] * 10 + time[3] < 24) {
				return "" + time[0] + time[3] + ":" + time[1] + time[4] + ":" + time[2] + time[5];
			} else {
				return "impossible";
			}
		} else {
			return "impossible";
		}
	}

}
