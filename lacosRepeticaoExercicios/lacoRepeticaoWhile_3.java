package lacosRepeticaoExercicios;

import java.util.Scanner;

public class lacoRepeticaoWhile_3 {

	public static void main(String[] args) {
		
		int idade=0,contadorMaior=0,contadorMenor=0,x=0;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite uma idade: ");
		idade=read.nextInt();
		
		while(idade>0) {
			
			if(idade> 0 && idade < 21) {
			contadorMenor++;
			
			}else if(idade > 50) {
			contadorMaior++;
		
			}
			System.out.print("Digite uma idade: ");
            idade = read.nextInt();
			
		}
		
		System.out.println("Total de pessoas com idade menor que 21 anos: " + contadorMenor);
        System.out.println("Total de pessoas com idade maior que 50 anos: " + contadorMaior);

	}

}
