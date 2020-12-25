package String;
import java.util.*;

public class StringCompression {

	public static void main(String[] args) {

		String[] ch = { "a","a","b","b","c","c","c"};
		int n = ch.length;
		ArrayList<Integer> al = new ArrayList();
		for (int i = 0; i < n; i++) {
			int count = 1;
			while (i < n - 1 && ch[i] == ch[i + 1]) {
				count++;
				i++;
			}
			System.out.println(ch[i]+count);
			al.add(count);
			al.add(i);

		}
		System.out.println(al.size());
	}

}
