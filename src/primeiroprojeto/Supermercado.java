package primeiroprojeto;

public class Supermercado
{
    private String nome;
    private double faturamentoAno;
    private int quantLojas, quantFuncionarios;
    
    private Supermercado(String nome, double faturamentoAno, int quantLojas, int quantFuncionarios)
    {
        this.nome = nome;
        this.faturamentoAno = faturamentoAno;
        this.quantLojas = quantLojas;
        this.quantFuncionarios = quantFuncionarios;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public double getFaturamentoAno()
    {
        return faturamentoAno;
    }
    
    public int getQuantLojas()
    {
        return quantLojas;
    }
     
    public int getQuantFuncionarios()
    {
        return quantFuncionarios;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setFaturamentoAno(double faturamentoAno)
    {
        this.faturamentoAno = faturamentoAno;
    }
    
    public void setQuantLojas(int quantLojas)
    {
        this.quantLojas = quantLojas;
    }
    
    public void setQuantFuncionarios(int quantFuncionarios)
    {
        this.quantFuncionarios = quantFuncionarios;
    }
    
}