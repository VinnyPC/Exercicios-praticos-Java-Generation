package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class colecoes {

	public static void main(String[] args) {
		
		//arraylist é para poder manipular o List
		List<Integer> minhaLista = new ArrayList<>();
		
		//adicionando um elemento para dentro da minhaLista
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(3);
		minhaLista.add(1);
		minhaLista.add(2);
		minhaLista.add(5);
		minhaLista.add(2);
		minhaLista.add(3);
		
		//imprimindo lista(mostrando elementos)
		//for(tipo de dados		variavel de repeticao:lista que vai rodar)
		for(Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
		}
		
		//removendo elemento
		System.out.println("\nRemovendo um elemento da lista ");
		System.out.println();
		//nome da lista.remove(indice)
		minhaLista.remove(0);
		
		//imprimindo lista(mostrando elementos)
		for(Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
		}
		
		
		int primeiroElemento = minhaLista.get(0);
		
		System.out.println("\nO primeiro elemento é "+primeiroElemento);
		System.out.println();
		
		//mostrar itens
		//.size verifica o tamanho da lista
		for(int i=0;i<minhaLista.size();i++) {
			System.out.println("\nElemento: "+minhaLista.get(i));
		}
		
		//ordenar lista em ordem crescente
		Collections.sort(minhaLista);
		System.out.println("\nDepois de ordenada: ");
		System.out.println(minhaLista);
		
		System.out.println();
		
		
		//set do tipo hashset
		//hashset é para poder manipular o set
		//criando objeto meuSet e instanciando a partir do HashSet
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(4);
		meuSet.add(3);
		meuSet.add(4);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(2);
		
		
		//tranformar ImeuSet em iterator
		Iterator<Integer> IMeuSet = meuSet.iterator();
		
		while(IMeuSet.hasNext()) {
			System.out.println(IMeuSet.next());
		}
		

	}

}
