package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class collectionListExercicio1 {

	public static void main(String[] args) {
		
		int i;
		String cor;
		ArrayList<String> listaCores = new ArrayList<>();
		
		Scanner read = new Scanner(System.in);
		
		//pedindo ao usuario digitar cinco cores diferentes
		for(i=0;i<5;i++) {
			System.out.println("Digite a "+(i+1)+"º cor: ");
			cor = read.nextLine();
			listaCores.add(cor);
		}
		//mostrando na tela as cores
		System.out.printf("\nTodas as cores"+listaCores);
		
		//mostrando na tela as cores (Crescente)
		Collections.sort(listaCores);
		System.out.printf("\nTodas as cores(Crescente): "+listaCores);

	}

}
