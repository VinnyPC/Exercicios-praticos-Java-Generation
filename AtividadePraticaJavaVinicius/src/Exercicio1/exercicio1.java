package Exercicio1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
	float salario, abono, novoSalario;
	
	Scanner read = new Scanner(System.in);
	
	System.out.println("\n Digite o seu salário: ");
	salario = read.nextFloat();
	
	System.out.println("\n Digite o seu abono: ");
	abono = read.nextFloat();
	
	novoSalario = salario + abono;
	System.out.printf("\n Seu novo salario é R$ %.2f", novoSalario);
	}

}
