package assembleialegislativa;

public class Deputado
{
    private String nome, partido;
    private double salarioLiquido, salarioBruto;
    private Funcionario[] funcionarios;
    int quantFuncionarios;

    public Deputado(String nome, String partido, double salarioBruto, double salarioLiquido, int quantFuncionarios)
    {
        this.nome = nome;
        this.partido = partido;
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
        this.funcionarios = new Funcionario[quantFuncionarios];
    }

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getPartido() 
	{
		return partido;
	}

	public void setPartido(String partido) 
	{
		this.partido = partido;
	}

	public double getSalarioLiquido() 
	{
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) 
	{
		this.salarioLiquido = salarioLiquido;
	}

	public double getSalarioBruto() 
	{
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) 
	{
		this.salarioBruto = salarioBruto;
	}

	public Funcionario[] getFuncionarios() 
	{
		return funcionarios;
	}

	public void setFuncionarios(Funcionario[] funcionarios) 
	{
		this.funcionarios = funcionarios;
	}
    
}
