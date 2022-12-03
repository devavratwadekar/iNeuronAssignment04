import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
//Program-5
//WAP to implement Anagram Checking least inbuilt methods being used.

public class AnagramCheck {

	public static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		} else {
			char[] str1Array = str1.toCharArray();
			char[] str2Array = str2.toCharArray();

			Arrays.sort(str1Array);
			Arrays.sort(str2Array);

			return Arrays.equals(str1Array, str2Array);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter String 1 :: ");
		String str1 = sc.nextLine();
		System.out.print("Please enter String 2 :: ");
		String str2 = sc.nextLine();

		str1 = str1.replaceAll("\\s", " ").toLowerCase();
		str2 = str2.replaceAll("\\s", " ").toLowerCase();
		if (isAnagram(str1, str2))
			System.out.println("String :: " + str1 + " and " + str2 + " are Anagram");
		else
			System.out.println("String :: " + str1 + " and " + str2 + " are NOT Anagram");
	}

}
