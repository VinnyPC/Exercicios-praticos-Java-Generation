package lacosRepeticaoAula;

import java.util.Scanner;

public class lacoWhile {

	public static void main(String[] args) {
		
		int numero,somaPar=0,contImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um numero: ");
		numero = leia.nextInt();
		
		while(numero != 0) {
			if(numero % 2 == 0) {
				somaPar += numero;
			}else {
				contImpar++;
			}
			System.out.println("\nEntre com um número: ");
			numero=leia.nextInt();
		}
		
		System.out.println("\nSomatorio dos numeros pares foi de: "+somaPar);
		System.out.println("\nSomatorio dos numeros imapares foi de: "+contImpar);

	}

}
