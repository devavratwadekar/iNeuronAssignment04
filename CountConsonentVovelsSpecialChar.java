import java.util.Scanner;
//Program-4
//WAP to count the number of consonants, vowels, special characters in a String

public class CountConsonentVovelsSpecialChar {

	public static void main(String[] args) {
		// Approach-1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any line of String :: ");
		String str = sc.nextLine();
		// devavrat.wadekar@gmail.com
		str.strip().toLowerCase();

		int vol = 0, cons = 0, spChar = 0;
		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					vol++;
				else
					cons++;
			} else
				spChar++;
		}
		System.out.println("Total number of Consonants :: " + cons);
		System.out.println("Total number of Vovels :: " + vol);
		System.out.println("Totat number of Spacial character :: " + spChar);
	}

}
