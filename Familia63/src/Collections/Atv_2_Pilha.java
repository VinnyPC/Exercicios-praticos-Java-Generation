package Collections;

import java.util.Scanner;
import java.util.Stack;

public class Atv_2_Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<>();
		Scanner read = new Scanner(System.in);
		int opcao;
		String livroNome = null;
		
		while(true) {
			System.out.println("********************************************");
			System.out.println("											");
			System.out.println("		1 - Adicionar Livro na pilha		");
			System.out.println("		2 - Listar todos os livros			");
			System.out.println("		3 - Retirar Livro da pilha			");
			System.out.println("		0 - Sair 							");
			System.out.println("											");
			System.out.println("********************************************");
			System.out.println("Entre com a opção desejada:					");
			opcao = read.nextInt();
			
			
			switch(opcao) {
			case 1:
				System.out.println("\nDigite o nome do livro que deseja adicionar a pilha: ");
				read.nextLine();
				livroNome = read.nextLine();
				pilha.push(livroNome);
				break;
			case 2:
				System.out.println("\nTodos os livros: "+pilha);
				break;
			case 3: 
				if(pilha.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
				}else {
					pilha.pop();
				}
				System.out.println("\nLivro retirado! ");
					
				break;
			}
		}
		
		

	}

}
