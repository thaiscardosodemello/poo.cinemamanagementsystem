package com.cinema.managementsystem;

import java.util.Scanner;
import static com.cinema.managementsystem.ConsoleColors.*;

public class Menu {

    // Menu Gerente
    public static void menuGerente() {
        Scanner scanner = new Scanner(System.in);
        Gerente gerenteAtual = (Gerente) ManagementsystemApplication.usuarioLogado;
        int opcao;
        do {
            System.out.println(ANSI_BLACK+"\n=======================================================================");
            System.out.println(ANSI_BLACK+"| " + ANSI_BRIGHT_RED + " CINEJAVA" + ANSI_LIGHT_GRAY + "                                         | Área do Gerente |");
            System.out.println(ANSI_BLACK+"-----------------------------------------------------------------------\n"+ANSI_RESET);
            System.out.println("     Olá, " + ANSI_GOLD + gerenteAtual.getNome() + ANSI_RESET + "!\n");
            System.out.println(ANSI_BLACK + "    _____________________________________");
            System.out.println(ANSI_BLACK + "   |_____________" + ANSI_RESET + "MENU GERENTE" + ANSI_BLACK + "____________|");
            System.out.println(ANSI_BLACK + "   |                                     |");
            System.out.println(ANSI_BLACK + "   |   " + ANSI_LIGHT_GRAY + "(1)" + ANSI_RESET + " Meus dados" + ANSI_BLACK + "                    |"); 
            System.out.println(ANSI_BLACK + "   |   " + ANSI_LIGHT_GRAY + "(2)" + ANSI_RESET + " Faturamento Bomboniere" + ANSI_BLACK + "        |");
            System.out.println(ANSI_BLACK + "   |   " + ANSI_LIGHT_GRAY + "(3)" + ANSI_RESET + " Faturamento Total" + ANSI_BLACK + "             |"); // PRIORIDADE!
            System.out.println(ANSI_BLACK + "   |   " + ANSI_LIGHT_GRAY + "(4)" + ANSI_RESET + " Filme Mais Vendido" + ANSI_BLACK + "            |"); // PRIORIDADE!
            System.out.println(ANSI_BLACK + "   |                                     |");
            System.out.println(ANSI_BLACK + "   |   " + ANSI_LIGHT_GRAY + "(0)" + ANSI_RESET + " Sair" + ANSI_BLACK + "                          |");
            System.out.println(ANSI_BLACK + "   |_____________________________________|" + ANSI_RESET);

            System.out.print("\n      Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(gerenteAtual.toString());
                    break;
                case 2:
                    Relatorios.gerarRelatorioFaturamentoBomboniere();
                    break;
                case 3:
                    Relatorios.gerarRelatorioFaturamentoTotal();
                    break;
                case 4:
                    Relatorios.gerarRelatorioFilmeMaisVendido();
                    break;
                case 0:
                    System.out.println("\n>> Saindo...\n");
                    break;
                default:
                System.out.println(ANSI_RED_RUBY+"\n>> Opção inválida! Por favor, escolha novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    // Menu Cliente
    public static void menuCliente() {
        Scanner scanner = new Scanner(System.in);
        Cliente clienteAtual = (Cliente) ManagementsystemApplication.usuarioLogado;
        int opcao;

        do {
            System.out.println(ANSI_BLACK + "\n=======================================================================");
            System.out.println(ANSI_BLACK + "|" + ANSI_BRIGHT_RED + " CINEJAVA" + ANSI_BLACK + "                                         | " + ANSI_WHITE_SNOW + " Área do Cliente" + ANSI_BLACK + " |");
            System.out.println(ANSI_BLACK + "-----------------------------------------------------------------------\n" + ANSI_RESET);

            System.out.println(ANSI_BLACK+"\n     Olá, " +ANSI_GOLD+ clienteAtual.getNome() + ANSI_RESET+ "!\n");
            System.out.println(ANSI_BLACK+"    ____________________________");
            System.out.println(ANSI_BLACK+"   |________"+ANSI_RESET+"MENU CLIENTE"+ANSI_BLACK+"________|");
            System.out.println(ANSI_BLACK+"   |                            |");
            System.out.println(ANSI_BLACK+"   |   "+ANSI_LIGHT_GRAY+"(1)"+ANSI_RESET+" Meus dados"+ANSI_BLACK+"           |"); 
            System.out.println(ANSI_BLACK+"   |   "+ANSI_LIGHT_GRAY+"(2)"+ANSI_RESET+" Meus ingressos"+ANSI_BLACK+"       |"); // PRIORIEDADE! Histórico de compras
            System.out.println(ANSI_BLACK+"   |   "+ANSI_LIGHT_GRAY+"(3)"+ANSI_RESET+" Comprar ingressos"+ANSI_BLACK+"    |"); 
            System.out.println(ANSI_BLACK+"   |   "+ANSI_LIGHT_GRAY+"(4)"+ANSI_RESET+" Bomboniere"+ANSI_BLACK+"           |"); 
            System.out.println(ANSI_BLACK+"   |                            |");
            System.out.println(ANSI_BLACK+"   |   "+ANSI_LIGHT_GRAY+"(0)"+ANSI_RESET+" Sair"+ANSI_BLACK+"                 |");
            System.out.println(ANSI_BLACK+"   |____________________________|"+ANSI_RESET);

            System.out.print("\n      Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(clienteAtual.toString());
                    break;
                case 2:
                    // Chamar método para exibir histórico de ingressos
                    System.out.println(" Chamar método para exibir histórico de ingressos");
                    break;
                case 3:
                    Cliente.comprarIngresso();
                    break;
                case 4:
                    Bomboniere.compraBomboniere();
                    break;
                case 0:
                    System.out.println("\n>> Saindo...\n");
                break;
            default:
                    System.out.println(ANSI_RED_RUBY+"\n>> Opção inválida! Por favor, escolha novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    
}
