package String;
import java.util.*;

public class ReverseWordsinaString {

	public static void main(String[] args) {
		// example good a
		String str = "a good example welcome";
		//String str1 = str.replaceAll("\\s+", " ");
		String revstr = null;
	//System.out.println(str1);
	
		Stack<String> stack = new Stack<String>();

		String[] strarr = str.split(" ");
		for (String s : strarr) {
			stack.push(s);
		}

		while (!stack.isEmpty()) {
			revstr=stack.peek() + " ";
			for(int i=revstr.length()-1;i>=0;i--)
			System.out.print(revstr.charAt(i) + " ");
		
			stack.pop();
		}

	//System.out.println(revstr.replaceAll("\\s", " "));

}}
