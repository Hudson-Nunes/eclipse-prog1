package pedrapapeltesouraspock;

public class Jogador
{

    private int quantidadePontos;
    private String nome;
    
    public Jogador(String nome)
    {
        this.nome = nome;
    }
    
    public Jogador(int quantidadePontos, String nome)
    {
        this.quantidadePontos = quantidadePontos;
        this.nome = nome;
    }

    public int getQuantidadePontos()
    {
        return quantidadePontos;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void setQuantidadePontos(int quantidadePontos)
    {
        this.quantidadePontos = quantidadePontos;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public boolean digitaCorreto(String jogada)
    {
        if(jogada.equalsIgnoreCase("pedra") || jogada.equalsIgnoreCase("papel") || jogada.equalsIgnoreCase("tesoura") || jogada.equalsIgnoreCase("lagarto") || jogada.equalsIgnoreCase("spock")) {
            return true;
        }else {
            return false;
        }
    }
    
    //public void verificaGanha(String jogada1, String jogada2){  
    //}
    
}