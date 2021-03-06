package com.ejemplo.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.entity.Grado;

public interface GradoService {
	
	public abstract List<Grado> listaGrado();
	public abstract void eliminaGrado(int id);
	public abstract Optional<Grado> buscaGradoPorId(int id);
	public abstract Grado insertaActualizaGrado(Grado obj);


}
