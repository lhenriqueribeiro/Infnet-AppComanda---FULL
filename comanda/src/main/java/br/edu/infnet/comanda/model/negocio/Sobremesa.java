package br.edu.infnet.comanda.model.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TSobremesa")
@PrimaryKeyJoinColumn(name = "idCardapio")
public class Sobremesa extends Cardapio {

	private String nivel;

	public Sobremesa() {
	}
	
	@Override
	public String toString() {
		return String.format("%s", this.getNivel());
	}
	
	public Sobremesa(String nivel) {
		this();
		this.nivel = nivel;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
}