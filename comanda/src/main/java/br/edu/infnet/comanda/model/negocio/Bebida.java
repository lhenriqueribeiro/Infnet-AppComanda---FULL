package br.edu.infnet.comanda.model.negocio;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TBebida")
@PrimaryKeyJoinColumn(name = "idCardapio")
public class Bebida extends Cardapio {

	private String nivel;

	public Bebida() {
	}
	
	@Override
	public String toString() {
		return String.format("%s", this.getNivel());
	}
	
	public Bebida(String nivel) {
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