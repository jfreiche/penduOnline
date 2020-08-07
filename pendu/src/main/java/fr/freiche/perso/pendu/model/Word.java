package fr.freiche.perso.pendu.model;

public class Word {
	private String wordToGuess;
	private char[] letterGuessed;
	
	public Word (String wordToGuess) {
		super();
		this.wordToGuess = wordToGuess;
		initializeLetterGuessed(wordToGuess);
	}
	
	private void initializeLetterGuessed(String wordToGuess) {
		letterGuessed = new char[wordToGuess.length()];
	}
	
	public boolean tryLetter(char letter) {
		if(wordToGuess.contains(String.valueOf(letter))) {
			for(int i=0; i<wordToGuess.length(); i++) {
				
				if(wordToGuess.charAt(i) == letter) {
					
					letterGuessed[i] = letter;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}
