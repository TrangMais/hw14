package be6_week15;

public class ImprovedLargestDistance {
	public static void main(String[] args) {
		int[] A = {4, 6, 2, 2, 6, 6, 4};

		System.out.println("The largest distance is " + originalSolution(A));
		System.out.println("The largest distance is " + upgradedSolution(A));
	}

	public static int originalSolution(int[] A) {
		int N = A.length;
		int result = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				if (A[i] != A[j]) {
					result = Math.max(result, j - i);
				}
			}
		}
		return result;
	}

	// Time Complexity O(N) and Space Complexity O(1)
	public static int upgradedSolution(int[] A) {
		int maximumDistance = 0;

		for (int i = 0; i < A.length; ++i)
			if (A[i] != A[A.length - 1] || A[0] != A[A.length - 1 - i]) {
				maximumDistance = A.length - i - 1;
				break;
			}
		return maximumDistance;
	}
}
