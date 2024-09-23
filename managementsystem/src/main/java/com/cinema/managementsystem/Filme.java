package com.cinema.managementsystem;

import static com.cinema.managementsystem.ConsoleColors.ANSI_BLACK;
import static com.cinema.managementsystem.ConsoleColors.ANSI_LIGHT_GRAY;
import static com.cinema.managementsystem.ConsoleColors.ANSI_RESET;

public class Filme {

    // Enum para representar categorias de filmes
    public enum Categoria {
        ACAO, COMEDIA, DRAMA, FICCAO_CIENTIFICA, SUSPENSE, AVENTURA, ANIMACAO, TERROR, ROMANCE
    }

    // Atributos do filme
    private String titulo;
    private String descricao;
    private double precoMeia;
    private double precoInteira;
    private int duracao; // em minutos
    private Categoria categoria;

    // Construtor
    public Filme(String titulo, String descricao, double precoMeia, double precoInteira, int duracao, Categoria categoria) {
        //this.titulo = titulo;
        this.descricao = descricao;
        this.precoMeia = precoMeia;
        this.precoInteira = precoInteira;
        this.duracao = duracao;
        this.categoria = categoria;
    }

    // Getters e Setters

    // TÍTULO
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // DESCRIÇÃO
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // PREÇO MEIA-ENTRADA
    public double getPrecoMeia() {
        return precoMeia;
    }

    public void setPrecoMeia(double precoMeia) {
        this.precoMeia = precoMeia;
    }

    // PREÇO INTEIRA
    public double getPrecoInteira() {
        return precoInteira;
    }

    public void setPrecoInteira(double precoInteira) {
        this.precoInteira = precoInteira;
    }

