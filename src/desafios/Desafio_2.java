package desafios;

import java.util.Scanner;

public class Desafio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira uma palavra/frase: ");
		String word = sc.nextLine();
		
		int contador = 0;
		char letra = 'A';
		
		word = word.toUpperCase();
		
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i)==letra) {
				contador++;
			}
		}
		
		 System.out.println("A letra '" + letra + "' aparece " + contador + " vezes na frase.");

	}

}
