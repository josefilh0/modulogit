package com.apiteste.teste.rest.api.model;

import javax.persistence.Entity;

@Entity(name = "usuario")
public class UsuarioModel {

    public Integer codigo;
    public String nome;
    public String login;
    public String senha;

}
