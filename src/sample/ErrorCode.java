package sample;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

class ErrorCode {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(checkBalancedBraces(str));
	}

	public static String checkBalancedBraces(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '[' || c == '(' || c == '{') {
				stack.push(c);
			} else if (c == '}') {
				if (stack.isEmpty() || stack.pop() != '{') {
					return "error";
				}
			} else if (c == ']') {
				if (stack.isEmpty() || stack.pop() != '[') {
					return "error";
				}
			} else if (c == ')') {
				if (stack.isEmpty() || stack.pop() != '(') {
					return "error";
				}
			}
		}
		if(stack.isEmpty()) {
			return "correct";
		}
		return "error";
	}
}
