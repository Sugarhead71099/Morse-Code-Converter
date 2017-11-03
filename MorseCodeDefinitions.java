import java.util.Map;
import java.util.HashMap;

public class MorseCodeDefinitions {

	private Map<Character, String> morseDictionary = new HashMap<Character, String>();
	private Map<String, Character> characterDictionary = new HashMap<String, Character>();
		
	public MorseCodeDefinitions() {
		morseDictionary.put('A', ".-");
		morseDictionary.put('B', "-...");
		morseDictionary.put('C', "-.-.");
		morseDictionary.put('D', "-..");
		morseDictionary.put('E', ".");
		morseDictionary.put('F', "..-.");
		morseDictionary.put('G', "--.");
		morseDictionary.put('H', "....");
		morseDictionary.put('I', "..");
		morseDictionary.put('J', ".---");
		morseDictionary.put('K', "-.-");
		morseDictionary.put('L', ".-..");
		morseDictionary.put('M', "--");
		morseDictionary.put('N', "-.");
		morseDictionary.put('O', "---");
		morseDictionary.put('P', ".--.");
		morseDictionary.put('Q', "--.-");
		morseDictionary.put('R', ".-.");
		morseDictionary.put('S', "...");
		morseDictionary.put('T', "-");
		morseDictionary.put('U', "..-");
		morseDictionary.put('V', "...-");
		morseDictionary.put('W', ".--");
		morseDictionary.put('X', "-..-");
		morseDictionary.put('Y', "-.--");
		morseDictionary.put('Z', "--..");
		morseDictionary.put('0', "-----");
		morseDictionary.put('1', ".----");
		morseDictionary.put('2', "..---");
		morseDictionary.put('3', "...---");
		morseDictionary.put('4', "....-");
		morseDictionary.put('5', ".....");
		morseDictionary.put('6', "-....");
		morseDictionary.put('7', "--...");
		morseDictionary.put('8', "---..");
		morseDictionary.put('9', "----.");
		morseDictionary.put(',', "--..--");
		morseDictionary.put('.', ".-.-.-");
		morseDictionary.put('?', "..--..");
		morseDictionary.put('!', "#");
		morseDictionary.put(':', "---...");
		morseDictionary.put('\'', ".----.");
		
		
		characterDictionary.put(".-", 'A');
		characterDictionary.put("-...", 'B');
		characterDictionary.put("-.-.", 'C');
		characterDictionary.put("-..", 'D');
		characterDictionary.put(".", 'E');
		characterDictionary.put("..-.", 'F');
		characterDictionary.put("--.", 'G');
		characterDictionary.put("....", 'H');
		characterDictionary.put("..", 'I');
		characterDictionary.put(".---", 'J');
		characterDictionary.put("-.-", 'K');
		characterDictionary.put(".-..", 'L');
		characterDictionary.put("--", 'M');
		characterDictionary.put("-.", 'N');
		characterDictionary.put("---", 'O');
		characterDictionary.put(".--.", 'P');
		characterDictionary.put("--.-", 'Q');
		characterDictionary.put(".-.", 'R');
		characterDictionary.put("...", 'S');
		characterDictionary.put("-", 'T');
		characterDictionary.put("..-", 'U');
		characterDictionary.put("...-", 'V');
		characterDictionary.put(".--", 'W');
		characterDictionary.put("-..-", 'X');
		characterDictionary.put("-.--", 'Y');
		characterDictionary.put("--..", 'Z');
		characterDictionary.put("-----", '0');
		characterDictionary.put(".----", '1');
		characterDictionary.put("..---", '2');
		characterDictionary.put("...---", '3');
		characterDictionary.put("....-", '4');
		characterDictionary.put(".....", '5');
		characterDictionary.put("-....", '6');
		characterDictionary.put("--...", '7');
		characterDictionary.put("---..", '8');
		characterDictionary.put("----.", '9');
		characterDictionary.put("--..--", ',');
		characterDictionary.put(".-.-.-", '.');
		characterDictionary.put("..--..", '?');
		characterDictionary.put("#", '!');
		characterDictionary.put("---...", ':');
		characterDictionary.put(".----.", '\'');
	}
	
	public Map<Character, String> getMorseDictionary() {
		return morseDictionary;
	}
	
	public Map<String, Character> getCharacterDictionary() {
		return characterDictionary;
	}
	
}
