package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atv_Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		Scanner read = new Scanner(System.in);
		int opcao;
		String cliente,confirm;
		
		while(true) {
			System.out.println("********************************************");
			System.out.println("											");
			System.out.println("		1 - Adicionar Cliente na Fila		");
			System.out.println("		2 - Listar todos os Clientes		");
			System.out.println("		3 - Retirar Cliente da Fila 		");
			System.out.println("		0 - Sair 							");
			System.out.println("											");
			System.out.println("********************************************");
			System.out.println("Entre com a opção desejada:					");
			
			opcao = read.nextInt();
			
			if(opcao == 0) {
				System.out.println("\nObrigado por usar meu sistema!");
				read.close();
				System.exit(0);
			}
			switch(opcao) {
			case 1:
					System.out.println("\nDigite o nome do cliente: ");
					read.nextLine();
					cliente = read.nextLine();
					fila.add(cliente);
					System.out.println("\nCliente adicionado! ");
				break;
			case 2:
				System.out.println("\nListando todos os clientes: \n"+fila);
				break;
			case 3:
				System.out.println("\nClientes: \n"+fila);
				System.out.println("\nQual cliente você deseja retirar? ");
				cliente = read.next();
				System.out.println("\nTem certeza que deseja excluir "+cliente+"? (S/N)");
				read.nextLine();
				confirm = read.nextLine();
				
				if(confirm.equalsIgnoreCase("s")) {
					System.out.println(cliente+" removido com sucesso!");
					fila.remove(cliente);
				}else if(confirm.equalsIgnoreCase("n")) {
					return;
				}
				break;
				
			}
		}

	}

}
