package String;
import java.util.*;

public class TopKFrequentWords {

	public static void main(String[] args) {

		String[] strArr = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
		List<String> ls = topKFrequent(strArr, 4);
		for (String l : ls)
			System.out.println(l);

	}

	public static List<String> topKFrequent(String[] words, int k) {
		List<String> res = new LinkedList<>(); // add front from min heap
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			if (map.containsKey(words[i])) {
				map.put(words[i], map.get(words[i]) + 1);
			} else {
				map.put(words[i], 1);
			}
		}

		// max heap
		PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a,
				b) -> a.getValue() == b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue() - b.getValue());

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			pq.offer(entry);
			if (pq.size() > k)
				pq.poll();
		}

		while (!pq.isEmpty()) {
			res.add(0, pq.poll().getKey()); // only record the name
		}

		return res;
	}
}