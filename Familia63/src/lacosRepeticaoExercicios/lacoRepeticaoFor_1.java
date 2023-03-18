package lacosRepeticaoExercicios;

import java.util.Scanner;

public class lacoRepeticaoFor_1 {

	public static void main(String[] args) {

		int num1, num2, i;

		Scanner read = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		num1 = read.nextInt();

		System.out.println("Digite o segundo número: ");
		num2 = read.nextInt();

		if (num1 >= num2) {
			System.out.println("Intervalo inválido.");
		}


		for (i = num1; i <= num2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i+" é multiplo de 3 e 5");
				}
		}
	}

}
