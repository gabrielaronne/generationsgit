package generation.lojadegames.model;

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

import generation.lojadegames.repository.jogoscomputadorRepository;



@Entity
@Table(name = "tb_categoria")
public class CategoriaJogos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;

	@NotNull
	private String Genero;
    @OneToMany(mappedBy= "CategoriaJogos",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("CategoriaJogos")
	private List<jogoscomputadorRepository> CategoriaJogos;



}