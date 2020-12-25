package String;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		
		String str1 = "apple";
		String str2 = "aplep";
		
		/*char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean status = Arrays.equals(ch1, ch2);*/
		for(int i=0;i<str1.length();i++) {
			for(int j=0;j<str2.length();j++) {
				if(str1.charAt(i) == str2.charAt(j)) {
					str2 = str2.substring(0,j) + str2.substring(j+1);
				}
			}
		}
		if(str2.length() == 0)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
