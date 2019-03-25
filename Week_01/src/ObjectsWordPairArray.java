
public class ObjectsWordPairArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordPair []p = new WordPair[3];
		for(int i = 0; i < p.length; i++) {
			p[0] = new WordPair("class","luokka");
			p[1] = new WordPair("object","olio");
			p[2] = new WordPair("variable","muuttuja");

			System.out.println(p[i]);
		}
	}

}
