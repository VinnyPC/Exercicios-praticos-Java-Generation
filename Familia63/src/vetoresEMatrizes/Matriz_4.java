package vetoresEMatrizes;

import java.util.Scanner;

public class Matriz_4 {

	public static void main(String[] args) {
		
		float matrizNotas[][] = new float[9][3];
		float vetorMedia[] = new float[9];
		int nota,aluno,i;
		
		Scanner read = new Scanner(System.in);
		
	
		for(aluno=0;aluno<9;aluno++) {
			for(nota=0;nota<3;nota++) {
				System.out.println("Digite um número: ");
				matrizNotas[aluno][nota] = read.nextFloat();
				vetorMedia[aluno] += matrizNotas[aluno][nota] / 4;
				
			}
		}
		for(aluno=0;aluno<9;aluno++) {
				System.out.println("A média do aluno "+(aluno + 1)+" é: "+vetorMedia[aluno]);
			}
		

	}

}
