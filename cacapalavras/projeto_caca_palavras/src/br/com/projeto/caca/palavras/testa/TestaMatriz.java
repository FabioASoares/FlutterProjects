package br.com.projeto.caca.palavras.testa;

import java.util.Locale;

import br.com.projeto.caca.palavras.modelo.BuscaLetra;
import br.com.projeto.caca.palavras.modelo.Matriz;

public class TestaMatriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Matriz matriz = new Matriz();
		matriz.boasVindas();
		matriz.matrizCacaPalavra();
		matriz.adicionandoPalavrasNoMap();
		BuscaLetra buscaLetra = new BuscaLetra();
		buscaLetra.verificaPalavras();

		

	}

}
