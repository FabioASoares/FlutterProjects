package avaliacao.java.cacaPalavrasJavaAPP;

import java.util.Random;

public class NovoJogo extends mainMenu {

	public void iniciarJogo() throws InterruptedException {

		System.out.println(linhas + "\n|     Deseja iniciar o jogo sem ler as regras?    |");
		System.out.println(linhas + "\n|    1 - SIM ou 2 - QUERO LER AS REGRAS ANTES     |\n" + linhas);
		Integer option = ler.nextInt();
		if (option == 1) {
			System.out.println(linhas
					+ "\n Para localizar uma palavra, digite a posição INICIAL (LETRA) + a posição final (NÚMERO): \n"
					+ linhas);

			matrizNewGame();
		}
//		else if(option == 2) {
//			RegrasJogo ler = new RegrasJogo();
//			ler.consultarRegras();
//		}
		else {
			System.out.println(linhas + "\n OPÇÃO INVÁLIDA \n" + linhas);
		}
	}

	public static void matrizNewGame() {

		Character[][] matriz = new Character[10][10];
		for (int linha = 0; linha < 10; linha++) {
			System.out.println();
			System.out.println(linhasMatriz);
			for (int coluna = 0; coluna < 10; coluna++) {
				Random random = new Random();
				char caractereRandom = (char) (random.nextInt(26) + 'A');
				matriz[linha][coluna] = caractereRandom;
				// PALAVRA 1 - POLIMORFISMO
				System.out.print("| ");
				matriz[0][0] = 'P';
				matriz[1][1] = 'O';
				matriz[2][2] = 'L';
				matriz[3][3] = 'I';
				matriz[4][4] = 'M';
				matriz[5][5] = 'O';
				matriz[6][6] = 'R';
				matriz[7][7] = 'F';
				matriz[8][8] = 'O';

				// PALAVRA 2 - STRING

				matriz[7][9] = 'S';
				matriz[6][8] = 'T';
				matriz[5][7] = 'R';
				matriz[4][6] = 'I';
				matriz[3][5] = 'N';
				matriz[2][4] = 'G';

				// PALAVRA 3 - THREAD

				matriz[6][7] = 'H';
				matriz[6][6] = 'R';
				matriz[6][5] = 'E';
				matriz[6][4] = 'A';
				matriz[6][3] = 'D';

				// PALAVRA 4 - REFLECTION

				matriz[0][8] = 'R';
				matriz[1][8] = 'E';
				matriz[2][8] = 'F';
				matriz[3][8] = 'L';
				matriz[4][8] = 'E';
				matriz[5][8] = 'C';
				matriz[7][8] = 'I';
				matriz[8][8] = 'O';
				matriz[9][8] = 'N';

				// PALAVRA 5 - WRAPPER

				matriz[9][1] = 'W';
				matriz[8][1] = 'R';
				matriz[7][1] = 'A';
				matriz[6][1] = 'P';
				matriz[5][1] = 'P';
				matriz[4][1] = 'E';
				matriz[3][1] = 'R';

				System.out.print(matriz[linha][coluna]);
				System.out.print(" ");
			}
			System.out.print("| ");
		}
		Integer acertos = 0;

		while (acertos == 5) {

			String position = ler.nextLine();
			position.toUpperCase();
			if (position.equals("A1 I9")) {
				System.out.println("VOCÊ ACERTOU A PALAVRA POLIMORFO");
				acertos++;
			} else if (position.equals("I1 A I10")) {
				System.out.println("VOCÊ ACERTOU A PALAVRA REFLECTION");
				acertos++;
			} else if (position.equals("I7 A D7")) {
				System.out.println("VOCÊ ACERTOU A PALAVRA THREAD");
				acertos++;
			} else if (position.equals("A9 A G9")) {
				System.out.println("VOCÊ ACERTOU A PALAVRA WRAPPER");
				acertos++;
			} else if (position.equals("J8 A E3")) {
				System.out.println("VOCÊ ACERTOU A PALAVRA ");
				acertos++;
			} else {
				System.out.println("POSIÇÃO INVALIDA");
				acertos--;
			}
		}

	}
}
