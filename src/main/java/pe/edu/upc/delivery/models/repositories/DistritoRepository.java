package pe.edu.upc.delivery.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.delivery.models.entities.Distrito;
@Repository
public interface DistritoRepository extends JpaRepository<Distrito, Integer> {
	List<Distrito> findByNombreContaining(String nombre) throws Exception;	
}
