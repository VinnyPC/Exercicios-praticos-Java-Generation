package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class collectionListExercicio2 {

	public static void main(String[] args) {
		
		int numPos;
		ArrayList<Integer> valores = new ArrayList<Integer>();
		Scanner read = new Scanner(System.in);
		
		valores.add(2);
		valores.add(5);
		valores.add(1);
		valores.add(3);
		valores.add(4);
		valores.add(9);
		valores.add(7);
		valores.add(8);
		valores.add(10);
		valores.add(6);
		
		System.out.println("\nDigite um numero para encontrar no ArrayList: ");
		numPos = read.nextInt();
		
		if(valores.contains(numPos)) {
			System.out.println("\nO número "+numPos+" está locarizado na posição "+valores.indexOf(numPos));
		}else {
			System.out.println("O número "+numPos+" não foi encontrado!");
		}

	}

}
