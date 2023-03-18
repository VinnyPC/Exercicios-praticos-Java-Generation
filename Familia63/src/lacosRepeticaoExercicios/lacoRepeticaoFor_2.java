package lacosRepeticaoExercicios;

import java.util.Scanner;

public class lacoRepeticaoFor_2 {

	public static void main(String[] args) {
		
		/*
		 * Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na 
		 * tela quantos números são pares e quantos número são ímpares. Veja o exemplo abaixo:
		 *  */
		
		int numPar=0,numImpar=0,i,numero;
		Scanner read = new Scanner(System.in);

		for(i=1;i<=10;i++) {
			System.out.print("Digite o " + i + "º número: ");
			numero = read.nextInt();
			
			if(numero % 2 == 0) {
				numPar++;
			}else {
				numImpar++;
			}
		}
		
		  System.out.println("Total de números pares: " + numPar);
	       System.out.println("Total de números ímpares: " + numImpar);
	}

}
