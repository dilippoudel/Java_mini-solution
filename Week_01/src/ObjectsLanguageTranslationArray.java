
public class ObjectsLanguageTranslationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []english = {"bird", "bus", "car", "cat", "dog"};
		String []finnish = {"lintu", "bussi", "auto", "kissa", "koira"};
		System.out.println("Enter an English words: ");
		
		for (int i = 0; i < english.length; i++) {
			WordPair wordPairs = new WordPair(english[i], finnish[i]);
		}
		
	}

}
