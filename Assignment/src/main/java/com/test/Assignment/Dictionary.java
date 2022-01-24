package com.test.Assignment;

import java.util.Random;

public class Dictionary {
	
	
	/**
	 * This method returns random boolean value as online English dictionary is not available in java (mocked)
	 * @param word - Send the dictionary word that we need to verify whether word is in English dictionary
	 * @return - True if word is English word else False
	 */
	public boolean isEnglishWord(String word) {
		try {
			Random rd = new Random(); // creating Random object
		      return rd.nextBoolean(); // displaying a random boolean
		}
		catch(Exception exp) {			
			return false;
		}		
	}

}
