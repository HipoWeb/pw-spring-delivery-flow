package pe.edu.upc.delivery.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.delivery.models.entities.Distrito;
import pe.edu.upc.delivery.models.repositories.DistritoRepository;
import pe.edu.upc.delivery.services.DistritoService;

@Service
public class DistritoServiceImpl implements DistritoService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private DistritoRepository distritoRepository;

	@Transactional
	@Override
	public Distrito save(Distrito entity) throws Exception {
		return distritoRepository.save(entity);
	}

	@Transactional
	@Override
	public Distrito update(Distrito entity) throws Exception {
		return distritoRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		distritoRepository.deleteById(id);
	}
	@Transactional(readOnly = true)
	@Override
	public List<Distrito> findAll() throws Exception {
		return distritoRepository.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<Distrito> findById(Integer id) throws Exception {
		return distritoRepository.findById(id);
	}
	@Transactional(readOnly = true)
	@Override
	public List<Distrito> findByNombre(String nombre) throws Exception {
		return distritoRepository.findByNombreContaining(nombre);
	}

}
