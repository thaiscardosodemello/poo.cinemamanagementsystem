package com.cinema.managementsystem;

import static com.cinema.managementsystem.ConsoleColors.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Bomboniere {

    // Item (nome+produto) na bomboniere
    public static class Item {
        private String nomeProduto;
        private double precoProduto;

        // Construtor
        public Item(String nomeProduto, double precoProduto) {
            this.nomeProduto = nomeProduto;  
            this.precoProduto = precoProduto; 
        }

        // Getters
        public String getNome() {
            return nomeProduto;
        }
        public double getPreco() {
            return precoProduto;
        }

        // Formata a impressão no console
        @Override
        public String toString() {
            return String.format("%-35s " + ANSI_GREEN + "R$%.2f" + ANSI_RESET, nomeProduto, precoProduto); 
        }
    }

    // Array de itens disponíveis
    private static Item[] itens = {
        new Item("Pipoca", 15.00),
        new Item("Refrigerante", 10.00),
        new Item("[Combo] Pipoca + Refri", 22.00)
    };

    // Getters
    public static Item[] getItens() {
        return itens;
    }

    // Retorna um item específico baseado no nome
    public static Item getItem(String nome) {
        for (Item item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                return item;
            }
        }
        return null; // Retorna nulo se o item não for encontrado
    }

    // Menu da bomboniere
    private static void menuBomboniere() {
        Scanner scanner = new Scanner(System.in);
        List<Item> itensComprados = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println(ANSI_BLACK + "\n=======================================================================");
            System.out.println(ANSI_BLACK + "|" + ANSI_BRIGHT_RED + " CINEJAVA" + ANSI_BLACK + " > Bomboniere                            | " + ANSI_WHITE_SNOW + " Área do Cliente" + ANSI_BLACK + " |");
            System.out.println(ANSI_BLACK + "-----------------------------------------------------------------------\n" + ANSI_RESET);
            System.out.println("   Qual o seu pedido?\n");
            
            // Lista os itens disponíveis
            for (int i = 0; i < itens.length; i++) {
                System.out.println("   (" + (i + 1) + ") " + itens[i]);
            }

            System.out.println("\n   (0) Finalizar compra e voltar ao menu do cliente\n");
            System.out.println(ANSI_BLACK + "-----------------------------------------------------------------------\n" + ANSI_RESET);
            System.out.print("Digite o número do item que deseja comprar: ");
            System.out.flush();//garante que o que foi impresso anteriormente seja exibido no console

            try {
                int escolha = Integer.parseInt(scanner.nextLine());
                if (escolha == 0) {
                    finalizarCompra(itensComprados);
                    continuar = false; // Encerra o loop se o usuário optar por finalizar a compra
                } else {
                    processarEscolha(escolha, itensComprados);

                    // Pergunta se o usuário deseja adicionar mais itens
                    if (escolha > 0 && escolha <= itens.length) {
                        System.out.print("\nDeseja adicionar mais itens? (s/n): ");
                        String resposta = scanner.nextLine().trim().toLowerCase();

                        if (!resposta.equals("s")) {
                            finalizarCompra(itensComprados);
                            continuar = false; // Encerra o loop se o usuário não quiser adicionar mais itens
                        }
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println(ANSI_RED_RUBY + "\n>> Entrada inválida! Por favor, insira apenas números." + ANSI_RESET);
            }
        }
    }

    // Processa a escolha do usuário e adiciona o item selecionado à lista de comprados
    private static void processarEscolha(int escolha, List<Item> itensComprados) {
        if (escolha > 0 && escolha <= itens.length) {
            Item itemSelecionado = itens[escolha - 1];
            if (itemSelecionado != null) {  // Verifica se o item não é nulo
                itensComprados.add(itemSelecionado);
                System.out.println("\nVocê adicionou: \n>> " + ANSI_GREEN + itemSelecionado + ANSI_RESET);
                // Atualiza o faturamento da bomboniere
                Relatorios.FaturamentoBomboniere.adicionarFaturamento(itemSelecionado.getNome(), itemSelecionado.getPreco());
            } else {
                System.out.println("\nItem selecionado não está disponível.");
            }
        } else {
            System.out.println(ANSI_RED_RUBY + "\nEscolha inválida. Por favor, tente novamente!" + ANSI_RESET);
        }
    }

    // Finaliza a compra apresentando o resumo dos itens
    static void finalizarCompra(List<Item> itensComprados) {
        if (itensComprados.isEmpty()) {
            System.out.println("\n>> Você não comprou nenhum item.");
        } else {
            System.out.println(ANSI_LIGHT_BLUE + "\n==========================================================");
            System.out.println("                    RESUMO DA SUA COMPRA                    ");
            System.out.println("----------------------------------------------------------\n");
            double total = 0.0;
            // Exibe cada item comprado e calcula o total
            for (Item item : itensComprados) {
                System.out.println(ANSI_LIGHT_BLUE + "   " + item);
                total += item.getPreco();
            }
            System.out.println(ANSI_LIGHT_BLUE + "----------------------------------------------------------");
            System.out.printf(ANSI_LIGHT_BLUE + "   Total:                              R$%.2f\n", total);
            System.out.println(ANSI_LIGHT_BLUE + "==========================================================\n" + ANSI_RESET);

            // Adiciona o total da compra ao faturamento da bomboniere
            Relatorios.FaturamentoBomboniere.adicionarFaturamento("Total Compra", total);

            // Mensagem de retirada do produto
            System.out.println(ANSI_GREEN + "\n>> Sua compra foi finalizada. \n>> Por favor, retire seu(s) produto(s) na Bomboniere.\n" + ANSI_RESET);
        }
        // Retorna ao menu do cliente
        //Menu.menuCliente();
    }

    // Método principal para gerenciar a compra de itens na bomboniere
    public static void compraBomboniere() {
        menuBomboniere(); // Chama o menu da bomboniere
    }
}
