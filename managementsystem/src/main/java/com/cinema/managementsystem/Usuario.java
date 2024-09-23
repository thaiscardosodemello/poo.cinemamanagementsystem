package com.cinema.managementsystem;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario implements Login {
    // Atributos    
    private String nome;
    private String cpf;
    private String login;
    private String senha;
    private String email;
    private String telefone;

    // Armazena os usuários
    public static List<Usuario> usuarios = new ArrayList<>();

    // Construtor
    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}