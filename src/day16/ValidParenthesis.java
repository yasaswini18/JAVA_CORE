package day16;
import java.util.Scanner;
import java.util.Stack;
public class ValidParenthesis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(isValid(s));
		sc.close();
	}
	public static boolean isValid(String s) {
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(') {
				st.push(s.charAt(i));
			}else {
				if(st.empty()) return false;
				
				char top = st.pop();
				if(s.charAt(i)== '[' && top!=']') return false;
				if(s.charAt(i)== '{' && top!='}') return false;
				if(s.charAt(i)=='(' && top!=')') return false;
		
				}
		}
		return st.empty();
	}
}
