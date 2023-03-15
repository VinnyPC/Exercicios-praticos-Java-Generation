package lacosCondicionais;

import java.util.Scanner;

public class lacoCondicionalifElse4 {

	public static void main(String[] args) {
		
		String nome1,nome2,nome3;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite se o animal é Vertebrado ou Invertebrado");
		nome1 = read.nextLine();
		
		System.out.println("Digite se o animal é uma Ave, Mamífero, Inseto ou Anelídeo:");
		nome2 = read.nextLine();
		
		System.out.println("Digite se o animal é Carnívoro, Onívoro, Herbívoro ou Hematófago");
		nome3 = read.nextLine();
		
		if(nome1.equals("Vertebrado") && nome2.equals("Ave") && nome3.equals("Carnívoro")) {
			System.out.println("Águia");
		}
		else if(nome1.equals("Vertebrado") && nome2.equals("Ave") && nome3.equals("Onívoro")) {
			System.out.println("Pomba");
		}
		else if(nome1.equals("Vertebrado") && nome2.equals("Mamífero") && nome3.equals("Onívoro")) {
			System.out.println("Homem");
		}
		else if(nome1.equals("Vertebrado") && nome2.equals("Mamífero") && nome3.equals("Herbívoro")) {
			System.out.println("Vaca");
		}
		else if(nome1.equals("Invertebrado") && nome2.equals("Inseto") && nome3.equals("Hematófago")) {
			System.out.println("Pulga");
		}
		else if(nome1.equals("Invertebrado") && nome2.equals("Inseto") && nome3.equals("Herbívoro")) {
			System.out.println("Lagarta");
		}
		else if(nome1.equals("Invertebrado") && nome2.equals("Anelídeo") && nome3.equals("Hematófago")) {
			System.out.println("Sanguessuga");
		}
		else if(nome1.equals("Invertebrado") && nome2.equals("Anelídeo") && nome3.equals("Onívoro")) {
			System.out.println("Minhoca");
		}
		
		
		

	}

}