    // DURAÇÃO
    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    // CATEGORIA
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // Método para exibir informações completas
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço Meia-Entrada: R$ " + precoMeia);
        System.out.println("Preço Inteira: R$ " + precoInteira);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Categoria: " + categoria);
    } 

    public static void populareListarFilmes(){
       
        Filme filme1 = new Filme("Ação Explosiva", "Uma aventura repleta de ação.", 10.0, 20.0, 120, Categoria.ACAO);
        filme1.setTitulo("Ação explosiva");
        filme1.setDescricao("Uma aventura repleta de ação.");
        filme1.setPrecoMeia(10);
        filme1.setPrecoInteira(20);
        filme1.setDuracao(120);
        
        Filme filme2 = new Filme("Comédia Divertida", "Uma comédia que vai te fazer rir.", 10.0, 20.0, 90, Categoria.COMEDIA);
        filme2.setTitulo("Comédiao Divertida");
        filme2.setDescricao("Uma comédia que vai te fazer rir.");
        filme2.setPrecoMeia(10);
        filme2.setPrecoInteira(20);
        filme2.setDuracao(90);
       
        Filme filme3 = new Filme("Drama Emocionante", "Um drama que toca o coração.", 10, 20, 110, Categoria.DRAMA);
        filme3.setTitulo("Drama Emocionante");
        filme3.setDescricao("Um drama que toca o coração.");
        filme3.setPrecoMeia(10);
        filme3.setPrecoInteira(20);
        filme3.setDuracao(110);

        Filme filme4 = new Filme("Ficção Espacial", "Uma jornada pelo cosmos.", 10, 20, 130, Categoria.FICCAO_CIENTIFICA);
        filme4.setTitulo("Ficção Espacial");
        filme4.setDescricao("Uma jornada pelo cosmos.");
        filme4.setPrecoMeia(10);
        filme4.setPrecoInteira(20);
        filme4.setDuracao(130);
        
        Filme filme5 = new Filme("Suspense Intrigante", "Um mistério que mantém você na ponta da cadeira.", 10, 20, 105, Categoria.SUSPENSE);
        filme5.setTitulo("Suspense Intrigante");
        filme5.setDescricao("Um mistério que mantém você na ponta da cadeira.");
        filme5.setPrecoMeia(10);
        filme5.setPrecoInteira(20);
        filme5.setDuracao(105);
        
        Filme filme6 = new Filme("Aventura Épica", "Uma aventura cheia de emoção e perigos.", 10, 20, 140, Categoria.AVENTURA);
        filme6.setTitulo("Aventura Épica");
        filme6.setDescricao("Uma aventura cheia de emoção e perigos.");
        filme6.setPrecoMeia(10);
        filme6.setPrecoInteira(20);
        filme6.setDuracao(140);
        
        Filme filme7 = new Filme("Animação Fantástica", "Uma animação encantadora para toda a família.", 10, 20, 85, Categoria.ANIMACAO);
        filme7.setTitulo("Animação Fantástica");
        filme7.setDescricao("Uma animação encantadora para toda a família.");
        filme7.setPrecoMeia(10);
        filme7.setPrecoInteira(20);
        filme7.setDuracao(85);
        
        Filme filme8 = new Filme("Terror Sobrenatural", "Um terror que vai te deixar sem dormir.", 10, 20, 100, Categoria.TERROR);
        filme8.setTitulo("Terror Sobrenatural");
        filme8.setDescricao("Um terror que vai te deixar sem dormir.");
        filme8.setPrecoMeia(10);
        filme8.setPrecoInteira(20);
        filme8.setDuracao(100);
        
        Filme filme9 = new Filme("Romance Encantador", "Uma história de amor que emociona.", 10.0, 20.0, 95, Categoria.ROMANCE);
        filme9.setTitulo("Romance Encantador");
        filme9.setDescricao("Uma história de amor que emociona.");
        filme9.setPrecoMeia(10);
        filme9.setPrecoInteira(20);
        filme9.setDuracao(95);        
        
        /*System.out.println("1 - ");
        System.out.println("2 - "+filme2.getTitulo());
        System.out.println("3 - "+filme3.getTitulo());
        System.out.println("4 - "+filme4.getTitulo());
        System.out.println("5 - "+filme5.getTitulo());
        System.out.println("6 - "+filme6.getTitulo());
        System.out.println("7 - "+filme7.getTitulo());
        System.out.println("8 - "+filme8.getTitulo()); 
        System.out.println("0 - "); */
        
        System.out.println(ANSI_BLACK+"    _________________________________");
        System.out.println(ANSI_BLACK+"   |________"+ANSI_RESET+"FILMES EM CARTAZ"+ANSI_BLACK+"_________|");
        System.out.println(ANSI_BLACK+"   |                                 |");
        System.out.println(ANSI_BLACK+"   |   "+ANSI_LIGHT_GRAY+"(1) "+ANSI_RESET+filme1.getTitulo()+ANSI_BLACK+"            |"); 
        System.out.println(ANSI_BLACK+"   |   "+ANSI_LIGHT_GRAY+"(2) "+ANSI_RESET+filme2.getTitulo()+ANSI_BLACK+"        |");
        System.out.println(ANSI_BLACK+"   |   "+ANSI_LIGHT_GRAY+"(3) "+ANSI_RESET+filme3.getTitulo()+ANSI_BLACK+"         |");
        System.out.println(ANSI_BLACK+"   |   "+ANSI_LIGHT_GRAY+"(4) "+ANSI_RESET+filme4.getTitulo()+ANSI_BLACK+"           |");
        System.out.println(ANSI_BLACK+"   |   "+ANSI_LIGHT_GRAY+"(5) "+ANSI_RESET+filme5.getTitulo()+ANSI_BLACK+"       |");
        System.out.println(ANSI_BLACK+"   |   "+ANSI_LIGHT_GRAY+"(6) "+ANSI_RESET+filme6.getTitulo()+ANSI_BLACK+"            |");
        System.out.println(ANSI_BLACK+"   |   "+ANSI_LIGHT_GRAY+"(7) "+ANSI_RESET+filme7.getTitulo()+ANSI_BLACK+"       |");
        System.out.println(ANSI_BLACK+"   |   "+ANSI_LIGHT_GRAY+"(8) "+ANSI_RESET+filme8.getTitulo()+ANSI_BLACK+"       |");
        System.out.println(ANSI_BLACK+"   |                                 |");
        System.out.println(ANSI_BLACK+"   |   "+ANSI_LIGHT_GRAY+"(0) "+ANSI_RESET+" Sair"+ANSI_BLACK+"                     |");
        System.out.println(ANSI_BLACK+"   |_________________________________|"+ANSI_RESET);
    }
}
