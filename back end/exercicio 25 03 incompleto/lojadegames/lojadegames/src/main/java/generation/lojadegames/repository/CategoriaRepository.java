package generation.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository<Categoria> extends JpaRepository<Categoria,Long>{
	public List <Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
	

}
