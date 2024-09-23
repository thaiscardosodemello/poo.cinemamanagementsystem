package com.cinema.managementsystem;

import static com.cinema.managementsystem.ConsoleColors.*;
import com.cinema.managementsystem.Filme.Categoria;

public class Populacao {

    // Popula os dados de faturamento da bomboniere
    public static void populaFaturamentoBomboniere() {
        Relatorios.FaturamentoBomboniere.adicionarFaturamento("Pipoca", 15.00); 
        Relatorios.FaturamentoBomboniere.adicionarFaturamento("Refrigerante", 10.00); 
        Relatorios.FaturamentoBomboniere.adicionarFaturamento("[Combo] Pipoca + Refri", 22.00); 
    }

    public static void popularClienteGerente(){
        Gerente g1 = new Gerente("Felipe Gonçalves", "111.222.333-44");
        g1.setLogin("felipe.gt@gmail.com");
        g1.setSenha("felipe1234");
        g1.setEmail("felipe.gt@gmail.com");
        g1.setTelefone("12345-6789");
        Usuario.usuarios.add(g1);

        Gerente g2 = new Gerente("Eduardo Felipe", "555.666.777-88");
        g2.setLogin("edufilipe.gt@gmail.com");
        g2.setSenha("edu2245");
        g2.setEmail("edufilipe.gt@gmail.com");
        g2.setTelefone("98765-4321");
        Usuario.usuarios.add(g2);

        Cliente c1 = new Cliente("Larissa", "123.456.789-00");
        c1.setLogin("larissanunciacao.ct@gmail.com");
        c1.setSenha("lari2027");
        c1.setEmail("larissanunciacao.ct@gmail.com");
        c1.setTelefone("12345-6789");
        Usuario.usuarios.add(c1);

        Cliente c2 = new Cliente("Thais Cardoso", "987.654.321-00");
        c2.setLogin("thaiscdo.ct@gmail.com");
        c2.setSenha("thais27");
        c2.setEmail("thaiscdo.ct@gmail.com");
        c2.setTelefone("98765-4321");
        Usuario.usuarios.add(c2);
    }

    public static void populaFilme() {
        listaFilmes.add(new Filme("Mad Max: Estrutura da Fúria", "Uma aventura pós-apocalíptica cheia de ação.", 10.0, 20.0, 120, Categoria.ACAO));
        listaFilmes.add(new Filme("As Branquelas: Exceção Não Tratada", "Duas agentes disfarçadas em uma comédia hilariante.", 8.0, 16.0, 90, Categoria.COMEDIA));
        listaFilmes.add(new Filme("A Espera de um Milagre: Método Infinito", "Um drama tocante sobre redenção.", 12.0, 24.0, 110, Categoria.DRAMA));
        listaFilmes.add(new Filme("Interestelar: Viagem ao Infinito", "Uma jornada épica através do espaço e do tempo.", 11.0, 22.0, 130, Categoria.FICCAO_CIENTIFICA));
        listaFilmes.add(new Filme("Garota Exemplar: Busca Incessante", "Um suspense psicológico que mantém você preso até o fim.", 9.0, 18.0, 105, Categoria.SUSPENSE));
        listaFilmes.add(new Filme("Jumanji: A Aventura Infinita", "Uma emocionante aventura em um jogo que nunca acaba.", 13.0, 26.0, 140, Categoria.AVENTURA));
        listaFilmes.add(new Filme("Toy Story: Vida de Objeto", "Uma animação encantadora sobre a vida dos brinquedos.", 7.0, 14.0, 85, Categoria.ANIMACAO));
        listaFilmes.add(new Filme("O Exorcista: Exceção Sobrenatural", "Um terror que vai te deixar sem dormir.", 14.0, 28.0, 100, Categoria.TERROR));
        listaFilmes.add(new Filme("Titanic: A Memória que Afunda", "Uma história de amor trágica que emociona.", 10.0, 20.0, 95, Categoria.ROMANCE));
    }
    
