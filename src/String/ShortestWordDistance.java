package String;
import java.util.*;
public class ShortestWordDistance {

	public static void main(String[] args) {
		String[] strarr = {"practice", "makes", "perfect", "coding", "makes"};
		String word1 = "coding";
		String word2 = "practice";
		System.out.println(shortestDistance(strarr,word1,word2));
		
	}
	
	public static int shortestDistance(String[] words, String word1, String word2) {
		        int i1 = -1, i2 = -1;
		        int minDistance = words.length;
		        for (int i = 0; i < words.length; i++) {
		            if (words[i].equals(word1)) {
		                i1 = i;
		            } else if (words[i].equals(word2)) {
		                i2 = i;
		            }

		            if (i1 != -1 && i2 != -1) {
		                minDistance = Math.min(minDistance, Math.abs(i1 - i2));
		            }
		        }
		        return minDistance;
		    }
}
