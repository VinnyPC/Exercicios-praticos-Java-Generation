package pooAtividades;

public class Cliente {

	String nome;
	String endereco;
	int idade;
	String sexo;
	double tel;
	
	public Cliente(String nome, String endereco, int idade, String sexo, double tel) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.sexo = sexo;
		this.tel = tel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

	public double getTel() {
		return tel;
	}

	public void setTel(double tel) {
		this.tel = tel;
	}
	
	public void visualizar() {
		System.out.println("Nome: "+nome+"\nendereço: "+endereco+"\nidade:"+idade+"\nsexo:"+sexo+"\ncpf: "+sexo);
	}
	
	
}
