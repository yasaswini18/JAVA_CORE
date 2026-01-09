package day3;

/*
 * WAP to check the given character is
 * uppercase vowel
 * uppercase consonant
 * lowercase vowel
 * lowercase consonant
 * if the given character is uppercase vowel print numbers from 10 to 20 using dowhile loop
 * if the given character is lowercase vowel print numbers from -10 to -20 using while loop
 * if the given character is uppercase consonant print numbers from 25 to 15 using for loop
 * if the given character is lowercase consonant print numbers from -25 to -15 using for loop
 * 
 */

import java.util.Scanner;
public class Loops {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
//		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
//		{
//			int i = 10;
//			do {
//				System.out.print(i+" ");
//				i++;
//			}while(i<=20);
//		}else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//			int i = -10;
//			while(i>=-20)
//			{
//				System.out.print(i+" ");
//				i--;
//			}
//		}else if(ch>'a'&&ch<='z')
//		{
//			for(int i=-25;i<=-15;i++)
//			{
//				System.out.print(i+" ");
//			}
//		}else {
//			for(int i=25;i>=15;i--)
//			{
//				System.out.print(i+" ");
//			}
//		}
		
		boolean isUpper = ch>='A' && ch<='Z';
		boolean isLower = ch>='a' && ch<='z';
		boolean isVowel = "AEIOUaeiou".indexOf(ch)!=-1;
		if(isUpper && isVowel)
		{
			int i = 10;
			do {
				System.out.print(i+" ");
				i++;
			}while(i<=20);
		}else if(isLower && isVowel)
		{
			int i = -10;
			while(i>=-20)
			{
				System.out.print(i+" ");
				i--;
			}
		}else if(isUpper)
		{
			for(int i=25;i>=15;i--)
				{
					System.out.print(i+" ");
				}
		}else {
			for(int i=-25;i<=-15;i++)
				{
					System.out.print(i+" ");
				}
		}
		sc.close();
	}
}
