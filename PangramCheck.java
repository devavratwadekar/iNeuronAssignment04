//Program-6
//WAP to implement Pangram Checking with least inbuilt methods being used.

public class PangramCheck {

	private static boolean isPanagram(String str1) {
		if (str1.length() < 26) {
			return false;
		} else {
			for (char ch = 'a'; ch <= 'z'; ch++) {
				if (str1.indexOf(ch) < 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String str1 = "The quick brown fox jumps over the lazy dog";
		str1 = str1.replaceAll("\\s", " ").toLowerCase();

		if (isPanagram(str1))
			System.out.println(str1 + "\nis Panagram");
		else
			System.out.println(str1 + "\nis NOT Panagram");
	}

}
