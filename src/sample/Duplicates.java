package sample;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

class Duplicates {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		TreeSet<Integer> set = new TreeSet();
		for(int i=0;i<n;i++) {
			set.add(scan.nextInt());
		}
		System.out.println(n-set.size());
	}
}



