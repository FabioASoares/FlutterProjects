package br.com.projeto.caca.palavras.modelo;

import java.util.Scanner;

public class BuscaLetra extends AdicionaPalavras {

	public void verificaPalavras() {
		Boolean continuarJogando = true;
		Integer palavraEncontrada = 0;
		Scanner scan = new Scanner(System.in);
		palavraEncontrada = scan.nextInt();

		while (continuarJogando) {
			if (palavraEncontrada == 1) {
				palavraJava();
				continuarJogando = false;

			} else if (palavraEncontrada == 2) {
				palavraMagna();
				continuarJogando = false;
			} else if (palavraEncontrada == 3) {
				palavraManga();
				continuarJogando = false;
			} else if (palavraEncontrada == 4) {
				palavraRuby();
				continuarJogando = false;
			} else if (palavraEncontrada == 5) {

			} else {

			}
		}

	}

	private void palavraRuby() {
		Boolean letraR = false, letraU = false, letraB = false;
		Character tentativaLinha, tentativaColuna;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número da linha em que se encontra a letra R - 0 á 9");
		tentativaLinha = scan.next().charAt(0);
		System.out.println("Digite a letra da coluna em que se encontra a letra R - A á J");
		tentativaColuna = scan.next().toUpperCase().charAt(0);

		if (tentativaLinha == '8' && tentativaColuna == 'B') {
			letraR = true;
			System.out.println("Você acertou a posição da letra " + Matriz.mapMatriz.get("Ruby")[8][1]);
		} else {
			tentativaInvalida();
		}

		if (letraR == true) {
			System.out.println("Digite o número da linha em que se encontra a letra U - 0 á 9");
			tentativaLinha = scan.next().charAt(0);
			System.out.println("Digite a letra da coluna em que se encontra a letra U - A á J");
			tentativaColuna = scan.next().toUpperCase().charAt(0);
			if (tentativaLinha == '8' && tentativaColuna == 'C') {
				letraU = true;
				System.out.println("Você acertou a posição da letra " + Matriz.mapMatriz.get("Ruby")[8][2]);
			} else {
				tentativaInvalida();
			}

		}
		if (letraR == true && letraU == true) {
			System.out.println("Digite o número da linha em que se encontra a letra B - 0 á 9");
			tentativaLinha = scan.next().charAt(0);
			System.out.println("Digite a letra da coluna em que se encontra a letra B - A á J");
			tentativaColuna = scan.next().toUpperCase().charAt(0);
			if (tentativaLinha == '8' && tentativaColuna == 'D') {
				letraB = true;
				System.out.println("Você acertou a posição da letra " + Matriz.mapMatriz.get("Ruby")[8][3]);
			} else {
				tentativaInvalida();
			}
		}

		if (letraR == true && letraU == true && letraB == true) {
			System.out.println("Digite o número da linha em que se encontra a letra Y - 0 á 9");
			tentativaLinha = scan.next().charAt(0);
			System.out.println("Digite a letra da coluna em que se encontra a letra Y - A á J");
			tentativaColuna = scan.next().toUpperCase().charAt(0);

			if (tentativaLinha == '8' && tentativaColuna == 'E') {
				System.out.println("Você acertou a posição da letra " + Matriz.mapMatriz.get("Ruby")[8][4]);
				jogarNovamente("Ruby");
			} else {
				tentativaInvalida();
			}
		}

	}

