import java.util.HashMap;
import java.util.TreeMap;

public class N_OccurenecesOfCharInString {

	public static void main(String[] args) {
		String senetence = "hi rohan, how are you";
		// char[] ch = senetence.toCharArray();
		HashMap<Character, Integer> charOccurence = new HashMap<>();
		for (char c : senetence.toCharArray()) {
			if (c != ' ' && c != ',')
				if (charOccurence.containsKey(c))
					charOccurence.put(c, charOccurence.get(c) + 1);
				else {
					charOccurence.put(c, 1);
				}
		}
		TreeMap<Character, Integer> sortedMap = new TreeMap<Character, Integer>(charOccurence);
		sortedMap.entrySet().stream()
				.forEach(s -> System.out.println("character " + s.getKey() + " occures " + s.getValue() + " times"));

	}

}
