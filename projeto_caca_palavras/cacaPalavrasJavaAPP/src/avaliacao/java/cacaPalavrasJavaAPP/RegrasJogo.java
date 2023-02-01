package avaliacao.java.cacaPalavrasJavaAPP;

public class RegrasJogo extends mainMenu{

	public void consultarRegras() throws InterruptedException {
		System.out.println(linhas+"\n|                  REGRAS DO JOGO                 |\n"+linhas);
		System.out.println(linhas+"\n| O Caça Palavras Java é um jogo desenvolvido em  |");
		System.out.println("| linguagem java, com o objetivo de rastrear      |");
		System.out.println("| as 6 palavras escondidas na matriz.             |\n"+linhas);
		System.out.println("| O jogo possui 3 dificuldades:                   |");
		System.out.println("| * FÁCIL *  Não possui contagem de tempo.        |");
		System.out.println("| * MÉDIO *  Precisa ser finalizado em 5 minutos  |");
		System.out.println("| * VETERANO * Deve ser finalizado em 3 minutos   |\n"+linhas);
		System.out.println(linhas+"\n|                   COMO JOGAR                    |\n"+linhas);
		System.out.println("| Ao iniciar o jogo, será apresentado o tabuleiro |");
		System.out.println("| com todas as letras, segido ao lado das palavras|");
		System.out.println("| que deverão ser encontradas, para verificar     |");
		System.out.println("| se a palavra existe, será solicitado a posição  |");
		System.out.println("| da primeira e ultima letra, se estiver correto  |");
		System.out.println("| a palavra será descartada, assim sucessivamente |");
		         System.out.println("| até a ultima palavra ser encontrada.            |");
		System.out.println(linhas+"\n|          Se sente pronto para iniciar?          |");
		System.out.println(linhas+"\n|             1 - SIM ou 2 - NÃO                  |\n"+linhas);
		System.out.print("| ");
		opcao = ler.nextInt();
		
		if(opcao == 1) {
			NovoJogo novoJogo = new NovoJogo();
			novoJogo.matrizNewGame();
		}
		else if(opcao == 2) {
			System.out.println(linhas+"\n Você será redirecionado ao menu principal \n"+linhas);
			mainMenu.main(null);
		}
		else {
			System.out.println(linhas+"\n OPÇÃO INVÁLIDA \n"+linhas);
		}
	}

}
