package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class collectionSetExercicio3 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int num;

		Set<Integer> numeros = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite 10 valores inteiros não repetidos: ");
			num = read.nextInt();

			numeros.add(num);

		}
		System.out.println("\nListar dados do Set: ");
		Iterator<Integer> iNumeros = numeros.iterator();

		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());

		}
	}

}
