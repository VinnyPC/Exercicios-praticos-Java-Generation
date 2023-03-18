package vetoresEMatrizes;

import java.util.Scanner;

public class Matriz_3 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int matriz[][] = new int[3][3],linha,coluna,i,somaDP=0,somaDS=0;
		
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("Digite o numero para adicionar a matriz: ");
				matriz[linha][coluna] = read.nextInt();
			}
		}
		System.out.println("\nElementos da diagonal principal: ");
		for (i=0;i<3;i++) {
			System.out.printf(matriz[i][i]+" ");
			somaDP += matriz[i][i];
		}
		System.out.println("\nElementos da diagonal secundaria: ");
		for (i=0;i<3;i++) {
			System.out.printf(matriz[i][2-i]+" ");
			somaDS += matriz[i][2-i];
		}
		System.out.println("\nSoma dos elementos da diagonal principal: "+somaDP);
		System.out.println("\nSoma dos elementos da diagonal secundaria: "+somaDS);
		
		}

	}


