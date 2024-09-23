package com.cinema.managementsystem;

import static com.cinema.managementsystem.ConsoleColors.ANSI_BLACK;
import static com.cinema.managementsystem.ConsoleColors.ANSI_WHITE_SNOW;

public class Gerente extends Usuario {

    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }

    public boolean acessoPermitido(String login, String senha) {
        if (login.equals(getLogin()) && senha.equals(getSenha())) {
            return true;
        }
        return false;
    }

    public void login() {
        Menu.menuGerente();
    }

    // Método para exibir informações do cliente
    @Override
    public String toString() {
        return String.format(ANSI_BLACK+
            "\n==========================================================\n" +
            "|                       "+ANSI_WHITE_SNOW+"MEUS DADOS"+ANSI_BLACK+"                       |\n" +
            "==========================================================\n\n" + ANSI_WHITE_SNOW+
            " Nome     : %-30s\n" +
            " CPF      : %-14s\n" +
            " Email    : %-30s\n" +
            " Telefone : %-15s\n" +
            " Login    : %-30s\n" + ANSI_BLACK +
            "\n==========================================================\n\n",
            getNome(), getCpf(), getEmail(), getTelefone(), getLogin()
        );
    }
}
