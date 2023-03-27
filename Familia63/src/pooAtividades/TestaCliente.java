package pooAtividades;

import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		String Nnome = read.nextLine();
		
		
		
		
		Cliente cliente1 = new Cliente("Vinicius","Rua Abacaxi",22,"Masculino",11.974897841);
		Cliente cliente2 = new Cliente("Cesar","Rua Batata",23,"Masculino",11.8493841);
		//filho da classe Cliente
		PessoaFisica PF1 = new PessoaFisica("Cesar","Rua Batata",23,"Masculino",11.8493841,100);
		PessoaFisica PF2 = new PessoaFisica("Cesar","Rua Batata",23,"Masculino",11.8493841,75);


		PessoaJuridica PJ1 = new PessoaJuridica("Cesar","Rua Batata",23,"Masculino",11.8493841,"16.727.230/0001-97");
		PessoaJuridica PJ2 = new PessoaJuridica("Cesar","Rua Batata",23,"Masculino",11.8493841,"11.222.333/0001-15");
		
		
		
		
		
		
		cliente1.visualizar();
		System.out.println("-----------------------------");
		cliente2.visualizar();
		
		cliente1.setNome(Nnome);
		
		cliente1.visualizar();
		
		cliente1.visualizar();
		System.out.println("-----------------------");
		
		PF1.visualizar();
		System.out.println("-----------------------------");
		
		PF2.visualizar();
		System.out.println("-----------------------------");
		
		PJ1.visualizar();
		System.out.println("-----------------------------");
		PJ2.visualizar();
		System.out.println("-----------------------------");
	}

}
