package Exercicio2;

import java.util.Scanner;

public class exercicio2 {
		public static void main(String[] args) {
			
			float nota1,nota2,nota3,nota4,media = 0;
			
			Scanner read = new Scanner(System.in);
			
			System.out.println("\n Escreva a primeira nota: ");
			nota1 = read.nextFloat();
			
			System.out.println("\n Escreva a segunda nota: ");
			nota2 = read.nextFloat();
			
			System.out.println("\n Escreva a terceira nota: ");
			nota3 = read.nextFloat();
			
			System.out.println("\n Escreva a quarta nota: ");
			nota4 = read.nextFloat();
			
			media = (nota1+nota2+nota3+nota4)/4;
			
			System.out.printf("\n A media do participante é: %.1f", media);
		}
}
