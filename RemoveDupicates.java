import java.util.Scanner;

//Program 1
//WAP to remove Duplicates from a String.(Take any String ex with duplicates character)

public class RemoveDupicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String :: ");
		String str=sc.nextLine();
		str=str.toLowerCase();
		
		char[] arr=str.toCharArray();	//convert string to character array
		StringBuilder sb=new StringBuilder();	
		for(int i=0;i<arr.length;i++) 		
		{
			boolean repated=false;
			for(int j=i+1;j<arr.length;j++) 
			{
				
				if(arr[i] == arr[j]) // check repeated character
				{
					repated=true;
					break;
				}
			}
			if(!repated) {
				sb.append(arr[i]);
			}
		}
		System.out.println("Remove Character from String ::"+sb);
	}

}
