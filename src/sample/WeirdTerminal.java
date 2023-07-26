package sample;

import java.util.Arrays;
import java.util.Scanner;

class WeirdTerminal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String[] str = str1.split(" ");
		System.out.println(str.length/2);
	}
}