    public static void populaFilme(){
       
        Filme filme1 = new Filme("Mad Max: Estrutura da Fúria", "Uma aventura pós-apocalíptica cheia de ação.", 10.0, 20.0, 120, Categoria.ACAO);
        filme1.setTitulo("Java Max: Estrutura da Fúria");
        filme1.setDescricao("Uma aventura que ignora todos os princípios SOLID.");
        filme1.setPrecoMeia(10);
        filme1.setPrecoInteira(20);
        filme1.setDuracao(120); // Duração de um loop infinito

        Filme filme2 = new Filme("As Branquelas: Exceção Não Tratada", "Duas agentes disfarçadas em uma comédia hilariante.", 8.0, 16.0, 90, Categoria.COMEDIA);
        filme2.setTitulo("As Branquelas: Exceção Não Tratada");
        filme2.setDescricao("Um código de disfarce que gera exceções de riso.");
        filme2.setPrecoMeia(8);
        filme2.setPrecoInteira(16);
        filme2.setDuracao(90); // Menos tempo que uma chamada de método mal escrito

        Filme filme3 = new Filme("A Espera de um Milagre: Método Infinito", "Um drama tocante sobre redenção.", 12.0, 24.0, 110, Categoria.DRAMA);
        filme3.setTitulo("A Espera de um Milagre: Método Infinito");
        filme3.setDescricao("Um try-catch que nunca termina.");
        filme3.setPrecoMeia(12);
        filme3.setPrecoInteira(24);
        filme3.setDuracao(110); // Tempo de execução de uma instância sem GC

        Filme filme4 = new Filme("Interestelar: Viagem ao Infinito", "Uma jornada épica através do espaço e do tempo.", 11.0, 22.0, 130, Categoria.FICCAO_CIENTIFICA);
        filme4.setTitulo("Interestelar: Viagem ao Infinito");
        filme4.setDescricao("Referências de tempo que desafiam o polimorfismo.");
        filme4.setPrecoMeia(11);
        filme4.setPrecoInteira(22);
        filme4.setDuracao(130); // O tempo de um loop aninhado

        Filme filme5 = new Filme("Garota Exemplar: Busca Incessante", "Um suspense psicológico que mantém você preso até o fim.", 9.0, 18.0, 105, Categoria.SUSPENSE);
        filme5.setTitulo("Garota Exemplar: Busca Incessante");
        filme5.setDescricao("Um algoritmo de busca que nunca cessa.");
        filme5.setPrecoMeia(9);
        filme5.setPrecoInteira(18);
        filme5.setDuracao(105); // Mais suspense que um deadlock

        Filme filme6 = new Filme("Jumanji: A Aventura Infinita", "Uma emocionante aventura em um jogo que nunca acaba.", 13.0, 26.0, 140, Categoria.AVENTURA);
        filme6.setTitulo("Jumanji: A Aventura Infinita");
        filme6.setDescricao("Um jogo de tabuleiro que redefine a lógica da programação.");
        filme6.setPrecoMeia(13);
        filme6.setPrecoInteira(26);
        filme6.setDuracao(140); // Duração de um método em loop aninhado

        Filme filme7 = new Filme("Toy Story: Vida de Objeto", "Uma animação encantadora sobre a vida dos brinquedos.", 7.0, 14.0, 85, Categoria.ANIMACAO);
        filme7.setTitulo("Toy Story: Vida de Objeto");
        filme7.setDescricao("Os brinquedos que têm mais métodos que um objeto.");
        filme7.setPrecoMeia(7);
        filme7.setPrecoInteira(14);
        filme7.setDuracao(85); // O tempo de execução de um método que nunca para de rodar

        Filme filme8 = new Filme("O Exorcista: Exceção Sobrenatural", "Um terror que vai te deixar sem dormir.", 14.0, 28.0, 100, Categoria.TERROR);
        filme8.setTitulo("O Exorcista: Exceção Sobrenatural");
        filme8.setDescricao("Um evento de exceção que não pode ser tratado.");
        filme8.setPrecoMeia(14);
        filme8.setPrecoInteira(28);
        filme8.setDuracao(100); // O tempo que leva para depurar um código quebrado

        Filme filme9 = new Filme("Titanic: A Memória que Afunda", "Uma história de amor trágica que emociona.", 10.0, 20.0, 95, Categoria.ROMANCE);
        filme9.setTitulo("Titanic: A Memória que Afunda");
        filme9.setDescricao("Um relacionamento que afunda em um overload de memória.");
        filme9.setPrecoMeia(10);
        filme9.setPrecoInteira(20);
        filme9.setDuracao(95); // Mais curto que um método estático

    }
    public static void popularSessoes(){
        Sessao sessao1 = new Sessao(7, 9);
        Sessao.sessoes.add(sessao1);
        Sessao sessao2 = new Sessao(7, 9);
        Sessao.sessoes.add(sessao2);
        Sessao sessao3 = new Sessao(7, 9);
        Sessao.sessoes.add(sessao3);
        Sessao sessao4 = new Sessao(7, 9);
        Sessao.sessoes.add(sessao4);
        Sessao sessao5 = new Sessao(7, 9);
        Sessao.sessoes.add(sessao5);
        Sessao sessao6 = new Sessao(7, 9);
        Sessao.sessoes.add(sessao6);
        Sessao sessao7 = new Sessao(7, 9);
        Sessao.sessoes.add(sessao7);
        Sessao sessao8 = new Sessao(7, 9);
        Sessao.sessoes.add(sessao8);
    }
}
