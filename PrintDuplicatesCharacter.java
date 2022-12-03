import java.util.Scanner;

//Program-2
//WAP to print Duplicates characters from the String.

public class PrintDuplicatesCharacter {
	static final int ASCII_SIZE = 256;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String :: ");
		String str=sc.nextLine();
		str=str.toLowerCase();
		
		System.out.print("Duplicate Characters ::");
		int[] count = new int[ASCII_SIZE];
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		for(int i=0;i<ASCII_SIZE;i++) {
			if(count[i]>1) {
				System.out.print((char)(i)+" ");
			}
		}

	}

}
