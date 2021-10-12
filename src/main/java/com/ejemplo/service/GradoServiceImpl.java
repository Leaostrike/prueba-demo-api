package com.ejemplo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.entity.Grado;
import com.ejemplo.repository.GradoRepository;

@Service
public class GradoServiceImpl implements GradoService{
	
	@Autowired
	private GradoRepository repository;

	@Override
	public List<Grado> listaGrado() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void eliminaGrado(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Grado> buscaGradoPorId(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Grado insertaActualizaGrado(Grado obj) {
		// TODO Auto-generated method stub
		return repository.save(obj);
	}

}
