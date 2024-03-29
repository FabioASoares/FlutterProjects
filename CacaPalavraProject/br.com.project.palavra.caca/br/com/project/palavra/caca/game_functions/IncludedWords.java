package br.com.project.palavra.caca.game_functions;

import java.util.HashMap;
import java.util.Map;

public class IncludedWords{
	static Map<String, String> wordsIncluded = new HashMap<>();
	
	
	static Boolean reflectionFounded = false;
	// Metodo Reflection
	public static Boolean getReflectionFounded() {
		NewGame.tableGame[0][8] = "R";
		NewGame.tableGame[1][8] = "E";
		NewGame.tableGame[2][8] = "F";
		NewGame.tableGame[3][8] = "L";
		NewGame.tableGame[4][8] = "E";
		NewGame.tableGame[5][8] = "C";
		NewGame.tableGame[6][8] = "T";
		NewGame.tableGame[7][8] = "I";
		NewGame.tableGame[8][8] = "O";
		NewGame.tableGame[9][8] = "N";
		return reflectionFounded;
	}
	
	
	static Boolean lambdaFounded = false;
	
	public static Boolean getLambdaFounded() {
		NewGame.tableGame[1][1] = "A";
		NewGame.tableGame[2][1] = "D";
		NewGame.tableGame[3][1] = "B";
		NewGame.tableGame[4][1] = "M";
		NewGame.tableGame[5][1] = "A";
		NewGame.tableGame[6][1] = "L";
		return lambdaFounded;
	}
	
	static Boolean stringFounded = false;
	
	public static Boolean getStringFounded() {
		NewGame.tableGame[7][9] = "S";
		NewGame.tableGame[6][8] = "T";
		NewGame.tableGame[5][7] = "R";
		NewGame.tableGame[4][6] = "I";
		NewGame.tableGame[3][5] = "N";
		NewGame.tableGame[2][4] = "G";
		return stringFounded;
		
	}
	
	static Boolean wrapperFounded = false;
	public static Boolean getWrapperFounded() {
		NewGame.tableGame[9][0] = "W";
		NewGame.tableGame[9][1] = "R";
		NewGame.tableGame[9][2] = "A";
		NewGame.tableGame[9][3] = "P";
		NewGame.tableGame[9][4] = "P";
		NewGame.tableGame[9][5] = "E";
		NewGame.tableGame[9][6] = "R";
		return wrapperFounded;
	}
	
	static Boolean threadFounded = false;
	public static Boolean getThreadFounded() {
		NewGame.tableGame[6][8] = "T";
		NewGame.tableGame[6][7] = "H";
		NewGame.tableGame[6][6] = "R";
		NewGame.tableGame[6][5] = "E";
		NewGame.tableGame[6][4] = "A";
		NewGame.tableGame[6][3] = "D";
		return threadFounded;
	}
	void includeWord(){
		
		// Palavra Reflection
		IncludedWords.wordsIncluded.put("01 I", "R");
		IncludedWords.wordsIncluded.put("10 I", "N");
		
		// Palavra Lambda
		IncludedWords.wordsIncluded.put("07 B","L");
		IncludedWords.wordsIncluded.put("02 B","A");
		
		// Palavra Thread
		
		IncludedWords.wordsIncluded.put("07 I", "T");
		IncludedWords.wordsIncluded.put("07 D", "D");
		
		// Palavra Wrapper
		IncludedWords.wordsIncluded.put("10 A", "W");
		IncludedWords.wordsIncluded.put("10 G", "R");
		
		// Palavra String
		IncludedWords.wordsIncluded.put("08 J", "S");
		IncludedWords.wordsIncluded.put("03 E", "G");
		
		ValidationWord validated = new ValidationWord();
		validated.validatedWord();
		
	}
}
