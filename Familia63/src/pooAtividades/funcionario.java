package pooAtividades;

public class funcionario {
	
	String nome;
	int idade;
	String sexo;
	String telefone;
	String endereco;
	
	public funcionario(String nome, int idade, String sexo, String telefone, String endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void visualizar() {
		System.out.println("Nome: "+nome+"\nidade: "+idade+"\nSexo: "+sexo+"\nTelefone"+telefone+"\nEndereço: "+endereco);
	}
	
	
}
