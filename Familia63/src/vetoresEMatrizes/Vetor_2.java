package vetoresEMatrizes;

import java.util.Scanner;

public class Vetor_2 {

	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		int i;
		float media=0,soma=0;
		
		Scanner read = new Scanner(System.in);
		
		for(i=0;i<10;i++) {
			System.out.printf("Digite o numero inteiro para add ao vetor: ");
			vetor[i] = read.nextInt();
			soma += vetor[i];
		}
		System.out.println("\nEsses numeros são impares:");
		for(i=0;i<10;i++) {
			if (vetor[i] % 2 != 0){
				System.out.printf(+vetor[i]+" ");
			}
		}
		System.out.println("\nEsses numeros são pares: ");
		for(i=0;i<10;i++) {
			if(vetor[i] % 2 == 0) {
				System.out.printf(vetor[i]+" ");
			}
		}
		media = soma/10;
		System.out.println("\nSoma: "+soma);
		System.out.println("\nMédia: "+media);
		
		
		
		
		

	}

}
