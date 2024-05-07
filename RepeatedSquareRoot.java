package be6_week15;

public class RepeatedSquareRoot {
	public static int solution(int A, int B) {
		if (A > B) {
			return 0;
		}
		int sqrtA = (int) (Math.ceil(Math.sqrt(A)));
		int sqrtB = (int) (Math.floor(Math.sqrt(B)));
		if (sqrtA > sqrtB) {
			return 0;
		}
		return 1 + solution(sqrtA, sqrtB);
	}

	public static void main(String[] args) {
		System.out.println("The repeated square root is: ");
		System.out.println(solution(10, 20));
		System.out.println(solution(6000, 7000));
		System.out.println(solution(2, 1000000000));
	}
}
