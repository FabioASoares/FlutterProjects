package wordSearch;

import java.util.Scanner;

public class main {
	
	static Scanner ler = new Scanner(System.in);
	static Integer opcao;
	static String lines = " - - - - - - - - - - - - - -";
	static String headLines = "-----------------------------------------";
	
	public static void main(String[] args) {
		NovoJogo newGame = new NovoJogo();
		newGame.boardGame();
		
		
	}

}
