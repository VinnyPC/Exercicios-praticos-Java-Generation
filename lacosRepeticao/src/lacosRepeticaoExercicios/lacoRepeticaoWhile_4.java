package lacosRepeticaoExercicios;

import java.util.Scanner;

public class lacoRepeticaoWhile_4 {

	public static void main(String[] args) {

		int idade, sexo, categoria;
		int backend = 0, frontMulher = 0, mobileHomemMaior40 = 0, fSMulherMenor30 = 0;
		char continuar;

		Scanner read = new Scanner(System.in);

		do {
			System.out.println("Digite a idade do colaborador: ");
			idade = read.nextInt();

			System.out.println("Sexo do colaborador: ");
			System.out.println("1 - Masculino");
			System.out.println("2 - Feminino");
			System.out.println("3 - Outros");
			System.out.println("Digite número correspondente: ");
			sexo = read.nextInt();

			System.out.println("Digite a categoria do colaborador: ");
			System.out.println("1 - Backend");
			System.out.println("2 - Frontend");
			System.out.println("3 - Mobile");
			System.out.println("4 - FullStack");
			System.out.println("Digite número correspondente: ");
			categoria = read.nextInt();

			if (categoria == 1) {
				backend++;
			} else if (categoria == 2 && sexo == 2) {
				frontMulher++;
			} else if (categoria == 3 && idade > 40 && sexo == 1) {
				mobileHomemMaior40++;
			} else if (categoria == 4 && idade < 30 && sexo == 2) {
				fSMulherMenor30++;
			}

			System.out.println("Deseja continuar? (S/N)");
			continuar = read.next().charAt(0);
		} while (continuar == 'S' || continuar == 's');

		System.out.println("Número de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("Número de mulheres desenvolvedoras Frontend: " + frontMulher);
		System.out.println("Número de homens desenvolvedores Mobile maiores de 40 anos: " + mobileHomemMaior40);
		System.out.println("Número de mulheres desenvolvedoras FullStack menores de 30 anos: " + fSMulherMenor30);
	}

}
