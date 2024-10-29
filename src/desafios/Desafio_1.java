package desafios;

import java.util.Scanner;

public class Desafio_1 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira um número: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;

        while ((c) < n) {
            c = (a+b);
            a = b;
            b = c;
        }
        if (c == n) {
            System.out.println(" o número " + n + " percente a sequência de Fibonacci");
        }
        if (c > n) {
            System.out.println(" o número " + n + " não percente a sequência de Fibonacci");
        }
        sc.close();

	}

}
