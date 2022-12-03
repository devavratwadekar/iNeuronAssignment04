//Program-8
//WAP to find the maximum occurring character in a String

public class MaximumOccurCharacter {

	static final int ASCII_SIZE = 256;
    static char getMaxOccurringChar(String str)
    {
        int count[] = new int[ASCII_SIZE];
        
        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
 
        int max = -1; // Initialize max count
        char result = ' '; // Initialize result
        
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }
 
    public static void main(String[] args)
    {
        String str = "DevavratWadekar";
        str=str.toLowerCase();
        System.out.println("Max occurring character in string "+str+" is :: "
                           + getMaxOccurringChar(str));
    }
}
