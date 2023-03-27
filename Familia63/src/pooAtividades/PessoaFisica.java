package pooAtividades;

public class PessoaFisica extends Cliente {
	
	int peso;

	public PessoaFisica(String nome, String endereco, int idade, String sexo, double tel, int peso) {
		super(nome, endereco, idade, sexo, tel);
		this.peso = peso;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void visualizar() {
		System.out.println("Nome: "+nome+"\nendereço: "+endereco+"\nidade:"+idade+"\nsexo:"+sexo+"\ncpf: "+sexo+"\nPeso: "+peso);
	}
	
}
