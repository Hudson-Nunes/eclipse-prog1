package exercicio2parte2;
import teclado.Teclado;

public class Principal
{
    public static void main(String[] args)
    {
        // a) crie os produtos
        Produto batata = new Produto("Batata doce", 10.90, 100);
        Produto dvd = new Produto("DVD Banda Calipso", 0.01, 1000);
        Produto livroJava = new Produto("Livro de Java", 180.56, 84);
        
        // b) imprima as informações dos produtos
        batata.imprimeInformacoes();
        dvd.imprimeInformacoes();
        livroJava.imprimeInformacoes();
        
        // c) altera o preço do dvd
        dvd.setPreço(0);
        
        // d) imprima apenas o nome e o preço do dvd
        System.out.println("nome do produto: " + dvd.getNome());
        System.out.printf("preço do produto: %.2f", dvd.getPreço());
        System.out.println();
        
        // e) cria 3 animais com as informações sendo solicitadas pelo teclado (mínimo de 2 patas)

        String nome, raça;
        char sexo;
        int quantidadePatas = 0;
                
        do {
            System.out.println();
            nome = Teclado.leString("digite o nome do animal 1: ");
            raça = Teclado.leString("digite a raça do animal 1: ");
            sexo = Teclado.leChar("digite o sexo do animal 1: ");
            quantidadePatas = Teclado.leInt("digite o número de patas do animal 1: ");
        }while(quantidadePatas < 2);
        
        Animal animal1 = new Animal(nome, raça, sexo, quantidadePatas);
        
        do {
            System.out.println();
            nome = Teclado.leString("digite o nome do animal 2: ");
            raça = Teclado.leString("digite a raça do animal 2: ");
            sexo = Teclado.leChar("digite o sexo do animal 2: ");
            quantidadePatas = Teclado.leInt("digite o número de patas do animal 2: ");
        }while(quantidadePatas < 2);
        
        Animal animal2 = new Animal(nome, raça, sexo, quantidadePatas);
        
        do {
            System.out.println();
            nome = Teclado.leString("digite o nome do animal 3: ");
            raça = Teclado.leString("digite a raça do animal 3: ");
            sexo = Teclado.leChar("digite o sexo do animal 3: ");
            quantidadePatas = Teclado.leInt("digite o número de patas do animal 3: ");
        }while(quantidadePatas < 2);
        
        Animal animal3 = new Animal(nome, raça, sexo, quantidadePatas);
        
        // f) imprima as informações dos animais
        System.out.println();
        animal1.imprimeInformacoes();
        animal2.imprimeInformacoes();
        animal3.imprimeInformacoes();
        
        // g) cria um livro com informações vindas do teclado
        System.out.println();
        Livro livro1 = new Livro(Teclado.leInt("ano de publicação: "), Teclado.leString("autor: "), Teclado.leDouble("preço de venda: "));
        
        // h) imprima as informações do livro
        System.out.println();
        livro1.imprimeInformacoes();
        
        // i)    
        Exercicios e = new Exercicios();
        
        // j) invoca todos os métodos que existem no objeto tipo exercicios
        System.out.println();
        e.imprimeValores(-9);
        System.out.println();
        System.out.println(e.maiorValorDoisValores(4.5, 8.7));
        System.out.println();
        System.out.println(e.maiorValorTresValores(2.1, 13.5, 7.9));
        System.out.println();
        System.out.println(e.verificaPositivo(99));
        System.out.println();
        System.out.println(e.calculaFatorial(5));
        System.out.println();
        System.out.println(e.mediaValores(3));
    }
    
}
