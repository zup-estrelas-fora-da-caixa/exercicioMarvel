package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioPersonagem {

	public static void main(String[] args) {
		
		// Declarando o teclado
		Scanner entrada = new Scanner(System.in);
		
		// Declarando o ArrayList
		List<String> listaDePersonagens = new ArrayList<String>();
		
		String nomePersonagem = "";
		
		// Usando o while
		while (!nomePersonagem.equalsIgnoreCase("Homem de Ferro")) {
			
			System.out.println("Digite o nome do personagem: ");
			nomePersonagem = entrada.nextLine();
			
			listaDePersonagens.add(nomePersonagem);
			
			System.out.println("O personagem adicionada a lista foi: " 
			+ nomePersonagem);
			
		}
		
		System.out.println("Os personagens da lista são: ");
		for (String string : listaDePersonagens) {
			System.out.println(string);
		}
		
		entrada.close();
	}

}
