import java.util.Scanner;
import java.util.Map;

public class TextToMorseCode {
	
	private static final MorseCodeDefinitions mCD = new MorseCodeDefinitions();
	private static Map<Character, String> morseDictionary = mCD.getMorseDictionary();
	private static Map<String, Character> characterDictionary = mCD.getCharacterDictionary();
	private static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		String userText = "";
		String convertedString = "";
		System.out.println("Choose your conversion method:");
		System.out.println("1 - Text To Morse Code\n2 - Morse Code To Text");
		String converter = userInput.nextLine();
		if(converter.equals("1")) {
			System.out.println("Input your text here:\t");
			userText = userInput.nextLine().toUpperCase();
			convertedString = convertText(userText);
		} else if(converter.equals("2")) {
			System.out.println("Input your code here:\t");
			userText = userInput.nextLine().toUpperCase();
			convertedString = convertCode(userText);
		} else
			System.out.println("Invalid conversion chosen");
		userInput.close();
		System.out.println(convertedString);
	}
	
	public static String convertText(String text) {
		StringBuilder convertedString = new StringBuilder();
		for(char i : text.toCharArray())
			if(i == ' ')
				convertedString.append(" / ");
			else if(morseDictionary.containsKey(i))
				convertedString.append(morseDictionary.get(i) + " ");
			else
				convertedString.append(i);
		return convertedString.toString();
	}
	
	public static String convertCode(String code) {
		StringBuilder convertedString = new StringBuilder();
		String[] words = code.split("\\s+");		// cut the spaces out - put single words/codes into an array
		int positionCounter = 1;
		for(String i : words) {
			if(i.equals("/"))
				convertedString.append(" ");
			else if(characterDictionary.containsKey(i))		// error test (does) the value exist in dictionary?
				convertedString.append(characterDictionary.get(i));
			else
				return "Invalid character found at position " + positionCounter;
			positionCounter++;
		}
		return convertedString.toString();
	}

}
