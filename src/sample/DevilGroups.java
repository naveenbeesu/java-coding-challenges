package sample;

import java.util.Scanner;

class DevilGroups {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] groups = str.split("[@$]");
		int max = 0;
		for(int i = 0;i<groups.length;i++) {
			if(groups[i].length()>max) {
				max = groups[i].length();
			}
		}
		System.out.println(max+1);
	}
}



