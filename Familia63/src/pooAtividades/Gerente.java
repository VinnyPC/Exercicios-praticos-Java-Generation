package pooAtividades;

public class Gerente extends funcionario {

	String matricula;

	public Gerente(String nome, int idade, String sexo, String telefone, String endereco, String matricula) {
		super(nome, idade, sexo, telefone, endereco);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void visualizar() {
		System.out.println("Nome: "+nome+"\nidade: "+idade+"\nSexo: "+sexo+"\nTelefone"+telefone+"\nEndereço: "+endereco+"\nMatricula: "+matricula);
	}
	
}
