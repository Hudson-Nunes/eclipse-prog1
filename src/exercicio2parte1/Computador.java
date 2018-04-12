package exercicio2parte1;

public class Computador
{
    private double preco;
    private String marca;
    private int anoFabrica;
    private boolean novo;

    public Computador(double preco, String marca, int anoFabrica, boolean novo)
    {
        this.preco = preco;
        this.marca = marca;
        this.anoFabrica = anoFabrica;
        this.novo = novo;
    }

    public double getPreco()
    {
        return preco;
    }
    
    public String getMarca()
    {
        return marca;
    }
    
    public int getAnoFabrica()
    {
        return anoFabrica;
    }
    
    public boolean getNovo()
    {
        return novo;
    }
    
    public void setPreco(double preco)
    {
        this.preco = preco;
    }
    
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    public void setAnoFabrica(int anoFabrica)
    {
        this.anoFabrica = anoFabrica;
    }
    
    public void setNovo(boolean novo)
    {
        this.novo = novo;
    }
    
    public void imprimeInfo()
    {
        System.out.println("preço:" + preco);
        System.out.println("marca:" + marca);
        System.out.println("ano de fabricação:" + anoFabrica);
        System.out.println("novo:" + novo);
    }
    
}