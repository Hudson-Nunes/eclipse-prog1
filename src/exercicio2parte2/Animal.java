package exercicio2parte2;

public class Animal
{
    private String nome, raça;
    private char sexo;
    private int quantidadePatas;

    public Animal(String nome, String raça, char sexo, int quantidadePatas)
    {
        this.nome = nome;
        this.raça = raça;
        this.sexo = sexo;
        this.quantidadePatas = quantidadePatas;
    }

    public String getNome()
    {
        return nome;
    }
    
    public String getRaça()
    {
        return raça;
    }
    
    public char getSexo()
    {
        return sexo;
    }
    
    public int getQuantidadePatas()
    {
        return quantidadePatas;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setRaça(String raça)
    {
        this.raça = raça;
    }
    
    public void setSexo(char sexo)
    {
         this.sexo = sexo;
    }
    
    public void setQuantidadePatas(int quantidadePatas)
    {
        this.quantidadePatas = quantidadePatas;
    }
    
    public void imprimeInformacoes()
    {
        System.out.println("nome do animal: " + nome);
        System.out.println("raça do animal: " + raça);
        System.out.println("sexo do animal: " + sexo);
        System.out.println("quantidade de patas: " + quantidadePatas);
        System.out.println();
    }

}
