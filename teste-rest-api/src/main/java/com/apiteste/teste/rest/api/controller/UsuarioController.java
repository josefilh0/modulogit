package com.apiteste.teste.rest.api.controller;

import com.apiteste.teste.rest.api.model.UsuarioModel;
import com.apiteste.teste.rest.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo){

        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "api/usuario/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario){
        return repository.save(usuario);
    }

    @DeleteMapping (path = "api/usuario/delete")
    public void delete(@RequestBody UsuarioModel usuario){
        repository.delete(usuario);

    }

    @PutMapping (path = "api/usuario/atualizar")
    public UsuarioModel atualizar(@RequestBody UsuarioModel usuario){
       return repository.save(usuario);
    }


}
