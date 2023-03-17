package vetoresEMatrizesAfazer;

import java.util.Scanner;

public class Matriz_3 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		float[][] matrizNums = new float[3][3];
		int col, row, dp, ds;

		for (row = 0; row < 3; row++) {
			for (col = 0; col < 3; col++) {
				System.out.println("Digite um número para adicionar a matriz: ");
				matrizNums[row][col] = read.nextFloat();
			}
		}
		System.out.print("\nElementos da Diagonal Principal ");
			for(dp=0;dp<3;dp++) {
				System.out.println(matrizNums[dp][dp]);
			}
		System.out.println("\nElementos da Diagonal Secundária ");
			 
				
			
		
		}

	}


