package generation.lojadegames.repository; //comunicacao banco de dados//

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jogoscomputadorRepository<jogoscomputadoresmodel, Postagem> extends JpaRepository<jogoscomputadoresmodel, Long> {
	public List<jogoscomputadorRepository> findAllByTituloContainingIgnoreCase(String titulo);

}