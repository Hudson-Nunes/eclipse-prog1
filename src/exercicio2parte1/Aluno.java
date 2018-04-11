package exercicio2parte1;

public class Aluno
{
    private String nome;
    private int matricula;
    private double grauA, grauB;

    public Aluno(String nome, int matricula, double grauA, double grauB)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.grauA = grauA;
        this.grauB = grauB;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public int getMatricula()
    {
        return matricula;
    }
    
    public double getGrauA()
    {
        return grauA;
    }
    
    public double getGrauB()
    {
        return grauB;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }
    
    public void setGrauA(double grauA)
    {
        this.grauA = grauA;
    }
    
    public void setGrauB(double grauB)
    {
        this.grauB = grauB;
    }
    
    public double calculaMediaFinal()
    {    
        return (grauA * 0.33) + (grauB * 0.67);
    }
    
    public void imprimeInfo()
    {
        System.out.println("nome do aluno: " + nome);
        System.out.println("matrícula: " + matricula);
        System.out.println("nota do grau A: " + grauA);
        System.out.println("nota do grau B: " + grauB);
        System.out.printf("média final: %.2f ", calculaMediaFinal());
        System.out.println();
    }
    
}
