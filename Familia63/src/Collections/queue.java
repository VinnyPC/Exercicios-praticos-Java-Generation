package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<Integer>();
		
		for(int i=0;i<=10;i++) {
			fila.add(i);
		}
		
		System.out.println("\nElementos da fila "+fila);
		System.out.println("\nRemovendo um elemento da fila "+fila.remove());
		System.out.println("\nElementos da fila após a remoção "+fila);
		System.out.println("\nAdicionando um elemento na fila:  "+fila.add(11));
		System.out.println("\nPegar o primeiro elemento da fila "+fila.peek());
		System.out.println("\nPegar o tamanho da fila: "+fila.size());
		System.out.println("\nVerificar um elemento na fila: "+fila.contains(37));
		System.out.println("\nExibir e retirar o primeiro elemento da fila: "+fila.poll());
		
		
		Iterator<Integer> iterator = fila.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			fila.clear();
			System.out.println("\nVerificar se a fila esta vazia "+fila.isEmpty());
			System.out.println("\nElementos da fila "+fila);
		}

	}

}
