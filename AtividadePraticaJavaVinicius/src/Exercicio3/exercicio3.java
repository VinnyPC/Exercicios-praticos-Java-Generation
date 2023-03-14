package Exercicio3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido = 0;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\n Digite o salário Bruto: ");
		salarioBruto = read.nextFloat();
		
		System.out.println("\n Digite o Adicional Noturno: ");
		adicionalNoturno = read.nextFloat();
		
		System.out.println("\n Digite as horas extras: ");
		horasExtras = read.nextFloat();
		
		System.out.println("\n Digite os descontos: ");
		descontos = read.nextFloat();
		
		salarioLiquido = salarioBruto+adicionalNoturno+(horasExtras*5)-descontos;
		
		System.out.printf("\n O salário liquido é R$ %.2f", salarioLiquido);

	}

}
