package pooAtividades;

import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		String Nnome = read.nextLine();
		
		
		
		
		Cliente cliente1 = new Cliente("Vinicius","Rua Abacaxi",22,"Masculino",11.974897841);
		Cliente cliente2 = new Cliente("Cesar","Rua Batata",23,"Masculino",11.8493841);
		
		cliente1.visualizar();
		System.out.println("\n");
		cliente2.visualizar();
		
		cliente1.setNome(Nnome);
		
		cliente1.visualizar();

	}

}
