package FarmaciaRepository; //comunicacao banco de dados//

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.farmacia.model.PrimeirosSocorros;

@Repository
public interface PrimeirosSocorrosRepository extends JpaRepository<PrimeirosSocorros, Long> {
	public List<PrimeirosSocorros> findAllByTituloContainingIgnoreCase(String titulo);

}