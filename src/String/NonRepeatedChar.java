package String;
import java.util.*;

public class NonRepeatedChar {

	public static void main(String[] args) {
		
		String str = "welcome";
		HashMap<Character,Integer> hm = new HashMap();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else {
				hm.put(ch, 1);
			}
		}
		
		for(char c : hm.keySet()) {
			if(hm.get(c) > 1) {
				//System.out.println(c + ":" + hm.get(c));
			}
		}
		
		Collection<Integer> cc = hm.values();
		for(int k : cc) {
			//System.out.println(k);
		}
		
		for(Map.Entry<Character, Integer> me : hm.entrySet()) {
			System.out.println(me.getKey() + ":" + me.getValue()) ;
		}

	}

}
