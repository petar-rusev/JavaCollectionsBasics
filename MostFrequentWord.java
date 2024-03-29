import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class MostFrequentWord {

	public static void main(String[] args) {
		try(Scanner input=new Scanner(System.in)){
			
			String[] words =  input.nextLine().split("\\W+");
            TreeMap<String, Integer> wordOccurrences = new TreeMap<>();
           
            int maxWordCount = 0;
            for (String word : words) {
                    word = word.toLowerCase();
                    Integer wordCount = wordOccurrences.get(word);
                    if (wordCount == null) {
                            wordCount = 0;
                    }
                    if (wordCount + 1 > maxWordCount) maxWordCount = wordCount + 1;
                    wordOccurrences.put(word, wordCount + 1);
            }
           
            for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
                    if (entry.getValue() == maxWordCount) {
                            System.out.println(entry.getKey() + " -> "
                                            + maxWordCount + " times");
                    }
            }
		}

	}

}
