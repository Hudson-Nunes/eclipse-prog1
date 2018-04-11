package primeiroprojeto;

public class Cachorro
{
    private String nome, raca;
    private int idade;
    private double peso;
    private char sexo;
    
    public Cachorro(String novoNome, String novaRaca, int novaIdade, double novoPeso, char novoSexo)
    {
        this.nome = novoNome;
        this.raca = novaRaca;
        this.idade = novaIdade;
        this.peso = novoPeso;
        this.sexo = novoSexo;
    }
    
}