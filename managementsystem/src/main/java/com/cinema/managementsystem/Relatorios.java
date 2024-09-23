package com.cinema.managementsystem;

import static com.cinema.managementsystem.ConsoleColors.*;
import java.util.HashMap;
import java.util.Map;

public class Relatorios {

    // Gera e exibe o relatório de filme mais vendido
    public static void gerarRelatorioFilmeMaisVendido() {
        String filmeMaisVendido = "O Senhor do POO: As Duas Torres da Herança"; 

        System.out.println(ANSI_BLACK + "\n=======================================================================");
        System.out.println(ANSI_BLACK + "|" + ANSI_BRIGHT_RED + " CINEJAVA" + ANSI_BLACK + " > Relatórios                            | " + ANSI_WHITE_SNOW + " Área do Gerente" + ANSI_BLACK + " |");
        System.out.println(ANSI_BLACK + "-----------------------------------------------------------------------\n" + ANSI_RESET);
        System.out.println("\n                    * RELATÓRIO DE FILME MAIS VENDIDO *                    ");
        System.out.println(ANSI_BLACK + "-------------------------------------------------------------------------------" + ANSI_RESET);
        System.out.format(ANSI_BLACK+"%-30s %-25s\n", "Descrição", "Detalhe"+ANSI_RESET);
        System.out.println(ANSI_BLACK + "------------------------------+------------------------------------------------" + ANSI_RESET);
        System.out.format("%-30s "+ANSI_LIGHT_GREEN+"%-25s\n"+ANSI_RESET, "Filme Mais Vendido", filmeMaisVendido);
        System.out.println(ANSI_BLACK + "------------------------------+------------------------------------------------\n\n" + ANSI_RESET);
    }

    /// Gera e exibe o relatório de faturamento da bomboniere
    public static void gerarRelatorioFaturamentoBomboniere() {
        // Popula dados de faturamento
        Populacao.populaFaturamentoBomboniere();
        
        // Obtém os itens vendidos e o total de faturamento
        Map<String, Integer> itensVendidos = FaturamentoBomboniere.getItensVendidos();
       FaturamentoBomboniere.getTotalFaturamento();

       System.out.println(ANSI_BLACK + "\n=======================================================================");
       System.out.println(ANSI_BLACK + "|" + ANSI_BRIGHT_RED + " CINEJAVA" + ANSI_BLACK + " > Relatórios                            | " + ANSI_WHITE_SNOW + " Área do Gerente" + ANSI_BLACK + " |");
       System.out.println(ANSI_BLACK + "-----------------------------------------------------------------------\n" + ANSI_RESET);
        System.out.println("\n              * RELATÓRIO DO FATURAMENTO DA BOMBONIERE *              ");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.format(ANSI_BLACK+"%-30s %-25s %-10s\n", "Descrição", "Detalhe", "Valor"+ANSI_RESET);
        System.out.println("------------------------------+-------------------------+----------------------");
        
        double totalRelatorio = 0.0;
        boolean itensEncontrados = false;

    // Relação de produtos vendidos
    for (Map.Entry<String, Integer> entry : itensVendidos.entrySet()) {
        String produto = entry.getKey();
        int quantidade = entry.getValue();

        // Verifica se o item existe
        Bomboniere.Item item = Bomboniere.getItem(produto);
        if (item != null) {
            itensEncontrados = true; // Marca que pelo menos um item foi encontrado
            double preco = item.getPreco();
            double totalProduto = preco * quantidade;
            totalRelatorio += totalProduto;
            System.out.format("%-30s %-25s"+ANSI_LIGHT_GREEN+"  R$%.2f\n"+ANSI_RESET, produto, "Qtd: " + quantidade, totalProduto);
        }
    }

    if (!itensEncontrados) {
        System.out.format("%-30s %-34s"+ANSI_BLACK+"R$%.2f\n", ANSI_BRIGHT_RED+"Nenhum item encontrado"+ANSI_RESET, "", 0.00);
        System.out.println();
    } else {
        System.out.println("------------------------------+-------------------------+----------------------");
        System.out.format("%-30s %-25s "+ANSI_LIGHT_GREEN+" R$%.2f\n"+ANSI_RESET, "Total acumulado", "", totalRelatorio);
        System.out.println("------------------------------+-------------------------+----------------------\n\n");
    }
    }

    // Classe interna para gerenciar o faturamento da bomboniere
    public static class FaturamentoBomboniere {
        private static double totalFaturamento = 0.0; // Total acumulado de faturamento
        private static Map<String, Integer> itensVendidos = new HashMap<>(); // Armazena produtos e suas quantidades

        // Atualiza o total de faturamento e registra o item vendido
        public static void adicionarFaturamento(String produto, double valor) {
            totalFaturamento += valor;
            itensVendidos.put(produto, itensVendidos.getOrDefault(produto, 0) + 1);
        }

        // Retorna o total de faturamento
        public static double getTotalFaturamento() {
            return totalFaturamento;
        }

        // Retorna os itens vendidos e suas quantidades
        public static Map<String, Integer> getItensVendidos() {
            return itensVendidos;
        }
    }

    // Gera e exibe o relatório de faturamento total
    public static void gerarRelatorioFaturamentoTotal() {
        // Popula dados de faturamento
        //Populacao.populaFaturamentoBomboniere();
        
        //base formatada
        System.out.println(ANSI_BLACK + "\n=======================================================================");
        System.out.println(ANSI_BLACK + "|" + ANSI_BRIGHT_RED + " CINEJAVA" + ANSI_BLACK + " > Relatórios                            | " + ANSI_WHITE_SNOW + " Área do Gerente" + ANSI_BLACK + " |");
        System.out.println(ANSI_BLACK + "-----------------------------------------------------------------------\n" + ANSI_RESET);
        System.out.println("\n                  * RELATÓRIO DO FATURAMENTO TOTAL *                  ");
        System.out.println(ANSI_BLACK+"-------------------------------------------------------------------------------");
        System.out.format(ANSI_BLACK+"%-30s %-25s %-10s\n", "Descrição", "", "Valor"+ANSI_RESET);
        System.out.println(ANSI_BLACK+"--------------------------------------------------------+----------------------");
        
        System.out.println(ANSI_BLACK+"--------------------------------------------------------+----------------------\n\n");
    }
}
