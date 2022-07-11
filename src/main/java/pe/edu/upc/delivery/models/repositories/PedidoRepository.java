package pe.edu.upc.delivery.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.delivery.models.entities.Pedido;
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
