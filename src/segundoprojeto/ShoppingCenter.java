package segundoprojeto;

public class ShoppingCenter{
    private int numeroDeLojas, quantFuncionarios;
    private boolean estacionamento;

    //COMENTÁRIO DE UMA LINHA
    
    /*Comentário
     de 
     bloco (múltiplas linhas) */
    
    public ShoppingCenter(int novoNumeroDeLojas,
                          int novoQuantFuncionarios,
                          boolean novoEstacionamento){
        numeroDeLojas = novoNumeroDeLojas;
        quantFuncionarios = novoQuantFuncionarios;
        estacionamento = novoEstacionamento;
    }
    
    public int getNumeroDeLojas(){
        return numeroDeLojas;
    }
    
    public int getQuantFuncionarios(){
        return quantFuncionarios;
    }
    
    public boolean isEstacionamento(){
        return estacionamento;
    }
    
    public void setNumeroDeLojas(int novoNumeroDeLojas){
        numeroDeLojas = novoNumeroDeLojas;
    }
    
    public void setQuantFuncionarios(int novoQuantFuncionarios){
        quantFuncionarios = novoQuantFuncionarios;
    }
    
    public void setEstacionamento(boolean novoEstacionamento){
        estacionamento = novoEstacionamento; 
    }
}