	private void palavraManga() {
		Boolean letraM = false, letraA = false, letraN = false, letraG = false;
		Character tentativaLinha, tentativaColuna;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número da linha em que se encontra a letra M - 0 á 9");
		tentativaLinha = scan.next().charAt(0);
		System.out.println("Digite a letra da coluna em que se encontra a letra M - A á J");
		tentativaColuna = scan.next().toUpperCase().charAt(0);

		if (tentativaLinha == '3' && tentativaColuna == 'C') {
			letraM = true;
			System.out.println("Você acertou a posição da letra " + Matriz.mapMatriz.get("Manga")[3][2]);
		} else {
			tentativaInvalida();
		}

		if (letraM == true) {
			System.out.println("Digite o número da linha em que se encontra a letra A - 0 á 9");
			tentativaLinha = scan.next().charAt(0);
			System.out.println("Digite a letra da coluna em que se encontra a letra A - A á J");
			tentativaColuna = scan.next().toUpperCase().charAt(0);

			if (tentativaLinha == '3' && tentativaColuna == 'D') {
				letraA = true;
				System.out.println("Você acertou a posição da letra " + Matriz.mapMatriz.get("Manga")[3][3]);
			} else {
				tentativaInvalida();
			}
		}

		if (letraM == true && letraA == true) {
			System.out.println("Digite o número da linha em que se encontra a letra N - 0 á 9");
			tentativaLinha = scan.next().charAt(0);
			System.out.println("Digite a letra da coluna em que se encontra a letra N - A á J");
			tentativaColuna = scan.next().toUpperCase().charAt(0);
			if (tentativaLinha == '3' && tentativaColuna == 'E') {
				letraN = true;
				System.out.println("Você acertou a posição da letra " + Matriz.mapMatriz.get("Manga")[3][4]);
			} else {
				tentativaInvalida();
			}

		}

		if (letraM == true && letraA == true && letraN == true) {
			System.out.println("Digite o número da linha em que se encontra a letra G - 0 á 9");
			tentativaLinha = scan.next().charAt(0);
			System.out.println("Digite a letra da coluna em que se encontra a letra G - A á J");
			tentativaColuna = scan.next().toUpperCase().charAt(0);
			if (tentativaLinha == '3' && tentativaColuna == 'F') {
				letraG = true;
				System.out.println("Você acertou a posição da letra " + Matriz.mapMatriz.get("Manga")[3][5]);

			} else {
				tentativaInvalida();
			}
		}

		if (letraM == true && letraA == true && letraN == true && letraG == true) {
			System.out.println("Digite o número da linha em que se encontra a letra G - 0 á 9");
			tentativaLinha = scan.next().charAt(0);
			System.out.println("Digite a letra da coluna em que se encontra a letra G - A á J");
			tentativaColuna = scan.next().toUpperCase().charAt(0);
			if (tentativaLinha == '3' && tentativaColuna == 'G') {
				System.out.println("Você acertou a posição da letra " + Matriz.mapMatriz.get("Manga")[3][6]);
				jogarNovamente("Manga");
			} else {
				tentativaInvalida();
			}
		}

	}

	private void palavraMagna() {
		Boolean letraM = false, letraA = false, letraG = false, letraN = false, palavraMagna = false;
		Character tentativaLinha, tentativaColuna;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número da linha em que se encontra a letra M - 0 á 9");
		tentativaLinha = scan.next().charAt(0);
		System.out.println("Digite a letra da coluna em que se encontra a letra M - A á J");
		tentativaColuna = scan.next().toUpperCase().charAt(0);

		if (tentativaLinha == '2' && tentativaColuna == 'I') {
			letraM = true;
			System.out.println("Você acertou a posição da letra " + Matriz.mapMatriz.get("Magna")[2][8]);
		} else {
			tentativaInvalida();
		}

		if (letraM == true) {
			System.out.println("Digite o número da linha em que se encontra a letra A - 0 á 9");
			tentativaLinha = scan.next().charAt(0);
			System.out.println("Digite a letra da coluna em que se encontra a letra A - A á J");
			tentativaColuna = scan.next().toUpperCase().charAt(0);
			if (tentativaLinha == '3' && tentativaColuna == 'I') {
				letraA = true;
				System.out.println("Você acertou a posição da letra " + Matriz.mapMatriz.get("Magna")[3][8]);
			} else {
				tentativaInvalida();
			}
		}

		if (letraM == true && letraA == true) {
			System.out.println("Digite o número da linha em que se encontra a letra G - 0 á 9");
			tentativaLinha = scan.next().charAt(0);
			System.out.println("Digite a letra da coluna em que se encontra a letra G - A á J");
			tentativaColuna = scan.next().toUpperCase().charAt(0);
			if (tentativaLinha == '4' && tentativaColuna == 'I') {
				letraG = true;
				System.out.println("Você acertou a posição da letra " + Matriz.mapMatriz.get("Magna")[4][8]);
			} else {
				tentativaInvalida();
			}
		}

		if (letraM == true && letraA == true && letraG == true) {
			System.out.println("Digite o número da linha em que se encontra a letra N - 0 á 9");
			tentativaLinha = scan.next().charAt(0);
			System.out.println("Digite a letra da coluna em que se encontra a letra N - A á J");
			tentativaColuna = scan.next().toUpperCase().charAt(0);
			if (tentativaLinha == '5' && tentativaColuna == 'I') {
				letraN = true;
				System.out.println("Você acertou a posição da letra " + Matriz.mapMatriz.get("Magna")[5][8]);

			} else {
				tentativaInvalida();
			}
		}

		if (letraM == true && letraA == true && letraG == true && letraN == true) {
			System.out.println("Digite o número da linha em que se encontra a letra A - 0 á 9");
			tentativaLinha = scan.next().charAt(0);
			System.out.println("Digite a letra da coluna em que se encontra a letra A - A á J");
			tentativaColuna = scan.next().toUpperCase().charAt(0);

			if (tentativaLinha == '6' && tentativaColuna == 'I') {
				palavraMagna = true;
				System.out.println("Você acertou a posição da letra " + Matriz.mapMatriz.get("Magna")[6][8]);
			} else {
				tentativaInvalida();
			}
		}

		if (palavraMagna == true) {
			jogarNovamente("Magna");
		}

	}

