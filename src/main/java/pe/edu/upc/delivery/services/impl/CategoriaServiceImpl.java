package pe.edu.upc.delivery.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.delivery.models.entities.Categoria;
import pe.edu.upc.delivery.models.repositories.CategoriaRepository;
import pe.edu.upc.delivery.services.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private CategoriaRepository categoriaRepostory;

	@Transactional
	@Override
	public Categoria save(Categoria entity) throws Exception {
		return categoriaRepostory.save(entity);
	}
	
	@Transactional
	@Override
	public Categoria update(Categoria entity) throws Exception {
		return categoriaRepostory.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		categoriaRepostory.deleteById(id);		
	}
	@Transactional(readOnly = true)
	@Override
	public List<Categoria> findAll() throws Exception {
		return categoriaRepostory.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<Categoria> findById(Integer id) throws Exception {
		return categoriaRepostory.findById(id);
	}
	@Transactional(readOnly = true)
	@Override
	public List<Categoria> findByDenominacion(String denominacion) throws Exception {
		return categoriaRepostory.findByDenominacionContaining(denominacion);
	}

}
