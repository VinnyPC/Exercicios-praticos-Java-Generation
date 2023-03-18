package lacosRepeticaoExercicios;

import java.util.Scanner;

public class lacoRepeticaoDoWhile_5 {

	public static void main(String[] args) {
		
		int numero, soma=0;
		
		Scanner read = new Scanner(System.in);
		
		do {
		
			System.out.println("Escreva um para somar: (0 para sair)");
			numero = read.nextInt();
			
			
			if(numero>0) {
				
				soma += numero;
				
			}
			
		}while (numero != 0);
		
		System.out.println("A soma dos números positivos digitados é: " + soma);

	}

}
