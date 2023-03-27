package pooAtividades;

public class Vendedor extends funcionario {
	
	String registro;

	public Vendedor(String nome, int idade, String sexo, String telefone, String endereco, String registro) {
		super(nome, idade, sexo, telefone, endereco);
		this.registro = registro;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}
	
	public void visualizar() {
		System.out.println("Nome: "+nome+"\nidade: "+idade+"\nSexo: "+sexo+"\nTelefone"+telefone+"\nEndereço: "+endereco+"\nRegistro "+registro);
	}

}
