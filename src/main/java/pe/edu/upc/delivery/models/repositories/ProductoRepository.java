package pe.edu.upc.delivery.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.delivery.models.entities.Producto;
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	List<Producto> findByDescripcionContaining(String descripcion) throws Exception;
}
