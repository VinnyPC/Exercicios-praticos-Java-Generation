package lacosRepeticaoExercicios;

import java.util.Scanner;

public class lacoRepeticaoDoWhile_6 {

	public static void main(String[] args) {
		
		int num,soma=0,quantidade=0;
		float media;
		
		Scanner read = new Scanner(System.in);
		
		
		
		do {
			System.out.println("Digite um número (0 para finalizar).");
			num = read.nextInt();
			if(num % 3 == 0 && num != 0) {
				soma += num;
				quantidade++;
			}
		}while (num != 0);
		
		if(quantidade > 0) {
			media = (float) soma / quantidade;
			System.out.printf("A média dos múltiplos de 3 é %.1f.", media);
		}else {
			System.out.println("Não foram digitados múltiplos de 3.");
		}

	}

}
