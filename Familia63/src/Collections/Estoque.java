package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		//criando arraylist
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			
			System.out.println("\n----------------------------------------------");
			System.out.println("\n\t\tMenu do Estoque");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque?");
			System.out.println("\n(2) Deseja remover produtos do estoque?");
			System.out.println("\n(3) Deseja atualizar produtos ao estoque?");
			System.out.println("\n(4) Deseja atualizar os produtos do estoque?");
			System.out.println("\n(0) Deseja encerrar o promagra de estoque?");
			System.out.println("\nDigite a sua opção: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine();
				//adicionando produto ao arrayList estoque na primeira posição
				estoque.add(produto);
				break;
			case 2: 
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produtor = leia.nextLine();
				//verficar se dentro do estoque existe o conteudo da variavel produtor para poder retirar
				if(estoque.contains(produtor)) {
					estoque.remove(produtor);
					//se nao
				}else {
					System.out.println("\nEste produto nao existe");
				}
			
			System.out.println("\nProdutos do estoque: ");
			System.out.println(estoque);
			break;
			
			case 3: 
				leia.nextLine();
				System.out.println("\nDigite o nome do produto que deseja atualizar");
				String verifica = leia.nextLine();
				
				System.out.println("\nDigite o nome do produto que entrará no lugar do "+verifica+" : ");
				String novo = leia.nextLine();
				
				//se o produto existe no estoque
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
					//se nao
				}else {
					System.out.println("\nEste produto nao existe");
				}
				System.out.println("\nProdutos do estoque: ");
				System.out.println(estoque);
				break;
				
			case 4:
				System.out.println("\nProdutos do estoque: ");
				System.out.println(estoque);
				break;
				
			case 0:
				System.out.println("\nMuito obrigado por utilizar o nosso sistema.");
				break;
				
				default:
					System.out.println("\nOpção inválida.");
			}	
			
		}while(op != 0);

	}

}
