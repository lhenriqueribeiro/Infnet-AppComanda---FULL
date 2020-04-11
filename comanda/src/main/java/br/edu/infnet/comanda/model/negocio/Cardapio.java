package br.edu.infnet.comanda.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity
@Table(name = "TCardapio")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "tipoCardapio")
@JsonSubTypes({
    @JsonSubTypes.Type(value=Bebida.class, name = "Bebida"),
    @JsonSubTypes.Type(value=Petisco.class, name = "Petisco"),
    @JsonSubTypes.Type(value=Sobremesa.class, name = "Sobremesa")
})
public abstract class Cardapio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCardapio;
	private String descricao;
	@ManyToOne
	@JoinColumn(name = "idComanda")
	@JsonBackReference
	private Comanda comanda;
	
	public Cardapio() {
	}
	
	public Cardapio(Integer idCardapio, String descricao) {
		this();
		this.idCardapio = idCardapio;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return String.format("%d - %s", this.getIdCardapio(), this.getDescricao());
	}
	
	public Integer getIdCardapio() {
		return idCardapio;
	}
	public void setId(Integer idCardapio) {
		this.idCardapio = idCardapio;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Comanda getComanda() {
		return comanda;
	}
	public void setComanda(Comanda comanda) {
		this.comanda = comanda;
	}
}