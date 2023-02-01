package wordSearch;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class NewGame extends main{
	
	Character[][] boardGame = new Character[7][7];
	public Map<String, Character> mapBoard = new HashMap<>();
	
	public void createTable() {
		
		Random random = new Random();
		
		for(int condition = 0; condition < 1; condition++) {
			
			String lineAlfabetic = "|  A - B - C - D - E - F - G |";
			System.out.print(lineAlfabetic);
			for(Integer line = 0; line < this.boardGame.length; line++) {
				
				System.out.println();
				System.out.println(lines);
				for(Integer colunm = 0; colunm < this.boardGame[line].length; colunm++) {
					System.out.print(" | ");
					
					if(line == 4 && colunm == 3) {
						boardGame[line][colunm] = 'F';
					}
					else if(line == 4 && colunm == 4) {
						boardGame[line][colunm] = 'O';
					}
					else if(line == 4 && colunm == 5) {
						boardGame[line][colunm] = 'R';
					}
					
					if(line == 1 && colunm == 1) {
						boardGame[line][colunm] = 'E';
					}
					if(line == 2 && colunm == 1) {
						boardGame[line][colunm] = 'L';
					}
					if(line == 3 && colunm == 1) {
						boardGame[line][colunm] = 'S';
					}
					if(line == 4 && colunm == 1) {
						boardGame[line][colunm] = 'E';
					}
					
//					if(line == 5 && colunm == 1) {
//						boardGame[line][colunm] = 'D';
//					}
//					if(line == 5 && colunm == 2) {
//						boardGame[line][colunm] = 'A';
//					}
//					if(line == 5 && colunm == 3) {
//						boardGame[line][colunm] = 'R';
//					}
//					if(line == 5 && colunm == 4) {
//						boardGame[line][colunm] = 'T';
//					}
					
					else {
						char randomChar = (char) random.nextInt(65, 90);
						this.boardGame[line][colunm] = Character.valueOf(randomChar);
					}
					
//					if(boardGame[line][colunm] == null) {
//						Random random = new Random();
//						char caractereRandom = (char) (random.nextInt(26) + 'A');
//						boardGame[line][colunm] = caractereRandom;
//					}
//					// Palavra PYTHON
//					boardGame[1][1] = 'P';
//					boardGame[2][2] = 'Y';
//					boardGame[3][3] = 'T';
//					boardGame[4][4] = 'H';
//					boardGame[5][5] = 'O';
//					boardGame[6][6] = 'N';
//					
//					//Palavra DART
//					boardGame[4][3] = 'D';
//					boardGame[3][2] = 'A';
//					boardGame[2][1] = 'R';
//					boardGame[1][0] = 'T';
//					
//					// Palavra WHILE
//					boardGame[5][4] = 'W';
//					boardGame[3][4] = 'I';
//					boardGame[2][4] = 'L';
//					boardGame[1][4] = 'E';
//					
//					
					System.out.print(boardGame[line][colunm]);
//					mapBoard.put(lines + colunm, boardGame[line][colunm]);
				}
				
			}
			System.out.println("\n"+lines);
		}
		System.out.println(mapBoard);
		validateWord();
	}
	
	public void validateWord() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Posição inicial:");
		String positionIn = ler.nextLine();
		System.out.println("Posição inicial:");
		String positionFin = ler.nextLine();
		
		if(mapBoard.containsKey('P')) {
			System.out.println("Valor da Chave: "+ mapBoard);
		}
		else {
			System.out.println("Tem nada aqui");
		}
		
	}
	
}
