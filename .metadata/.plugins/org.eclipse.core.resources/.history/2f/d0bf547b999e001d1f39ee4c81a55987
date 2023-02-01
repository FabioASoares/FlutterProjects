package br.com.project.palavra.caca.game_functions;

import java.util.Scanner;

import br.com.project.palavra.caca.Menu;

public class EndingGame extends ValidationWord{

	public static void endsGame() {
		Scanner scan = new Scanner(System.in);
		if(Boolean.TRUE.equals(reflectionFounded && stringFounded && wrapperFounded && threadFounded && lambdaFounded)) {
			System.out.println(NewGame.headLines+"\n|     VOCE FINALIZOU O JOGO, PARABENS     |\n"+NewGame.headLines);
			System.out.println(NewGame.headLines+"\n|               P L A C A R               |\n"+NewGame.headLines);
			System.out.println("| TOTAL DE JOGADAS: "+attempts);
			System.out.println("| TOTAL DE PONTOS:   "+score);
			System.out.println(NewGame.headLines);
			System.out.println("|       DESEJA INICIAR UM NOVO JOGO?      |");
			System.out.println("|      1- Vamos nessa | 2 - Agora nao     |\n"+NewGame.headLines);
			System.out.print("| ");
			Integer option = scan.nextInt();
			switch(option) {
			case 1:
				reflectionFounded = false;
				lambdaFounded = false;
				stringFounded = false;
				wrapperFounded = false;
				threadFounded = false;
				attempts = 0;
					
				NewGame play = new NewGame();
				play.newGame();
				break;
			case 2:
				Menu.menu();
				break;
			default:
				System.out.println(NewGame.headLines+"\n|       O P C A O  -  I N V A L I D A     |\n"+NewGame.headLines);
				endsGame();
				break;
		
			}
			scan.close();
		}
	}
}
