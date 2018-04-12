package assembleialegislativa;

public class Estadual extends Deputado
{
    private String estado;

    public Estadual(String nome, String partido, double salarioBruto, double salarioLiquido, int quantFuncionarios, String estado)
    {
        super(nome, partido, salarioBruto, salarioLiquido, quantFuncionarios);
        this.estado = estado;
    }

    public String getEstado()
    {
        return estado;
    }
    
    public void setEstado(String estado)
    {
       this.estado = estado;
    }
    
}
