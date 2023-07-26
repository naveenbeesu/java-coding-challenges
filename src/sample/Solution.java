package sample;

import java.util.Scanner;

class Test {
	protected int x, y;
}

class Solution {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = 1;
		int b = 1;
		int fib = 0;
		for(int i = 1;i<=n;i++) {
			if(i == 1) {
				fib = a;
			} if(i == 2) {
				fib = b;
			} if(i==3) {
				fib = a + b;
			} else {
				a = fib;
				fib = fib + b;
				b = a;
			}
		}
		System.out.println(fib);
		System.out.println(calculateFibanocci(n));
	}
	static int calculateFibanocci(int n) {
		if(n<=0) {
			return 0;
		}if(n<=1) {
			return 1;
		}
		return calculateFibanocci(n-1) + calculateFibanocci(n-2);		
	}
}



