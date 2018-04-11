package primeiroprojeto;

public class Funcionario
{
    private String nome, alocacao, matricula;
    private double salario, cargaHoraria;
    private boolean feliz;
    
    public Funcionario(String nome, String alocacao, String matricula, double salario, double cargaHoraria, boolean feliz)
    {
        this.nome = nome; 
        this.alocacao = alocacao;
        this.matricula = matricula;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.feliz = feliz;                   
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public String getAlocacao()
    {
        return alocacao;
    }
    
    public String getMatricula()
    {
        return matricula;
    }
    
    public double getSalario()
    {
        return salario;
    }
    
    public double getCargaHoraria()
    {
        return cargaHoraria;
    }
    
    public boolean isFeliz()
    {
        return feliz;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setAlocacao(String alocacao)
    {
        this.alocacao = alocacao;
    }
    
    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }
    
    public void setSalario(double salario)
    {
        this.salario = salario;
    }
    
    public void setCargaHoraria(double cargaHoraria)
    {
        this.cargaHoraria = cargaHoraria;
    }
    
    public void setFeliz(boolean feliz)
    {
        this.feliz = feliz;
    }
    
}