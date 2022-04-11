package controller;

public class TranslationManager {
	
	Dictionary dictionary;
	
	public TranslationManager () {
		
		dictionary = new Dictionary();
	}
	
	/**
	 * This method gets translated sentence according to the language
	 * 
	 * @param language
	 * @param sentence
	 * @return
	 */
	public String getTranslation (String language, String sentence) {
		
		String translatedSentence = "";
		
		if (language.equalsIgnoreCase("my")) {
			translatedSentence  = dictionary.getMyTranslation(sentence);}
		else if (language.equalsIgnoreCase("ar")) {
			translatedSentence  = dictionary.getArTranslation(sentence);}
			else if (language.equalsIgnoreCase("kn")) {
				translatedSentence  = dictionary.getArTranslation(sentence);}
				
			System.out.println(this.getClass().getSimpleName() 
					+ " @ 27 translatedSentence = " + translatedSentence);
		 else 
			translatedSentence = "Language does not exist in our dictionary";
		 
		
		return translatedSentence;
	}

}
