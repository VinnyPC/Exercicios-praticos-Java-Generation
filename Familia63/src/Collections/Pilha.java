package Collections;

import java.util.Stack;
import java.util.Iterator;

public class Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Prato verde");
		pilha.push("Prato vermelho");
		pilha.push("Prato preto");
		pilha.push("Prato preto");
		pilha.push("Prato preto");

		//mostrando elementos da pilha
		System.out.println("\nElementos da pilha: "+pilha);
		//retirar elemento
		System.out.println("\nRetirar um elemento da pilha: "+pilha.pop());
		System.out.println("\nElementos da pilha: "+pilha);
		
		System.out.println("\nElemento no topo da pilha: "+pilha.peek());
		//add um elemento
		System.out.println("\nAdicionar um elemento na pilha chamado Prato roxo: "+pilha.push("Prato roxo"));
		
		//pegando o tamanho da pilha
		System.out.println("\nTamanho da pilha: "+pilha.size());
		//vericando se existe um elemento na pilha
		System.out.println("\nVerificar um elemento na pilha: "+pilha.contains("Prato"));
		
		System.out.println("\nExibir todos os elementos da minha pilha...");
		
		Iterator<String> iterator = pilha.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
