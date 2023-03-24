package pooAtividades;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		funcionario funcionario1 = new funcionario("Clodoaldo", 55,"Masculino","(11)974856314","Rua abacaxi");
		funcionario funcionario2 = new funcionario("Jubileu", 48,"Masculino","(11)974893214","Rua pimentão");
		
		funcionario1.visualizar();
		System.out.println("\n");
		funcionario2.visualizar();

	}

}
