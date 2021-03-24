package com.example.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "tb_Categoria")
public class categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;

	@NotNull
	private String descricao;
    @OneToMany(mappedBy= "Tema",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("Tema")
	private List<categoria> Postagem;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<categoria> getPostagem() {
		return Postagem;
	}

	public void setPostagem(List<categoria> postagem) {
		Postagem = postagem;
	}

}