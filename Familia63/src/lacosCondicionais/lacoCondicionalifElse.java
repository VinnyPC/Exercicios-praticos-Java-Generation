package lacosCondicionais;

import java.util.Scanner;

public class lacoCondicionalifElse {

	public static void main(String[] args) {
		
		int n1,n2,n3,resultado;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		n1 = read.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = read.nextInt();
		
		resultado = n1 + n2;
		
		System.out.println(n1+" + "+n2+" = "+resultado+". "+
				"\nAgora, digite um número para saber se "+resultado+" é maior, menor "
						+ "ou igual a ele.");
		
		n3 = read.nextInt();
		
		
		if(resultado<n3) {
			System.out.println(resultado+" é menor que "+n3);
		}else if(resultado==n3) {
			System.out.println(resultado+" é igual a "+n3);
		}else {
			System.out.println(resultado+" é maior que "+n3);
		}
		
	}

}
