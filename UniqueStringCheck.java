import java.util.Scanner;
//Program-7
//WAP to find if String contains all unique characters

class UniqueString {
	boolean uniqueStr(String str) {
		for (int i = 0; i < str.length(); i++)
			for (int j = i + 1; j < str.length(); j++)
				if (str.charAt(i) == str.charAt(j))
					return false;
		return true;
	}
}

public class UniqueStringCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String :: ");
		String str = sc.nextLine();
		str = str.toLowerCase();

		UniqueString u = new UniqueString();

		if (u.uniqueStr(str))
			System.out.println("The String " + str 
					+ " has all unique characters");
		else
			System.out.println("The String " + str 
					+ " has duplicate characters");
	}

}
