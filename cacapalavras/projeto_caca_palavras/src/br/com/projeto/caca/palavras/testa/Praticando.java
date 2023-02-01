package br.com.projeto.caca.palavras.testa;

import java.util.Scanner;

import br.com.projeto.caca.palavras.modelo.Matriz;

public class Praticando {

	public static void main(String[] args) {
		Matriz teste = new Matriz();
		teste.adicionandoPalavrasNoMap();
		Scanner scan = new Scanner(System.in);
		
		Character letraJMatriz = Matriz.mapMatriz.get("Java")[0][0];
		Character tentar = scan.next().charAt(0);
		
		System.out.println(tentar == letraJMatriz);

	}

}
