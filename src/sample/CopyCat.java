package sample;

import java.util.Scanner;

class CopyCat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int N = scan.nextInt();
		int X = N/2;
		int count=0;
		while(N>=1) {
			N = N/X;
			N = N-1;
			count++;
		}
		System.out.println(count);
	} 
}