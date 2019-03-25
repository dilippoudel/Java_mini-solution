import java.util.*;

public class ObjectsLanguageTranslationArrayList {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<WordPair> myArray = new ArrayList<WordPair>();

		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");
		boolean flag = false;
		String english;
		String finnish;
		String search;

		while (!flag) {
			System.out.print("Enter an English word: ");
			english = reader.nextLine();
			if (english.equals("ok")) {
				flag = true;
				break;
			}
			System.out.print("Enter a Finnish word: ");
			finnish = reader.nextLine();
			WordPair x = new WordPair(english, finnish);
			myArray.add(x);
		}
		System.out.println("=== English-Finnish translation service (quit ends) === ");
		for (WordPair c : myArray) {
			boolean result = false;
			while(!result) {
				System.out.print("Enter an English word: ");
				search = reader.nextLine();
				if (search.equals(c.getEnglishWord())) {
					System.out.println(c.getFinnishWord());	
				}		
				else if(!search.equals(c.getEnglishWord())) {
					System.out.println("Unknown word");
				}
				if (search.equals("quit")) {
					System.out.println("Bye!");
					result = true;
					break;
				}		
			}
		}
		// TODO Auto-generated method stub

	}

}
