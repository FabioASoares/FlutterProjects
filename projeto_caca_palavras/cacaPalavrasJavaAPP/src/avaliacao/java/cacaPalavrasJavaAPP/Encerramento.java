package avaliacao.java.cacaPalavrasJavaAPP;

public class Encerramento extends mainMenu{

	public void encerrar() throws InterruptedException {
		System.out.println(linhas+"\n Deseja encerrar aplicação?\n"+linhas+"\n 1 - SIM ou 2 - NÃO \n"+linhas);
		System.out.print("| ");
		opcao = ler.nextInt();
		if(opcao == 1) {
			System.out.println(linhas+"\n JOGO ENCERRADO COM SUCESSO \n"+linhas);
			System.exit(0);
		}
		else if(opcao == 2){
			System.out.println(linhas+"\n Você será redirecionado ao menu principal \n"+linhas);
			mainMenu.main(null);
		}
		else{
			System.out.println(linhas+"\n OPÇÃO INVÁLIDA \n"+linhas);
			encerrar();
		}
	}

}
