/*
You are given a string containing alphanumeric characters, and your task is to design a
Java program that extracts and displays the numeric characters from the given string. If
no numeric characters are present, the program should display an appropriate message
indicating their absence. Additionally, if the input string is null or empty, the program
must throw a NullPointerException with a meaningful error message.
*/
import java.util.Scanner;

public class q1 {
	public static void numericAfterVowel(String s) {
		if(s.charAt(0) >= 48 && s.charAt(0) <= 57) {
			System.out.print(s.charAt(0));
		}
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) >= 48 && s.charAt(i) <= 57 && (s.charAt(i - 1) == 'a' || s.charAt(i - 1) == 'e' || s.charAt(i - 1) == 'i' || s.charAt(i - 1) == 'o' || s.charAt(i - 1) == 'u') 
			&& (s.charAt(i - 2) !='a' || s.charAt(i - 2) != 'e' || s.charAt(i - 2) != 'i' || s.charAt(i - 2) != 'o' || s.charAt(i - 2) != 'u')
			) {
				System.out.print(s.charAt(i));
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("numerics are: ");
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
		System.out.println("numericAfterVowel: ");
		numericAfterVowel(s);
		sc.close();
	}
}
