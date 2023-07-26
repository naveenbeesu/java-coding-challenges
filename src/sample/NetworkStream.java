package sample;

import java.math.BigInteger;
import java.util.Scanner;

class NetworkStream {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		int N = scan.nextInt();
//		int[] A = new int[N];
//		for(int i = 0;i<N;i++) {
//			A[i] = scan.nextInt();
//		}
		int[] A = { -6, -91, 1011, -100, 84, -22, 0, 1, 473 };
		int maxValue = solution(A);
		System.out.println(maxValue);
		int[] B = { -1, 1, 2, -2 };
		int minValue = solution2(B);
		System.out.println(minValue);
		int bitsCount = solution(3, 7);
		System.out.println(bitsCount);
	}

	public static int solution(int[] A) {
		int N = A.length;
		int[] max = new int[1];
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (A[i] % 3 == 0) {
				if (count == 0) {
					max[0] = A[i];
					count++;
				} else if (count > 0 && A[i] > max[0]) {
					max[0] = A[i];
				}
			}
		}
		return max[0];
	}

	public static int solution2(int[] A) {
		int N = A.length;
		int[] min = new int[1];
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (count == 0) {
				min[0] = A[i];
				count++;
			} else if (count > 0 && A[i] < min[0]) {
				min[0] = A[i];
			}
		}
		return min[0];
	}

	public int solution(int A, int B) {
		BigInteger N = new BigInteger("" + A * B);
		return N.bitCount();
	}
}
