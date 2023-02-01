package br.com.project.palavra.caca;

import java.util.Scanner;

import br.com.project.palavra.caca.game_functions.NewGame;

public class HowToPlay extends Menu{

	public void howToPlay() {
		
		// Instruções do jogo
		
		System.out.println("|          S O B R E  O  J O G O          |"
						 + "\n| O intuito deste jogo e estimular sua    |"
						 + "\n| mente a encontrar todas as palavras     |"
						 + "\n| escondidas no tabuleiro.                |"
						 + "\n| Sao um total de 5 palavras que estao    |"
						 + "\n| escondidas na matriz.                   |"
						 + "\n| Cada tentativa, correta ou nao, sera    |"
						 + "\n| contada no placar final do jogo.        |"
						 + "\n| Cada palavra acertada vale 2 pontos     |"
						 + "\n| Cada jogada contabiliza 1 tentativa     |\n"+NewGame.headLines);
		System.out.println("|           C O M O  J O G A R            |\n"+NewGame.headLines);
		System.out.println("| Para jogar e simples: Sera solicitado   |"
						   + "\n| o numero da palavra encontrada, se a    |"
						   + "\n| palavra existir, sera entao solicitado  | "
						   + "\n| a posicao inicial da palavra            |"
						   + "\n| indicada por 1 numero de 0 a 10(sendo   |"
						   + "\n| necessario incluir '0' ate o 9)         |"
						   + "\n| um traco que ira separar a instrucao    |"
						   + "\n| e uma LETRA de A a J, caso a jogada     |"
						   + "\n| seja contabilizada, sera solicitado     |"
						   + "\n| a posicao final da palavra seguido      |"
						   + "\n| pela mesma logica da posicao inicial    |"
						   + "\n| Numero 0 a 10 e Letra A a J, exemplo:   |"
						   + "\n| JOGADA CORRETA: Considere que a         |"
						   + "\n| palavra SANFONA inicia na posicao       |"
						   + "\n| 05-A e finaliza na posicao 05-G         |"
						   + "\n| portanto, a primeira instrucao          |"
						   + "\n| correta sera: 05-A, o usuario deve      |"
						   + "\n| confirmar usando o botao ENTER e em     |"
						   + "\n| seguida, devera digitar a posicao       |"
						   + "\n| final da palavra, indicado em 05-G      |"
						   + "\n| JOGADA ERRADA: A escrita incorreta      |"
						   + "\n| acarretara numa contagem de tentativa   |"
						   + "\n| que sera mostrada no final do jogo      |"
						   + "\n| nao resultando em pontos, jogadas       |"
						   + "\n| incorretas: 5-a, 5-A, 5 a, 5 A, 5a, 5A  |"
						   + "\n| e estritamente necessario seguir a      |"
						   + "\n| formatacao indicada, para que nao       |"
						   + "\n| seja contabilizado tentativas erradas   |\n"+NewGame.headLines);
				
		optionMenu();
	}
	public void optionMenu() {
		
		// Após aprender a jogar, o usuário é encaminhado para o menu de seleção abaixo
		
		Scanner scan = new Scanner(System.in);
		System.out.println("|     E ai, esta pronto pra iniciar?      |\n"+NewGame.headLines
		         + "\n|     1 - Bora nessa | 2 - Agora nao      |\n"+NewGame.headLines);
		System.out.print("| ");
		int option = scan.nextInt();
		switch (option) {
		case 1: 
			NewGame startToPlay = new NewGame();
			startToPlay.newGame();
			break;
		case 2:
			System.out.println(NewGame.headLines+"\n| Hmm, entendo, te direcionaremos   |\n"
					         + "| para o menu principal então       |\n"+NewGame.headLines);
			Menu.menu();
			break;
		default:
			System.out.println(NewGame.headLines+"\n| Opa! Nao existe essa opcao        |\n"+NewGame.headLines);
			optionMenu();
			break;
		}
		scan.close();
	}

}
