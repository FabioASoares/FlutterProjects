package br.com.projeto.caca.palavras.modelo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Matriz extends AdicionaPalavras {
	public static Character[][] matriz = new Character[10][10];
	public static Map<String, Character[][]> mapMatriz = new LinkedHashMap<>();

	public void matrizCacaPalavra() {

		String instrucaoJogadorColuna = "  A B C D E F G H I J";
		String instrucaoJogadorLinha = "0" + "1" + "2" + "3" + "4" + "5" + "6" + "7" + "8" + "9";
		Integer count = 0;

		System.out.println(instrucaoJogadorColuna);
		System.out.println(" --------------------");

		for (int linha = 0; linha < 10; linha++) {
			System.out.print(instrucaoJogadorLinha.charAt(count) + "|");
			count++;
			for (int coluna = 0; coluna < 10; coluna++) {
				String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				Random objetoAleatorio = new Random();
				char caractereAleatorioMatriz = alfabeto.charAt(objetoAleatorio.nextInt(alfabeto.length()));

				if (linha == 0 && coluna == 0) {
					matriz[0][0] = 'J';
				} else if (linha == 1 && coluna == 0) {
					matriz[1][0] = 'A';
				} else if (linha == 2) {
					if (coluna == 0) {
						matriz[2][0] = 'V';
					} else if (coluna == 8) {
						matriz[2][8] = 'M';
					} else {
						matriz[linha][coluna] = caractereAleatorioMatriz;
					}
				} else if (linha == 3) {
					if (coluna == 0) {
						matriz[3][0] = 'A';
					} else if (coluna >= 2 && coluna <= 6) {
						matriz[3][2] = 'M';
						matriz[3][3] = 'A';
						matriz[3][4] = 'N';
						matriz[3][5] = 'G';
						matriz[3][6] = 'A';
					} else if (coluna == 8) {
						matriz[3][8] = 'A';
					} else {
						matriz[linha][coluna] = caractereAleatorioMatriz;
					}

				} else if (linha == 4 && coluna == 8) {
					matriz[4][8] = 'G';
				} else if (linha == 5 && coluna == 8) {
					matriz[5][8] = 'N';
				} else if (linha == 6 && coluna == 8) {
					matriz[6][8] = 'A';
				} else if (linha == 8 && coluna >= 1 && coluna <= 4) {
					matriz[8][1] = 'R';
					matriz[8][2] = 'U';
					matriz[8][3] = 'B';
					matriz[8][4] = 'Y';
				} else if (linha == 9 && coluna >= 3 && coluna <= 8) {
					matriz[9][3] = 'P';
					matriz[9][4] = 'Y';
					matriz[9][5] = 'T';
					matriz[9][6] = 'H';
					matriz[9][7] = 'O';
					matriz[9][8] = 'N';
				} else {
					matriz[linha][coluna] = caractereAleatorioMatriz;
				}
				System.out.print(matriz[linha][coluna] + "|");
			}

			System.out.println();
			System.out.println(" |-|-|-|-|-|-|-|-|-|-|");

		}
		
		mostraPalavrasDefinidas();

	}

	
	

}
