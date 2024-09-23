package com.cinema.managementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cinema.managementsystem.Filme.Categoria;

import java.util.Scanner;
import static com.cinema.managementsystem.ConsoleColors.*;

@SpringBootApplication
public class ManagementsystemApplication {
    

    public static int tentativas = 3;
    public static Usuario usuarioLogado;

    public static void main(String[] args) {
        SpringApplication.run(ManagementsystemApplication.class, args);

        //Populacao.popularSessoes();
        
        Scanner scanner = new Scanner(System.in);

        
        /*Cinema cinema = new Cinema(7, 9);
        cinema.preencherSala();
        cinema.imprimirSala();*/

        /*Cinema cinema = new Cinema(7, 8);
        cinema.preencherSala();
        cinema.imprimirSala();

        /*Cliente c = new Cliente(null, null);
		    c.setNome("Luis Felipe");
		    c.setLogin("luis.cliente@gmail.com");
		    c.setSenha("3456");
		    Usuario.usuarios.add(c);*/


        //População do Gerente e do Cliente
        Populacao.popularClienteGerente();

        while (tentativas > 0) {
            Scanner sc = new Scanner(System.in);
            // Texto ASCII do aligator
            System.out.println("");
            // Borda superior com estilo clássico
        // Borda superior com estilo clássico
        System.out.println(ANSI_BLACK + "-----------------------------------------------------------------------");
        System.out.println(ANSI_BEIGE + "[] [] [] [] [] [] [] [] [] [] [] [] [] [] [] [] [] [] [] [] [] [] [] []");
        System.out.println(ANSI_BLACK + "-----------------------------------------------------------------------");

        // Texto ASCII da logo estilo cinema clássico
        String cinemaLogoAscii = ANSI_RED_RUBY + " ::::::::  ::::::::::: ::::    ::: :::::::::: ::::    ::::      :::\n" +
                ANSI_GOLD + ":+:    :+:     :+:     :+:+:   :+: :+:        +:+:+: :+:+:+   :+: :+:\n" +
                ANSI_BLACK + "+:+            +:+     :+:+:+  +:+ +:+        +:+ +:+:+ +:+  +:+   +:+\n" +
                ANSI_GOLD + "+#+            +#+     +#+ +:+ +#+ +#++:++#   +#+  +:+  +#+ +#++:++#++:\n" +
                ANSI_RED_RUBY + "+#+            +#+     +#+  +#+#+# +#+        +#+       +#+ +#+     +#+\n" +
                ANSI_GOLD + "#+#    #+#     #+#     #+#   #+#+# #+#        #+#       #+# #+#     #+#\n" +
                ANSI_RED_RUBY + " ########  ########### ###    #### ########## ###       ### ###     ###";
        System.out.println(cinemaLogoAscii);

        // Borda inferior com estilo clássico
        System.out.println(ANSI_BLACK + "-----------------------------------------------------------------------");
        System.out.println(ANSI_BEIGE + "[] [] [] [] [] [] [] [] [] [] [] [] [] [] [] [] [] [] [] [] [] [] [] []");
        System.out.println(ANSI_BLACK + "-----------------------------------------------------------------------");

        // Texto final com logo do cinema e área de login
            System.out.println(ANSI_BLACK + "| " + ANSI_BRIGHT_RED + "CINEJAVA" + ANSI_BLACK + "                                            | " + ANSI_LIGHT_GRAY + "Área de Login" + ANSI_BLACK + " |");
            System.out.println(ANSI_BLACK + "-----------------------------------------------------------------------\n" + ANSI_RESET);
            System.out.print("   Login: ");
            String loginDigitado = sc.nextLine();
            System.out.print("   Senha: ");
            String senhaDigitada = sc.nextLine();
            System.out.println("\n\n");

            if (autorizaCredenciais(loginDigitado, senhaDigitada)) {
                tentativas = 3;
                usuarioLogado.login();
            } else if (tentativas > 1) {
                System.out.println(ANSI_RED_RUBY +">> Login ou senha incorretos!"+ANSI_RESET);
                tentativas--;
                System.out.println("\n>> " + ANSI_LIGHT_BLUE + tentativas + ANSI_RESET + " tentativas restantes\n");
            } else {
                tentativas--;
                System.out.println(ANSI_RED_RUBY+"\n>> Acesso Bloqueado!\n");
            }
        }
    }

    public static boolean autorizaCredenciais(String loginDigitado, String senhaDigitada) {
        for (Usuario u : Usuario.usuarios) {
            if (u.getLogin().equals(loginDigitado) && u.getSenha().equals(senhaDigitada)) {
                usuarioLogado = u;
                return true;
            }
        }
        return false;

    }
}