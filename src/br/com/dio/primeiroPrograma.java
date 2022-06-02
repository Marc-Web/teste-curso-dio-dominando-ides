package br.com.dio;

import br.com.dio.model.Gato;

public class primeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato("Meaow", "Preto", 8);
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		
		/*int a = 12;
		int b = 3;
		System.out.println("Hello, World!!!!!"  + (a + b));*/
	}
}

class Livros {
	private String nome;
	private String npag;
}
