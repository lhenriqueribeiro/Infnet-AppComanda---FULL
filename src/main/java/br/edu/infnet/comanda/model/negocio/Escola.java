package br.edu.infnet.comanda.model.negocio;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Escola {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	
	public Escola() {
	}
	
	public Escola(String nome) {
		this();
		this.nome = nome;
	}
	
	public Escola(int id, String nome) {
		this();
		this.id = id;
		this.nome = nome;
	}	
	
	@Override
	public String toString() {
		return String.format("%d - %s", this.getId(), this.getNome());
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
