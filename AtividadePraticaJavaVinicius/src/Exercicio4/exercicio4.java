package Exercicio4;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		float[] num = new float[5];
		float dif;
		int i;
		
		Scanner read = new Scanner(System.in);
		
		for(i = 1; i <= 4; i++) {
			System.out.println("Digite o numero "+ i);
			num[i] = read.nextFloat();
		}
		
		dif = (num[1]*num[2])-(num[3]*num[4]);
		
		System.out.println("\n A diferença entre "+ num[1]+ " x " + num[2] + " e " + 
		num[3] + " x " + num[4]+ " é " + dif);
		
		
	}

}
