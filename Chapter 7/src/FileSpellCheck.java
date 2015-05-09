import java.io.*;
import java.util.*;

/* This program will check the spelling of all words in a file.
 * It will use a word list to compare against, found on Linux in
 * ~/usr/share/dict/words 
 * 
 * All words that cannot be found in the wordlist will be printed.
 */

public class FileSpellCheck {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the file to spellcheck: ");
		String readFile = input.next();
		input.close();
		
		HashSet<String> words = wordSet(readFile);
		HashSet<String> dictionary = dictionarySet();
		spellcheck(words, dictionary);
	}
	
	public static HashSet<String> wordSet(String readFile) throws FileNotFoundException {
		Scanner read = new Scanner(new File(readFile));
		HashSet<String> words = new HashSet<String>();
		
		while (read.hasNext()) {
			String word = read.next();
			words.add(word);
		}
		read.close();
		
		return words;
	}
	
	public static HashSet<String> dictionarySet() throws FileNotFoundException {
		Scanner readDict = new Scanner(new File("~/usr/share/dict/words"));
		HashSet<String> dictionary = new HashSet<String>();
		
		while (readDict.hasNext()) {
			String word = readDict.next();
			dictionary.add(word);
		}
		readDict.close();
		
		return dictionary;
	}
	
	public static void spellcheck(HashSet<String> words, HashSet<String> dictionary) throws FileNotFoundException {
		for (String word : words) {
			if (!dictionary.contains(word)) {
				System.out.println(word);
			}
		}
	}
}
