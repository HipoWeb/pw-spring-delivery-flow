package pe.edu.upc.delivery.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.delivery.models.entities.Proveedor;
@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
	List<Proveedor> findByNombreContaining(String nombre) throws Exception;
}
