package strings;
import java.util.Arrays;
public class Q2 {
	public static void main(String[] args) {
		String str = "apple,,banana,,grape,,";
		String[] posLimit = str.split(",", 3);
		String[] zeroLimit = str.split(",", 0);
		String[] negLimit = str.split(",", -1);
		for(String s : posLimit) {
			System.out.println(s.isEmpty() ? "(empty)" : s);
			System.out.println("Positive Limit (3): " + Arrays.toString(posLimit));
			for(String s1 : posLimit) {
				System.out.println(s.isEmpty() ? "(empty)" : s1);
			}
			System.out.println("Zero Limit (0): " + Arrays.toString(zeroLimit));
			for(String s1 : zeroLimit) {
				System.out.println(s1.isEmpty() ? "(empty)" : s1);
			}
			System.out.println("Negative Limit (-1): " + Arrays.toString(negLimit));
			for(String s1 : negLimit) {
				System.out.println(s1.isEmpty() ? "(empty)" : s1);
			}
		}
	}
}