	private void tentativaInvalida() {
		System.out.println("Linha ou coluna inválidos");
		imprimeMatriz();
		verificaPalavras();
	}

	private void palavraJava() {
		Matriz matriz = new Matriz();
		Character tentativaLinha, tentativaColuna;
		Scanner scan = new Scanner(System.in);
		Boolean letraJ = false, letraA = false, letraV = false, palavraJava = false;
		System.out.println("Digite o número da linha em que se encontra a letra J - 0 á 9");
		tentativaLinha = scan.next().charAt(0);
		System.out.println("Digite a letra da coluna em que se encontra a letra J - A á J");
		tentativaColuna = scan.next().toUpperCase().charAt(0);

		if (tentativaLinha == '0' && tentativaColuna == 'A') {
			letraJ = true;
			System.out.println("Você acertou a posição da letra " + Matriz.mapMatriz.get("Java")[0][0]);
		} else {
			System.out.println("Linha ou coluna inválidos");
			mostraPalavrasDefinidas();
			verificaPalavras();
		}

		if (letraJ == true) {
			System.out.println("Digite o número da linha em que se encontra a letra A - 0 á 9");
			tentativaLinha = scan.next().charAt(0);
			System.out.println("Digite a letra da coluna em que se encontra a letra A - A á J");
			tentativaColuna = scan.next().toUpperCase().charAt(0);
			if (tentativaLinha == '1' && tentativaColuna == 'A') {
				letraA = true;
				System.out.println("Você acertou a posição da letra " + Matriz.mapMatriz.get("Java")[1][0]);

			} else {
				System.out.println("Linha ou coluna inválidos");
				mostraPalavrasDefinidas();
				verificaPalavras();
			}

		}

		if (letraJ == true && letraA == true) {
			System.out.println("Digite o número da linha em que se encontra a letra V - 0 á 9");
			tentativaLinha = scan.next().charAt(0);
			System.out.println("Digite a letra da coluna em que se encontra a letra V - A á J");
			tentativaColuna = scan.next().toUpperCase().charAt(0);
			if (tentativaLinha == '2' && tentativaColuna == 'A') {
				letraV = true;
				System.out.println("Você acertou a posição da letra " + Matriz.mapMatriz.get("Java")[2][0]);

			} else {
				System.out.println("Linha ou coluna inválidos");
				mostraPalavrasDefinidas();
				verificaPalavras();
			}

		}

		if (letraJ == true && letraA == true && letraV == true) {
			System.out.println("Digite o número da linha em que se encontra a letra A - 0 á 9");
			tentativaLinha = scan.next().charAt(0);
			System.out.println("Digite a letra da coluna em que se encontra a letra A - A á J");
			tentativaColuna = scan.next().toUpperCase().charAt(0);
			if (tentativaLinha == '3' && tentativaColuna == 'A') {
				palavraJava = true;
				System.out.println("Você acertou a posição da letra " + Matriz.mapMatriz.get("Java")[3][0]);

			} else {
				System.out.println("Linha ou coluna inválidos");
				matriz.matrizCacaPalavra();
				mostraPalavrasDefinidas();
				verificaPalavras();
			}
		}
		if (palavraJava == true) {
			jogarNovamente("Java");

		}

	}

	private void jogarNovamente(String palavra) {
		String jogarNovamenteString = "Deseja jogar novamente?\n1-Sim\n2-Não";
		Matriz matriz = new Matriz();
		Scanner scan = new Scanner(System.in);
		System.out.printf("Parabéns, você encontrou a palavra %s%n", palavra);
		System.out.println(jogarNovamenteString);
		Boolean opcaoJogarNovamente = true;

		while (opcaoJogarNovamente) {
			int opcao = scan.nextInt();
			if (opcao == 1) {
				matriz.matrizCacaPalavra();
				verificaPalavras();
			} else if (opcao == 2) {
				opcaoJogarNovamente = false;
				sair();
			} else {
				System.out.println("Opção inválida");
				System.out.println(jogarNovamenteString);
			}
		}

	}

	private void imprimeMatriz() {
		Matriz matriz = new Matriz();
		matriz.matrizCacaPalavra();
	}

	private void sair() {
		System.out.println("Você saiu do jogo.");
	}

}
