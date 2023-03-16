package lacosRepeticaoExercicios;

import java.util.Scanner;

public class lacoRepeticaoFor_2 {

	public static void main(String[] args) {
		
		int numPar=0,numImpar=0,i,numero;
		Scanner read = new Scanner(System.in);

		for(i=1;i<=10;i++) {
			System.out.print("Digite o " + i + "º número: ");
			numero = read.nextInt();
			
			if(numero % 2 == 0) {
				numPar++;
			}else {
				numImpar++;
			}
		}
		
		  System.out.println("Total de números pares: " + numPar);
	       System.out.println("Total de números ímpares: " + numImpar);
	}

}
