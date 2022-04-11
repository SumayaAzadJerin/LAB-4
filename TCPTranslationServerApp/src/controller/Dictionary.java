package controller;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	
	private Map<String,String> mapEnMy;
	private Map<String,String> mapEnAr;
	private Map<String,String> mapEnKn;
	
	public Dictionary () {
		
		// Create the map
		mapEnMy = new HashMap<String,String>();
		mapEnAr = new HashMap<String,String>();
		mapEnKn = new HashMap<String,String>();
		
		loadEnMy();
		loadEnAr();
		loadEnKn();
	}
	
	

	/**
	 * This method get English translated sentence
	 * 
	 * @param sentence
	 * @return
	 */
	public String getMyTranslation (String sentence) {
		
		String translatedSentence = mapEnMy.get(sentence);
		
		return translatedSentence;
	}
	
	/**
	 * This method get Arabic translated sentence
	 * 
	 * @param sentence
	 * @return
	 */
	public String getArTranslation (String sentence) {
		
		String translatedSentence = mapEnAr.get(sentence);
		
		return translatedSentence;
	}
	
	/**
	 * This method get korean translated sentence
	 * 
	 * @param sentence
	 * @return
	 */
	
public String getKnTranslation (String sentence) {
		
		String translatedSentence = mapEnKn.get(sentence);
		
		return translatedSentence;
	}
	
	
	
	/**
	 * Load data into map for En-My translation
	 */
	private void loadEnMy() {
		
		// Declaration of data
		String en[] = {"Good morning", "Good night", "How are you?", "Thank you", "Goodbye","What’s up?"};
		String my[] = {"Selamat pagi", "Selamat malam", "Apa khabar", "Terima kasih", "Selamat tinggal", "Ada apa?"};
		
		
		// Load data into map
		for (int index=0; index < en.length; index++) {
			
			mapEnMy.put(en[index], my[index]);
		}
	}
	
	/**
	 * Load data into map for En-Ar translation
	 */
	private void loadEnAr() {
		
		// Declaration of data
		String en[] = {"Good morning", "Good night", "How are you?", "Thank you", "Goodbye","What’s up?"};
		String ar[] = {"ص ریخلا ", "اط ك", "ك ؟", "ش ك", "م ة", "م ؟ك"};
		
		
		// Load data into map
		for (int index=0; index < en.length; index++) {
			
			mapEnAr.put(en[index], ar[index]);
		}
	}
	
	
	
	
	/**
	 * Load data into map for En-Kn translation
	 */
	private void loadEnKn() {
		
		// Declaration of data
		String en[] = {"Good morning", "Good night", "How are you?", "Thank you", "Goodbye","What’s up?"};
		String kn[] = {" 좋은 아침", " 안녕히 주무세요", " 어떻게 지내세요?", "감사합니다", "안녕", "뭐야?"};
		
		
		// Load data into map
		for (int index=0; index < en.length; index++) {
			
			mapEnKn.put(en[index], kn[index]);
		}
	}
	
	
	

}
