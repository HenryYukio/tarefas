package ex05_1;

import java.io.Serializable;

public class Funcionario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private int idade;
	private String profiss�o;
	
	
	public Funcionario(String nome, int idade, String profiss�o) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.profiss�o = profiss�o;
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


	public String getProfiss�o() {
		return profiss�o;
	}


	public void setProfiss�o(String profiss�o) {
		this.profiss�o = profiss�o;
	}


	@Override
	public String toString() {
	       return new StringBuffer(" Nome: ").append(this.nome)
	                .append(" Idade: ").append(this.idade).append(" Profissao: ").append(this.profiss�o).toString();
	}
}
