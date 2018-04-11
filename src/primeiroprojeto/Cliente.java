package primeiroprojeto;

public class Cliente
{
    private String nome; 
    private int idade;
    private char sexo;
    
    private Cliente(String nome, int idade, char sexo)
    {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public int getIdade()
    {
        return idade;
    }
    
    public char getSexo()
    {
        return sexo;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }

}