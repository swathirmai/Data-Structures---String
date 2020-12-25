package String;

public class Subsequence {

	public static void main(String[] args) {

		//String str1 = "abc";
		//String str2 = "ahbgdc";
		String str1 = "greeks";
		String str2 = "j";
		int m = str1.length();
		int n = str2.length();
		boolean status = isSubsequence(str1, str2);
		System.out.println(status);

	}

	public static boolean isSubsequence(String str1, String str2) {
		if (str1.length() > str2.length()) {
			return false;
		}
		if (str1.length() == 0)
			return true;
		int i = 0, j = 0;
		while (i < str2.length() && j < str1.length()) {
			if (str2.charAt(i) == str1.charAt(j))
				j++;
			i++;
		}
		if (j == str1.length())
			return true;
		return false;
	}

}


