package vetoresEMatrizes;

import java.util.Scanner;

public class Vetor_1 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int vetor[] = {2,5,1,3,4,9,7,8,10,6};
		int numVetor,i;
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numVetor = read.nextInt();
		
		for(i=0;i<10;i++) {
			
			if(vetor[i] == numVetor) {
				System.out.println("O numero está na posição "+i);
			}else if (vetor[i] != numVetor) {
				System.out.println("O numero não existe");
				break;
			}
		}
		
		
		
		
	
		

	}

}
