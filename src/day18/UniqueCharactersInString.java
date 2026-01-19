package day18;

import java.util.HashSet;

public class UniqueCharactersInString {
	public static void main(String[] args) {
		String s = "My name is Yasaswini";
		char arr[] = s.toCharArray();
		HashSet<Character> set = new HashSet<>();
		for(char ch : arr) {
			char c = Character.toLowerCase(ch);
			if(!Character.isWhitespace(c)) {
				set.add(c);
			}
		}
		System.out.println(set.size());
	}

}
