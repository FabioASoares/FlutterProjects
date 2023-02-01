package br.com.projeto.caca.palavras.modelo;

public abstract class AdicionaPalavras {

	public void boasVindas() {
		System.out.println("Seja bem vindo ao caça palavras!\n");

	}

	public void mostraPalavrasDefinidas() {
		System.out.println("\nPalavras:\n");
		System.out.println("1-JAVA 2-MAGNA 3-MANGA 4-RUBY 5-PYTHON");
		System.out.println("\nDigite o número da palavra que você encontrou: ");
	}

	public void adicionandoPalavrasNoMap() {
		Character[][] java = new Character[4][1];
		java[0][0] = 'J';
		java[1][0] = 'A';
		java[2][0] = 'V';
		java[3][0] = 'A';
		Matriz.mapMatriz.put("Java", java);

		Character[][] magna = new Character[7][9];
		magna[2][8] = 'M';
		magna[3][8] = 'A';
		magna[4][8] = 'G';
		magna[5][8] = 'N';
		magna[6][8] = 'A';
		Matriz.mapMatriz.put("Magna", magna);

		Character[][] manga = new Character[4][7];
		manga[3][2] = 'M';
		manga[3][3] = 'A';
		manga[3][4] = 'N';
		manga[3][5] = 'G';
		manga[3][6] = 'A';
		Matriz.mapMatriz.put("Manga", manga);

		Character[][] ruby = new Character[9][5];
		ruby[8][1] = 'R';
		ruby[8][2] = 'U';
		ruby[8][3] = 'B';
		ruby[8][4] = 'Y';
		Matriz.mapMatriz.put("Ruby", ruby);

	}

}
