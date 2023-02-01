package wordSearch;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class NovoJogo extends main{
	
	public Character[][] boardGame = new Character[6][6];
	public static Map<String, Character[][]> wordMap = new LinkedHashMap<>();
	
	public static void incluiPalavras() {
		Character[][] wordElse = new Character[3][0];
		Character[][] wordFor = new Character[2][1];
		Character[][] wordDart = new Character[3][2];
		
		wordElse[0][0] = 'E';
		wordElse[1][0] = 'L';
		wordElse[2][0] = 'S';
		wordElse[3][0] = 'E';
		wordMap.put("ELSE", wordElse);
		
		wordFor[0][1] = 'F';
		wordFor[1][1] = 'O';
		wordFor[2][1] = 'R';
		wordMap.put("FOR", wordFor);
		
		wordDart[0][2] = 'D';
		wordDart[1][2] = 'A';
		wordDart[2][2] = 'R';
		wordDart[3][2] = 'T';
		wordMap.put("DART", wordDart);
		
	}
	
	public void boardGame() {
		for(int line = 0; line < this.boardGame.length; line++) {
			System.out.println();
			System.out.println(lines);
			for(int colunm = 0; colunm < this.boardGame[line].length; colunm++) {
				Random random = new Random();
				char randomChar = (char) random.nextInt(65, 90);
				this.boardGame[line][colunm] = Character.valueOf(randomChar);
				System.out.print(" | ");
				
				boardGame[0][0] = 'E';
				boardGame[0][1] = 'L';
				boardGame[0][2] = 'S';
				boardGame[0][3] = 'E';
				
				boardGame[3][4] = 'F';
				boardGame[2][4] = 'O';
				boardGame[1][4] = 'R';
				
				boardGame[5][2] = 'D';
				boardGame[5][3] = 'A';
				boardGame[5][4] = 'R';
				boardGame[5][5] = 'T';
				
				System.out.print(boardGame[line][colunm]);
				
				
			}
		}

		
		validaPalavra();
	}
	public void validaPalavra() {
		
		Character tl, tc;
		Scanner ler = new Scanner(System.in);
		
		Integer palavraEncontrada = ler.nextInt();
		if(palavraEncontrada ==1) {
			Boolean lf = false, lo = false, lr = false, pfor = false;
			
			System.out.println("Linha");
			tl = ler.next().charAt(0);
			System.out.println("coluna");
			tc = ler.next().charAt(0);
			if(tl.equals('0') && tc.equals('A')) {
				lf = true;
				System.out.println("acertou"+wordMap.get("ELSE")[0][0]);
			}
			else {
				System.out.println("não enconte");
			}
		}
		
	}
}
