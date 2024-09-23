package com.cinema.managementsystem;

import static com.cinema.managementsystem.ConsoleColors.ANSI_BLACK;
import static com.cinema.managementsystem.ConsoleColors.ANSI_BRIGHT_RED;
import static com.cinema.managementsystem.ConsoleColors.ANSI_RESET;
import static com.cinema.managementsystem.ConsoleColors.ANSI_WHITE_SNOW;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import java.util.Scanner;

public class Cliente extends Usuario {

    public Cliente(String nome, String cpf) {
        super(nome, cpf);
    }

    public boolean acessoPermitido(String login, String senha) {
        if (login.equals(getLogin()) && senha.equals(getSenha())) {
            return true;
        }
        return false;
    }

    // Método para exibir o menu do cliente
    public void login() {
        Menu.menuCliente(); 
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
    public static void comprarIngresso(){
        System.out.println(ANSI_BLACK + "\n=======================================================================");
        System.out.println(ANSI_BLACK + "|" + ANSI_BRIGHT_RED + " CINEJAVA" + ANSI_BLACK + " > Cinema                                | " + ANSI_WHITE_SNOW + " Área do Cliente" + ANSI_BLACK + " |");
        System.out.println(ANSI_BLACK + "-----------------------------------------------------------------------\n" + ANSI_RESET);
        System.out.println("Escolha sua sessão: \n");
    
        Filme.populareListarFilmes();
        
        System.out.print("\n   Digite o número da sessão que deseja reservar:");

        
        Scanner leia = new Scanner(System.in);
        int opcao = leia.nextInt(); 
        if (Sessao.sessoes != null && opcao > 0 && opcao < Sessao.sessoes.size()) {
            Sessao sessao = Sessao.sessoes.get(opcao);
            if (sessao != null) {
                sessao.menuReserva(opcao);
            } else if(opcao == 0){
                System.out.println("Saindo...");
            } else {
            System.out.println("Opção Inválida");
            }
        }
    }    
}