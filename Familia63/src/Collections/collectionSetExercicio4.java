package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class collectionSetExercicio4 {

	public static void main(String[] args) {
	
		Scanner read = new Scanner(System.in);
		int locateNum;
		Set<Integer> valores = new HashSet();
		
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
		
		System.out.println("Digite o número que você deseja encontrar: ");
		locateNum = read.nextInt();
		if(valores.contains(locateNum)) {
			System.out.println("\nO número "+locateNum+" foi encontrado!");
		}else {
			System.out.println("\nO número "+locateNum+" não foi encontrado!");
		}

	}

}
