//Program-3
//WAP to check if “2552” is Palindrome or not
public class PalindromNumber {

	public static void main(String[] args) {
		int no = 2552;
		int temp = no;
		int rev = 0, rem;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (no == rev) {
			System.out.println(no + " is Palindrome Numebr");
		} else {
			System.out.println(no + " is NOT Palindrome Numebr");
		}
	}

}
