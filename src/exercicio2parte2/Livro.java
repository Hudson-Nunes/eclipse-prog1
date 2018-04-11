package exercicio2parte2;

public class Livro
{

    private int anoPublicaçao;
    private String autor;
    private double preçoVenda;
    
    public Livro(int anoPublicaçao, String autor, double preçoVenda)
    {
        this.anoPublicaçao = anoPublicaçao;
        this.autor = autor;
        this.preçoVenda = preçoVenda;
    }

    public int getAnoPublicaçao()
    {
        return anoPublicaçao;
    }
    
    public String getAutor()
    {
        return autor;
    }
    
    public double getPreçoVenda()
    {
        return preçoVenda;
    }
    
    public void setAnoPublicaçao(int anoPublicaçao)
    {
        this.anoPublicaçao = anoPublicaçao;
    }
    
    public void setAutor(String autor)
    {
        this.autor = autor;
    }
    
    public void setPreçoVenda(double preçoVenda)
    {
        this.preçoVenda = preçoVenda;
    }
    
    public void imprimeInformacoes()
    {
        System.out.println("ano de publicação: " + anoPublicaçao);
        System.out.println("autor: " + autor);
        System.out.println("preço de venda: " + preçoVenda);
    }
    
}
