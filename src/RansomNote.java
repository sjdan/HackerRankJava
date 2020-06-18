import java.util.HashMap;

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "two times two three is not four";
		String b = "two times two is four";
		String[] a1 = a.split(" ");
		String[] b1 = b.split(" ");
		checkMagazine(a1, b1);
		
	}
	
	static void checkMagazine(String[] magazine, String[] note) {
	    HashMap<String, Integer> usableWords = makeMap(magazine);
	    for (int i = 0; i < note.length; i++) {
	        if (usableWords.containsKey(note[i]) && usableWords.get(note[i]) > 0) {
	            usableWords.merge(note[i], -1, Integer::sum); // uses the word
	        } else {
	            System.out.println("No");
	            return;
	        }
	    }
	    System.out.println("Yes");
    }
	
	private static HashMap<String, Integer> makeMap(String[] words) {
	    HashMap<String, Integer> map = new HashMap<String, Integer>();
	    for (int i = 0; i < words.length; i++) {
	        map.merge(words[i], 1, Integer::sum);
	    }
	    return map;
	}

}
