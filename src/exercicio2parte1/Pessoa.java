package exercicio2parte1;

public class Pessoa
{
    private int idade;
    private String nome;
    private char sexo;

    public Pessoa(int idade, String nome, char sexo)
    {
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
    }

    public int getIdade()
    {
        return idade;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public char getSexo()
    {
        return sexo;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }
    
    public void imprimeInfo()
    {
        System.out.println("idade:" + idade);
        System.out.println("nome:" + nome);
        System.out.println("sexo:" + sexo);
    }
    
    public void aumentaIdade()
    {
        idade++;
    }

}
