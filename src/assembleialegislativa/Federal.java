package assembleialegislativa;

public class Federal extends Deputado
{   
    private int numeroCadastro;

    public Federal(String nome, String partido, double salarioBruto, double salarioLiquido, int quantFuncionarios, int numeroCadastro)
    {
        super(nome, partido, salarioBruto, salarioLiquido, quantFuncionarios);
        this.numeroCadastro = numeroCadastro;
    }

    public int getNumeroCadastro()
    {
        return numeroCadastro;
    }
    
    public void setNumeroCadastro(int numCadastro)
    {
        this.numeroCadastro = numCadastro;
    }

}
