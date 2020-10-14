package com.apiteste.teste.rest.api.repository;

import com.apiteste.teste.rest.api.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository  extends CrudRepository<UsuarioModel, Integer> {
}
