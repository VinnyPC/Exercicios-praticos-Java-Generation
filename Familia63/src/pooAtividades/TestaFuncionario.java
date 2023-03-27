package pooAtividades;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		funcionario funcionario1 = new funcionario("Clodoaldo", 55,"Masculino","(11)974856314","Rua abacaxi");
		funcionario funcionario2 = new funcionario("Jubileu", 48,"Masculino","(11)974893214","Rua pimentão");
		Gerente Gerente1 = new Gerente("Clodoaldo", 55,"Masculino","(11)974856314","Rua abacaxi","123456-7");
		Gerente Gerente2 = new Gerente("Jubileu", 48,"Masculino","(11)974893214","Rua pimentão","891011-2");
		Vendedor Vendedor1 = new Vendedor("Jubileu", 48,"Masculino","(11)974893214","Rua pimentão","123456-7");
		Vendedor Vendedor2 = new Vendedor("Jubileu", 48,"Masculino","(11)974893214","Rua pimentão","123456-8");
		
		funcionario1.visualizar();
		System.out.println("\n");
		funcionario2.visualizar();
		
		Gerente1.visualizar();
		System.out.println("\n");
		Gerente2.visualizar();
		
		Vendedor1.visualizar();
		System.out.println("\n");
		Vendedor2.visualizar();

	}

}
