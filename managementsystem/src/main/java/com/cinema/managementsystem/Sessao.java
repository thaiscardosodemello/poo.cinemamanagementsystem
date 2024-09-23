package com.cinema.managementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cinema.managementsystem.Bomboniere.Item;
import static com.cinema.managementsystem.ConsoleColors.*;

public class Sessao {

    public static int meia = 0;
    public static int inteira = 0;
    public static int tipoIngresso = 0;
    public int reservarFila;
    public int reservarColuna;
    public Filme filme;
    public Character[][] assentos;
    public static List<Sessao> sessoes = new ArrayList<>();

    public Sessao(int linha, int coluna) {
       this.assentos = new Character[linha][coluna];
       this.preencherSessao();
    }

    public void preencherSessao() {
        for (int i = 0; i < assentos.length; i++) {
            for (int j = 0; j < assentos[i].length; j++) {
                assentos[i][j] = 'D';
            }
        }
    }
    public void imprimirSessao() {
        System.out.println("\n\n   Escolha a sua poltrona: ");


        System.out.println(ANSI_BLACK + "\n-------------------------------------------");
        System.out.println("           T E L A   D A  S A L A           ");
        System.out.println("-------------------------------------------\n");

        // Cabeçalho das colunas
        System.out.print(ANSI_BLACK + "    ");
        for (int j = 0; j < this.assentos[0].length; j++) {
            System.out.print(String.format("%-4d", j + 1)); // Alinhamento à esquerda
        }
        System.out.println(ANSI_RESET);

        // Exibir filas e assentos
        for (int i = 0; i < this.assentos.length; i++) {
            System.out.print(ANSI_BLACK + String.format("%-4d", (i + 1))); // Alinhamento à esquerda
            for (int j = 0; j < this.assentos[i].length; j++) {
                char estado = assentos[i][j];
                if (estado == 'D') {
                    System.out.print(ANSI_GREEN + "[" + estado + "] " + ANSI_RESET);
                } else if (estado == 'O') {
                    System.out.print(ANSI_BRIGHT_RED + "[" + estado + "] " + ANSI_RESET);
                } else {
                    System.out.print(ANSI_BLACK + "[" + estado + "] " + ANSI_RESET);
                }
            }
            System.out.println();
        }
        System.out.println("\n-------------------------------------------");
    }
    
    public void menuReserva(int index) {

        do {
            Scanner scanner = new Scanner(System.in);
            this.imprimirSessao();
            System.out.println("");
            System.out.println("Digite a fila de (1 a 7): ");
            reservarFila = scanner.nextInt();
            System.out.println("Digite a coluna de (1 a 9): ");
            reservarColuna = scanner.nextInt();
            adquirirIngresso();
            assentoDisponivel(reservarFila, reservarColuna, index);
            break;
        } while (!assentoDisponivel(reservarFila, reservarColuna, index));
    }

    public boolean assentoDisponivel(int fila, int coluna, int i) {

        if (this.assentos[fila - 1][coluna - 1] == 'O') {
            System.out.println("Este assento está ocupado.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return false;
        } else {
            System.out.println("Assento reservado.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.assentos[fila - 1][coluna - 1] = 'O';
            // this.atualizaSessao(i);
            return true;
        }
    }

    public void adquirirIngresso() {
        Scanner scanner = new Scanner(System.in);

        do{
        System.out.print("\nEscolha o tipo de ingresso: 1 - Inteira, 2 - Meia\n");
        System.out.println("Digite a opcão: ");
        tipoIngresso = scanner.nextInt();

        if (tipoIngresso == 1) {
            inteira++;
            tipoIngresso += 1;
        } else if (tipoIngresso == 2) {
            meia++;
            tipoIngresso += 1;
        } else {
            System.out.println("Tipo de ingresso inválido.");
        }
        }while(tipoIngresso != 1 && tipoIngresso != 2);
    }

    public static void historicoIngresso() {
        double totalInteira = inteira * 20.0;
        double totalMeia = meia * 10.0;
        double total = totalInteira + totalMeia;
        int totalIngresso = inteira + meia;

        System.out.println("\n==========================================================");
        System.out.println("|                    RESUMO DA SUA COMPRA                |");
        System.out.println("==========================================================");
        if (inteira + meia == 0) {
            System.out.println("Você não comprou nenhum ingresso.");
        } else {
            System.out.printf("Total de Ingressos Inteiros: %d\n", inteira);
            System.out.printf("Total de Ingressos Meia: %d\n", meia);
            System.out.printf("Total de Ingressos: %d\n", totalIngresso);
            System.out.printf("Total Geral: R$%.2f\n", total);
        }
        System.out.println("==========================================================\n");
    }

}