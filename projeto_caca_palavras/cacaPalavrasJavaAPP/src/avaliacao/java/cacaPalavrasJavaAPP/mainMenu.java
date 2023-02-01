package avaliacao.java.cacaPalavrasJavaAPP;


import java.util.Scanner;

public class mainMenu {
	static Scanner ler = new Scanner(System.in);
	static Integer opcao;
	static String linhas = " -------------------------------------------------";
	static String linhasMatriz = "-----------------------------------------";
	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println(linhas+"\n        C A Ç A - P A L A V R A S  J A V A          \n"+linhas);
		
		System.out.println("");
		System.out.println(linhas+"\n          * Digite uma das opções abaixo*          \n"+linhas);
		
		System.out.println(linhas + "\n 1 - COMEÇAR NOVO JOGO");
		System.out.println(linhas + "\n 2 - REGRAS DO JOGO ");
		System.out.println(linhas + "\n 3 - EXIT \n" + linhas);
		System.out.print("| ");
		
		Integer option = ler.nextInt();
		switch (option) {
		
		case 1:
			NovoJogo novoJogo = new NovoJogo();
			novoJogo.iniciarJogo();
			break;
		case 2:
			RegrasJogo regras = new RegrasJogo();
			regras.consultarRegras();
		case 3:
			Encerramento encerra = new Encerramento();
			encerra.encerrar();
		default:
			System.out.println(linhas + "\n OPÇÃO INVÁLIDA \n" + linhas);
		}
	}
}
