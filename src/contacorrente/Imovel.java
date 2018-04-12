package contacorrente;
import teclado.Teclado;

public class Imovel
{
    
    private String endereço;
    double valorVenda, valorAluguel;

    public Imovel(String endereço)
    {
        this.endereço = endereço;
    }

    public Imovel(String endereço, double valorVenda)
    {
        this.endereço = endereço;
        this.valorVenda = valorVenda;
    }
    
    public Imovel(String endereço, double valorVenda, double valorAluguel)
    {
        this.endereço = endereço;
        this.valorVenda = valorVenda;
        this.valorAluguel = valorAluguel;
    }
    
    public String getEndereço()
    {
        return endereço;
    }
    
    public double getValorVenda()
    {
        return valorVenda;
    }
    
    public double getValorAluguel()
    {
        return valorAluguel;
    }
    
    public void setEndereço(String endereço)
    {
        this.endereço = endereço;
    }
    
    public void setValorVenda(double valorVenda)
    {
        this.valorVenda = valorVenda;
    }
    
    public void setValorAluguel(double valorAluguel)
    {
        this.valorAluguel = valorAluguel;
    }
    
    public void imprimeInfo()
    {
        System.out.println();
        System.out.println("Endereço do imóvel: " + endereço);
        System.out.println("Valor de venda: " + valorVenda);
        System.out.println("Valor de aluguel: "+ valorAluguel);
    }
    
    public void calculaImposto()
    {
        if(Teclado.leInt("digite 1 para novo e 2 para velho: " ) == 1) {
                System.out.print("O valor do imposto de venda do imóvel é de: " + valorVenda * 0.15);   
        }else {                
                System.out.print("O valor do imposto de venda do imóvel é de: " + valorAluguel * 0.10);
        }
    }
    
}
