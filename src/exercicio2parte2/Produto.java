package exercicio2parte2;

public class Produto
{
    
    private String nome;
    private double preço;
    private int quantidadeEstoque;

    public Produto(String nome, double preço, int quantidadeEstoque)
    {
        this.nome = nome;
        this.preço = preço;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome()
    {
        return nome;
    }
    
    public double getPreço()
    {
        return preço;
    }
    
    public int getQuantidadeEstoque()
    {
        return quantidadeEstoque;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setPreço(double preço)
    {
        this.preço = preço;
    }
    
    public void setQuantidadeEstoque(int quantidadeEstoque)
    {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public void imprimeInformacoes()
    {
        System.out.println("nome do produto: " + nome);
        System.out.println("preço do produto: " + preço);
        System.out.println("quantidade em estoque: " + quantidadeEstoque);
        System.out.println();
    }
    
}
