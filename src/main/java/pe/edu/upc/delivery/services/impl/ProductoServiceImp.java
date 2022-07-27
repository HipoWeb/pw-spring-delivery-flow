package pe.edu.upc.delivery.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.delivery.models.entities.Producto;
import pe.edu.upc.delivery.models.repositories.ProductoRepository;
import pe.edu.upc.delivery.services.ProductoService;

@Service
public class ProductoServiceImp implements ProductoService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@Transactional
	@Override
	public Producto save(Producto entity) throws Exception {
		// TODO Auto-generated method stub
		return productoRepository.save(entity);
	}
	@Transactional
	@Override
	public Producto update(Producto entity) throws Exception {
		// TODO Auto-generated method stub
		return productoRepository.save(entity);
	}
	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		productoRepository.deleteById(id);

	}
	@Transactional(readOnly = true)
	@Override
	public List<Producto> findAll() throws Exception {
		
		return productoRepository.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<Producto> findById(Integer id) throws Exception {
		
		return productoRepository.findById(id);
	}
	@Transactional(readOnly = true)
	@Override
	public List<Producto> findByDescripcion(String descripcion) throws Exception {
		
		return productoRepository.findByDescripcionContaining(descripcion);
	}

}
