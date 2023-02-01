package avaliacao.java.cacaPalavras;

import java.util.Scanner;

public class menuGame {
	static Scanner ler = new Scanner(System.in);
	static Integer opcao;
	static String linhas = " ------------------------------------------------- ";
	static String linhasMatriz = "-----------------------------------------";

	public static void main(String[] args) {
		NovoJogo openGame = new NovoJogo();
		openGame.newGame();

		System.out.println(linhas + "\n        C A Ç A - P A L A V R A S  J A V A          \n" + linhas);

		System.out.println("");
		System.out.println(linhas + "\n          * Digite uma das opções abaixo*          \n" + linhas);
		
		System.out.println(linhas + "\n| 1 - NOVO JOGO \n" + linhas);
		System.out.println(linhas + "\n| 2 - COMO JOGAR \n" + linhas);
		System.out.println(linhas + "\n| 3 - FINALIZAR SESSÃO \n" + linhas);
		opcao = ler.nextInt();
		
		if(opcao == 1) {
//			NovoJogo openGame = new NovoJogo();
//			openGame.newGame();
		}
		else if(opcao == 2) {
			RegrasJogo regrasJogo = new RegrasJogo();
			regrasJogo.comoJogar();			
		}
		else if(opcao == 3) {
			System.out.println(linhas + "\n| DESEJA FINALIZAR A SESSÃO? \n" + linhas);
			System.out.println(linhas + "\n| 1 - SIM || 2 - NÃO | \n" + linhas);
			opcao = ler.nextInt();
			if(opcao == 1) {
				System.out.println(linhas + "\n| APLICAÇÃO ENCERRADA COM SUCESSO \n" + linhas);
				System.exit(0);
			}
			else if(opcao == 2) {
				menuGame.main(args);
			}
			else{
				System.out.println(linhas + "\n | OPÇÃO INVÁLIDA | \n" + linhas);
				menuGame.main(args);
			}
		}
		else {
			System.out.println("Opção inválida!");
		}



	}

}
