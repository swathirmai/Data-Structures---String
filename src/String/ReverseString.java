package String;

public class ReverseString {

	public static void main(String[] args) {

		String str = "This is  		Data";
		StringBuilder sbr = new StringBuilder();
		StringBuilder word = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				word.append(str.charAt(i));
			} else {
				word.reverse();
				word.append(' ');
				sbr.append(word);
				word.setLength(0);
			}
		}
		word.reverse();
		sbr.append(word);
		System.out.println(sbr);
		/*
		 * String[] strarr = str.split(" "); for(String s: strarr) { sbr.append(new
		 * StringBuilder(s).reverse().toString() + " "); }
		 * 
		 * System.out.println(sbr+" ");
		 */
		// -----------------------------Palindrome code
		/*
		 * String revstr = ""; for (int i = str.length() - 1; i >= 0; i--) { char ch =
		 * str.charAt(i); revstr += ch; }
		 * 
		 * if (str.equalsIgnoreCase(revstr)) System.out.println("yes"); else
		 * System.out.println("no");
		 */
	}

}
