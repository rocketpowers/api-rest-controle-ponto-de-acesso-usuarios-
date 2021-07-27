package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.JornadaTrabalho;


@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long>{
	

}
