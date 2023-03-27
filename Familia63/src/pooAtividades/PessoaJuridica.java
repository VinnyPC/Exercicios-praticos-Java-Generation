package pooAtividades;

public class PessoaJuridica extends Cliente {

	String cnpj = "16.727.230/0001-97";

	public PessoaJuridica(String nome, String endereco, int idade, String sexo, double tel, String cnpj) {
		super(nome, endereco, idade, sexo, tel);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		System.out.println("Nome: "+nome+"\nendereço: "+endereco+"\nidade:"+idade+"\nsexo:"+sexo+"\ncpf: "+sexo+"\nCNPJ: "+cnpj);
	}
	
}
